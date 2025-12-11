package com.prathamsoni.project.uber.uberApp.strategies;

import com.prathamsoni.project.uber.uberApp.dto.RideRequestDto;
import com.prathamsoni.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
