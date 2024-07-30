package com.springweb.project.uberapp.repositories;

import com.springweb.project.uberapp.enities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride,Long> {
}
