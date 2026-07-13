package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.AuthenticationResponse;
import com.cognizant.spring_learn.service.JwtService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            Principal principal) {

        String token =
                jwtService.generateToken(principal.getName());

        return new AuthenticationResponse(token);
    }

}