package com.springweb.project.uberapp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src,Point dest);
}
