package com.HU1.HU1.service.interfaces;

import com.HU1.HU1.dto.VenueDTO;

import java.util.List;

public interface IVenueService {

    VenueDTO create(VenueDTO dto);
    List<VenueDTO> findAll();
    VenueDTO findById(Integer id);
    VenueDTO update(Integer id, VenueDTO dto);
    void delete(Integer id);
}
