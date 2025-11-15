package com.HU1.HU1.service;

import com.HU1.HU1.dto.VenueDTO;
import com.HU1.HU1.entity.VenueEntity;
import com.HU1.HU1.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VenueService {

    private final VenueRepository repository;

    public VenueService(VenueRepository repository) {
        this.repository = repository;
    }

    private int generateId() {
        return repository.findAll().size() + 1;
    }

    public List<VenueDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Optional<VenueDTO> getById(Integer id) {
        return repository.findById(id).map(this::toDTO);
    }

    public VenueDTO create(VenueDTO dto) {
        VenueEntity entity = toEntity(dto);
        entity.setId(generateId());
        return toDTO(repository.save(entity));
    }

    public Optional<VenueDTO> update(Integer id, VenueDTO dto) {
        return repository.findById(id).map(existing -> {
            existing.setName(dto.getName());
            existing.setAddress(dto.getAddress());
            existing.setAsistentEvent(dto.getAsistentEvent());
            return toDTO(repository.save(existing));
        });
    }

    public boolean delete(Integer id) {
        return repository.delete(id);
    }

    private VenueDTO toDTO(VenueEntity e) {
        VenueDTO dto = new VenueDTO();
        dto.setId(e.getId());
        dto.setName(e.getName());
        dto.setAddress(e.getAddress());
        dto.setAsistentEvent(e.getAsistentEvent());
        return dto;
    }

    private VenueEntity toEntity(VenueDTO dto) {
        VenueEntity entity = new VenueEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setAsistentEvent(dto.getAsistentEvent());
        return entity;
    }
}