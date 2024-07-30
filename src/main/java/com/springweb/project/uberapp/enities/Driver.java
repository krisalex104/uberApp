package com.springweb.project.uberapp.enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Boolean available;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;
}
