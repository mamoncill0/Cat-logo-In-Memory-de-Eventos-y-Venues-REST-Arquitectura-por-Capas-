package com.HU1.HU1.entity;


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

    public EventEntity(String nameEvent, LocalDateTime startTime, LocalDateTime endTime,
                       String description, int capacity) {
        this.nameEvent = nameEvent;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.capacity = capacity;
    }
}