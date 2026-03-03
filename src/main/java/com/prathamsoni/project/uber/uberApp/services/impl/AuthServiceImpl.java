package com.prathamsoni.project.uber.uberApp.services.impl;

import com.prathamsoni.project.uber.uberApp.dto.DriverDto;
import com.prathamsoni.project.uber.uberApp.dto.SignupDto;
import com.prathamsoni.project.uber.uberApp.dto.UserDto;
import com.prathamsoni.project.uber.uberApp.entities.Driver;
import com.prathamsoni.project.uber.uberApp.entities.User;
import com.prathamsoni.project.uber.uberApp.entities.enums.Role;
import com.prathamsoni.project.uber.uberApp.exceptions.ResourceNotFoundException;
import com.prathamsoni.project.uber.uberApp.exceptions.RuntimeConflictException;
import com.prathamsoni.project.uber.uberApp.repositories.UserRepository;
import com.prathamsoni.project.uber.uberApp.services.AuthService;
import com.prathamsoni.project.uber.uberApp.services.DriverService;
import com.prathamsoni.project.uber.uberApp.services.RiderService;
import com.prathamsoni.project.uber.uberApp.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

import static com.prathamsoni.project.uber.uberApp.entities.enums.Role.DRIVER;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;
    private final WalletService walletService;
    private final DriverService driverService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    @Transactional
    public UserDto signUp(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if (user != null) {
            throw new RuntimeConflictException("Cannot signup, User already exists with email " + signupDto.getEmail());
        }

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

        riderService.createNewRider(savedUser);
        walletService.createNewWallet(savedUser);

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId, String vehicleId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));

        if (user.getRoles().contains(DRIVER))
            throw new RuntimeConflictException("User with id " + userId + " is already a Driver");

        Driver createdDriver = Driver.builder()
                .user(user)
                .rating(0.0)
                .vehicleId(vehicleId)
                .available(true)
                .build();

        user.getRoles().add(DRIVER);
        userRepository.save(user);
        Driver savedDriver = driverService.createNewDriver(createdDriver);
        return modelMapper.map(savedDriver, DriverDto.class);
    }
}
