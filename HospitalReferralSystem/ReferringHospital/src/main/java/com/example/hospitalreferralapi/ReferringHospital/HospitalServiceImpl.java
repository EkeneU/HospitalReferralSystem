package com.example.hospitalreferralapi.ReferringHospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {
    private HospitalRepository hospitalRepository;
    @Autowired
    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository=hospitalRepository;

    }
    @Override
    public void deleteById(int id) {
        hospitalRepository.deleteById(id);
    }

    @Override

    public Hospital save(Hospital hospital) {
        for (Patient patient : hospital.getPatients()){
            patient.setHospital(hospital);
        }
        return hospitalRepository.save(hospital);
    }
}
