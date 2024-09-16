package com.example.hospitalreferralapi.DestinationHospital;

import java.util.List;

public interface HospitalService {
    Hospital findById(int id);
    List<Hospital> findAll();
}
