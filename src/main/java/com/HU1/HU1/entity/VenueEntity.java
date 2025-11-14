package com.HU1.HU1.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueEntity {
    private Integer id;
    private String address;
    private int asistentEvent;


}
