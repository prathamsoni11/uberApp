package com.prathamsoni.project.uber.uberApp.services;

import com.prathamsoni.project.uber.uberApp.dto.DriverDto;
import com.prathamsoni.project.uber.uberApp.dto.SignupDto;
import com.prathamsoni.project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signUp(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
