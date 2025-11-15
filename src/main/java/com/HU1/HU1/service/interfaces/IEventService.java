package com.HU1.HU1.service.interfaces;

import com.HU1.HU1.dto.EventDTO;

import java.util.List;

public interface IEventService {
    EventDTO create(EventDTO dto);
    List<EventDTO> findAll();
    EventDTO findById(Integer id);
    EventDTO update(Integer id, EventDTO dto);
    void delete(Integer id);
}

