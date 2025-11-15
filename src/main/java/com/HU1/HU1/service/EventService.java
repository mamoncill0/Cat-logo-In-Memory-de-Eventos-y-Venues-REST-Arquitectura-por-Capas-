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

    // 🔥 Generador simple de IDs
    private int generateId() {
        return repository.findAll().size() + 1;
    }

    public List<EventDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Optional<EventDTO> getById(Integer id) {
        return repository.findById(id).map(this::toDTO);
    }

    public EventDTO create(EventDTO dto) {
        EventEntity entity = toEntity(dto);
        entity.setId(generateId());
        return toDTO(repository.save(entity));
    }

    public Optional<EventDTO> update(Integer id, EventDTO dto) {
        return repository.findById(id).map(existing -> {
            existing.setNameEvent(dto.getNameEvent());
            existing.setStartTime(dto.getStartTime());
            existing.setEndTime(dto.getEndTime());
            existing.setDescription(dto.getDescription());
            existing.setCapacity(dto.getCapacity());
            return toDTO(repository.save(existing));
        });
    }

    public boolean delete(Integer id) {
        return repository.delete(id);
    }

    private EventDTO toDTO(EventEntity e) {
        EventDTO dto = new EventDTO();
        dto.setId(e.getId());
        dto.setNameEvent(e.getNameEvent());
        dto.setStartTime(e.getStartTime());
        dto.setEndTime(e.getEndTime());
        dto.setDescription(e.getDescription());
        dto.setCapacity(e.getCapacity());
        return dto;
    }

    private EventEntity toEntity(EventDTO dto) {
        EventEntity entity = new EventEntity();
        entity.setId(dto.getId());
        entity.setNameEvent(dto.getNameEvent());
        entity.setStartTime(dto.getStartTime());
        entity.setEndTime(dto.getEndTime());
        entity.setDescription(dto.getDescription());
        entity.setCapacity(dto.getCapacity());
        return entity;
    }
}