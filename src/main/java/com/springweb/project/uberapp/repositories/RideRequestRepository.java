package com.springweb.project.uberapp.repositories;

import com.springweb.project.uberapp.enities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}
