package com.HU1.HU1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueEntity {


    @Id
    private Integer id;
    private String name;
    private String address;
    private int asistentEvent;

    public VenueEntity(String name, String address, int asistentEvent) {
        this.name = name;
        this.address = address;
        this.asistentEvent = asistentEvent;
    }
}