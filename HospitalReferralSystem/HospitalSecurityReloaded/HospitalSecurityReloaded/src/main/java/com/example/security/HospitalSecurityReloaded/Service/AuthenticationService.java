package com.example.security.HospitalSecurityReloaded.Service;

import com.example.security.HospitalSecurityReloaded.Entity.HospitalUser;
import com.example.security.HospitalSecurityReloaded.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtService jwtService;

    public String saveUser(HospitalUser user) {
        user.setUser_password(passwordEncoder.encode(user.getUser_password()));
        hospitalRepository.save(user);
        return "user added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }

}
