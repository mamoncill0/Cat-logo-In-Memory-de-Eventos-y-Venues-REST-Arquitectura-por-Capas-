package com.HU1.HU1.mapper;

import com.HU1.HU1.dto.EventDTO;
import com.HU1.HU1.entity.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventEntity toEntity(EventDTO dto) {
        EventEntity e = new EventEntity();
        e.setNameEvent(dto.getNameEvent());
        e.setStartTime(dto.getStartTime());
        e.setEndTime(dto.getEndTime());
        e.setDescription(dto.getDescription());
        e.setCapacity(dto.getCapacity());
        return e;
    }

    public EventDTO toDTO(EventEntity e) {
        EventDTO dto = new EventDTO();
        dto.setNameEvent(e.getNameEvent());
        dto.setStartTime(e.getStartTime());
        dto.setEndTime(e.getEndTime());
        dto.setDescription(e.getDescription());
        dto.setCapacity(e.getCapacity());
        return dto;
    }
}
