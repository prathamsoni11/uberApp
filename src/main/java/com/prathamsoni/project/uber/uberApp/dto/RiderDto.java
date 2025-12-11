package com.prathamsoni.project.uber.uberApp.dto;

import com.prathamsoni.project.uber.uberApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiderDto {

    private User user;
    private Double rating;
}
