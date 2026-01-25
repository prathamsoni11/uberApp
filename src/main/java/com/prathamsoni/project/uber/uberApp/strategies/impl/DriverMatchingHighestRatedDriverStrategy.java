package com.prathamsoni.project.uber.uberApp.strategies.impl;

import com.prathamsoni.project.uber.uberApp.entities.Driver;
import com.prathamsoni.project.uber.uberApp.entities.RideRequest;
import com.prathamsoni.project.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
