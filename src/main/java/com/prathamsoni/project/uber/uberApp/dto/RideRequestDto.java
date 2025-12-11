package com.prathamsoni.project.uber.uberApp.dto;

import com.prathamsoni.project.uber.uberApp.entities.enums.PaymentMethod;
import com.prathamsoni.project.uber.uberApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;

}
