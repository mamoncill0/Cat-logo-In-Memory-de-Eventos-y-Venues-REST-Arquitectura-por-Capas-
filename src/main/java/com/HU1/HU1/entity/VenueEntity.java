package com.HU1.HU1.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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

}