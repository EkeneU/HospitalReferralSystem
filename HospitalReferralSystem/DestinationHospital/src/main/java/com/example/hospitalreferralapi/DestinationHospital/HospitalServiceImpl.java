package com.example.hospitalreferralapi.DestinationHospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {
    private HospitalRepository hospitalRepository;

    private Hospital hospital;
    private Patient patient;
    @Autowired
    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public Hospital findById(int id) {
        Optional<Hospital> result = hospitalRepository.findById(id);
        Hospital hospital;
        if (result.isPresent()) {
            hospital = result.get();
        }
        else {
            throw new RuntimeException("ID not found or incompatible" + id);
        }
        return hospital;
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }
}
