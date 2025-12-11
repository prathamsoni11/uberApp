package com.prathamsoni.project.uber.uberApp.strategies;

import com.prathamsoni.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
