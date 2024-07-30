package com.springweb.project.uberapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.PrimitiveIterator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DriverDto {

    private UserDto user;
    private Double rating;

}
