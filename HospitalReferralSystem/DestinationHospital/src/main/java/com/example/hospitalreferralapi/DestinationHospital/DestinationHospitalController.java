package com.example.hospitalreferralapi.DestinationHospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DestinationHospitalController {
    private HospitalService hospitalService;
    @Autowired
    public DestinationHospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/hospital/{referringHospital}")
    public Hospital retrieveConsult(@PathVariable int id){
        Hospital hospital = hospitalService.findById(id);

        if (hospital==null) {
            throw new RuntimeException("ID not found" + id);
        }
        else {
            return hospital;
        }
    }
    @GetMapping("/hospital_consults")
    public List<Hospital> retrieveAllConsults(){
        return hospitalService.findAll();
    }
}
