package com.springweb.project.uberapp.dtos;

import com.springweb.project.uberapp.enities.Driver;
import com.springweb.project.uberapp.enities.Rider;
import com.springweb.project.uberapp.enities.enums.PaymentMethod;
import com.springweb.project.uberapp.enities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideDto {

    private Long id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private  LocalDateTime startedAt;

    private  LocalDateTime endedAt;
}
