package com.springweb.project.uberapp.services;

import com.springweb.project.uberapp.dtos.RideRequestDto;
import com.springweb.project.uberapp.enities.Driver;
import com.springweb.project.uberapp.enities.Ride;
import com.springweb.project.uberapp.enities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);
    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);


}
