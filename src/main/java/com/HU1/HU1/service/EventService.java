package com.HU1.HU1.service;

import com.HU1.HU1.dto.EventDTO;
import com.HU1.HU1.entity.EventEntity;
import com.HU1.HU1.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventService {


    @Autowired
    private EventRepository repository;


    public List<EventDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }


    public Optional<EventDTO> getById(Integer id) {
        return repository.findById(id).map(this::toDTO);
    }


    public EventDTO create(EventDTO dto) {
        return toDTO(repository.save(toEntity(dto)));
    }


    public Optional<EventDTO> update(Integer id, EventDTO dto) {
        if (repository.findById(id).isPresent()) {
            return Optional.of(toDTO(repository.save(toEntity(dto))));
        }
        return Optional.empty();
    }


    public boolean delete(Integer id) { return repository.delete(id); }


    private EventDTO toDTO(EventEntity e) {
        EventDTO dto = new EventDTO();
        dto.setNameEvent(e.getNameEvent());
        dto.setStartTime(e.getStartTime());
        dto.setEndTime(e.getEndTime());
        dto.setDescription(e.getDescription());
        dto.setCapacity(e.getCapacity());
        return dto;
    }


    private EventEntity toEntity(EventDTO dto) {
        return new EventEntity(
                dto.getNameEvent(),
                dto.getStartTime(),
                dto.getEndTime(),
                dto.getDescription(),
                dto.getCapacity()
        );
    }
}