package com.HU1.HU1.mapper;

import com.HU1.HU1.dto.VenueDTO;
import com.HU1.HU1.entity.VenueEntity;
import org.springframework.stereotype.Component;

@Component
public class VenueMapper {

    public VenueEntity toEntity(VenueDTO dto) {
        VenueEntity e = new VenueEntity();
        e.setName(dto.getName());
        e.setAddress(dto.getAddress());
        e.setAsistentEvent(dto.getAsistentEvent());
        return e;
    }

    public VenueDTO toDTO(VenueEntity e) {
        VenueDTO dto = new VenueDTO();
        dto.setName(e.getName());
        dto.setAddress(e.getAddress());
        dto.setAsistentEvent(e.getAsistentEvent());
        return dto;
    }
}