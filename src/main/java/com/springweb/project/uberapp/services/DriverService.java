package com.springweb.project.uberapp.services;

import com.springweb.project.uberapp.dtos.DriverDto;
import com.springweb.project.uberapp.dtos.RideDto;
import com.springweb.project.uberapp.dtos.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto rateRider(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RiderDto> getAllMyRides();

}
