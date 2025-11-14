package com.HU1.HU1.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {
    private Integer id;
    private String nameEvent;
    private String description;
    private int capacity;


}
