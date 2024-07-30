package com.springweb.project.uberapp.services;

import com.springweb.project.uberapp.dtos.RideDto;
import com.springweb.project.uberapp.dtos.RideRequestDto;
import com.springweb.project.uberapp.dtos.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);
    RideDto rateDriver(Long rideId,Integer rating);

    RiderDto getMyProfile();

    List<RiderDto> getAllMyRides();
}
