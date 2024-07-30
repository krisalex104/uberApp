package com.springweb.project.uberapp.strategies.impl;

import com.springweb.project.uberapp.dtos.RideRequestDto;
import com.springweb.project.uberapp.strategies.RideFairCalculationStrategy;

public class RideFairSurgePricingFareCalculationStrategy implements RideFairCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
