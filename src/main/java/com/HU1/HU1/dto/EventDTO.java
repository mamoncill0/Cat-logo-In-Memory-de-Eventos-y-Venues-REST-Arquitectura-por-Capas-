package com.HU1.HU1.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDateTime;


@Data
public class EventDTO {

    private Integer id;

    @NotBlank(message = "Event name cannot be empty")
    private String nameEvent;


    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;


    @NotNull(message = "End time is required")
    private LocalDateTime endTime;


    private String description;


    @Min(value = 1, message = "Capacity must be at least 1")
    private int capacity;
}