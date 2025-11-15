package com.HU1.HU1.service;

import com.HU1.HU1.dto.VenueDTO;
import com.HU1.HU1.entity.VenueEntity;
import com.HU1.HU1.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VenueService {


    @Autowired
    private VenueRepository repository;


    public List<VenueDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }


    public Optional<VenueDTO> getById(Integer id) {
        return repository.findById(id).map(this::toDTO);
    }


    public VenueDTO create(VenueDTO dto) {
        return toDTO(repository.save(toEntity(dto)));
    }


    public Optional<VenueDTO> update(Integer id, VenueDTO dto) {
        if (repository.findById(id).isPresent()) {
            return Optional.of(toDTO(repository.save(toEntity(dto))));
        }
        return Optional.empty();
    }


    public boolean delete(Integer id) { return repository.delete(id); }


    private VenueDTO toDTO(VenueEntity e) {
        VenueDTO dto = new VenueDTO();
        dto.setName(e.getName());
        dto.setAddress(e.getAddress());
        dto.setAsistentEvent(e.getAsistentEvent());
        return dto;
    }


    private VenueEntity toEntity(VenueDTO dto) {
        return new VenueEntity(
                dto.getName(),
                dto.getAddress(),
                dto.getAsistentEvent()
        );
    }
}