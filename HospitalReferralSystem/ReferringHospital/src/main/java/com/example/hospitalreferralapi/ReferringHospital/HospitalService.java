package com.example.hospitalreferralapi.ReferringHospital;


import java.util.List;

public interface HospitalService {

    void deleteById(int id);

    Hospital save(Hospital hospital);

}
