package com.prathamsoni.project.uber.uberApp.strategies.impl;

import com.prathamsoni.project.uber.uberApp.dto.RideRequestDto;
import com.prathamsoni.project.uber.uberApp.entities.Driver;
import com.prathamsoni.project.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
