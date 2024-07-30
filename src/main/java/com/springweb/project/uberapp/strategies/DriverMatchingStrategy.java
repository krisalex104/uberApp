package com.springweb.project.uberapp.strategies;

import com.springweb.project.uberapp.dtos.RideRequestDto;
import com.springweb.project.uberapp.enities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
