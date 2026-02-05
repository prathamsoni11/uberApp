package com.prathamsoni.project.uber.uberApp.strategies.impl;

import com.prathamsoni.project.uber.uberApp.entities.RideRequest;
import com.prathamsoni.project.uber.uberApp.services.DistanceService;
import com.prathamsoni.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {

    private static final double SURGE_FACTOR = 2;
    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickUpLocation(),
                rideRequest.getDropOffLocation());

        return distance * RIDE_FARE_MULTIPLIER * SURGE_FACTOR;
    }
}
