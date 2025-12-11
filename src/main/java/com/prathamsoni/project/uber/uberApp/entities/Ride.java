package com.prathamsoni.project.uber.uberApp.entities;

import com.prathamsoni.project.uber.uberApp.entities.enums.PaymentMethod;
import com.prathamsoni.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
public class Ride {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToAny(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToAny(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private String otp;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
