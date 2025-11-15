package com.HU1.HU1.repository;

import com.HU1.HU1.entity.EventEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {

    private final List<EventEntity> storage = new ArrayList<>();

    public List<EventEntity> findAll() {
        return storage;
    }

    public Optional<EventEntity> findById(Integer id) {
        return storage.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public EventEntity save(EventEntity event) {
        storage.removeIf(e -> e.getId().equals(event.getId()));
        storage.add(event);
        return event;
    }

    public boolean delete(Integer id) {
        return storage.removeIf(e -> e.getId().equals(id));
    }
}
