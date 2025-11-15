package com.HU1.HU1.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class VenueDTO {


    @NotBlank(message = "Venue name cannot be empty")
    private String name;


    @NotBlank(message = "Address cannot be empty")
    private String address;


    @Min(value = 0, message = "Assistant number cannot be negative")
    private int asistentEvent;


}