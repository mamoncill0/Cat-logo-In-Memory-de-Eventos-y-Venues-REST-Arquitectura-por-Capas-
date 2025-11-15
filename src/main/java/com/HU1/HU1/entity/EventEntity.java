package com.HU1.HU1.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {

    @Id
    private Integer id;
    private String nameEvent;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private int capacity;

}