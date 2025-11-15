package com.HU1.HU1.repository;

import com.HU1.HU1.entity.VenueEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {

    private final List<VenueEntity> storage = new ArrayList<>();

    public List<VenueEntity> findAll() {
        return storage;
    }

    public Optional<VenueEntity> findById(Integer id) {
        return storage.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public VenueEntity save(VenueEntity venue) {
        storage.removeIf(e -> e.getId().equals(venue.getId()));
        storage.add(venue);
        return venue;
    }

    public boolean delete(Integer id) {
        return storage.removeIf(e -> e.getId().equals(id));
    }
}