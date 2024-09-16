package com.project.hospital.HospitalApiGateway.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import reactor.util.annotation.NonNull;

import java.io.IOException;


//@Component
//@RequiredArgsConstructor
//public class HospitalAuthenticationFilter extends OncePerRequestFilter {
//    private final JwtService jwtService;
//
//    @Override
//    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain)
//            throws ServletException, IOException {
//
//        // Header that contains the JWT or Bearer token or Web token
//        final String authHeader = request.getHeader("Authorization");
//        final String jwt;
//        final String userEmail;
//        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//        jwt = authHeader.substring(7);
//        userEmail = jwtService.extractUsername(jwt);
//
//
//
//
//    }
//}
