package com.prathamsoni.project.uber.uberApp.strategies;

import com.prathamsoni.project.uber.uberApp.entities.Driver;
import com.prathamsoni.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
