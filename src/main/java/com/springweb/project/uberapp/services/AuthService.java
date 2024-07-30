package com.springweb.project.uberapp.services;

import com.springweb.project.uberapp.dtos.DriverDto;
import com.springweb.project.uberapp.dtos.SignUpDto;
import com.springweb.project.uberapp.dtos.UserDto;

public interface AuthService {

    String login(String email,String password);
    UserDto signUp(SignUpDto signUpDto);

    DriverDto onboardNewDriver(Long userId);
}
