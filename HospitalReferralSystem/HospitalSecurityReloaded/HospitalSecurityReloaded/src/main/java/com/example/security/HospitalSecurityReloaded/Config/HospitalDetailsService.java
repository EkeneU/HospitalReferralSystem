package com.example.security.HospitalSecurityReloaded.Config;

import com.example.security.HospitalSecurityReloaded.Entity.HospitalUser;
import com.example.security.HospitalSecurityReloaded.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HospitalDetailsService implements UserDetailsService {

    @Autowired
    public HospitalRepository hospitalRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Optional<HospitalUser> repositoryOptional = hospitalRepository.findByEmail(email);
        return repositoryOptional.map(HospitalUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("Inputed user not found with email : " + email));
    }
}
