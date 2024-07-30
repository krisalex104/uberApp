package com.springweb.project.uberapp.strategies;

import com.springweb.project.uberapp.dtos.RideRequestDto;

public interface RideFairCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
