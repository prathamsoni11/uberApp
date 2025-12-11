package com.prathamsoni.project.uber.uberApp.services.impl;

import com.prathamsoni.project.uber.uberApp.dto.DriverDto;
import com.prathamsoni.project.uber.uberApp.dto.SignupDto;
import com.prathamsoni.project.uber.uberApp.dto.UserDto;
import com.prathamsoni.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
