package com.springweb.project.uberapp.strategies.impl;

import com.springweb.project.uberapp.dtos.RideRequestDto;
import com.springweb.project.uberapp.enities.Driver;
import com.springweb.project.uberapp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
