package com.example.hospitalreferralapi.ReferringHospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReferringHospitalController {
    private HospitalService service;


    @Autowired
    public ReferringHospitalController(HospitalService service) {
        this.service = service;
    }

    @PostMapping("/hospital/refer_patient")
    public ResponseEntity<Hospital> sendConsult(@RequestBody Hospital hospital) {
        Hospital savedHospital = service.save(hospital);
        return ResponseEntity.ok(savedHospital);
    }

    @DeleteMapping("/hospital/delete_consult")
    public void deleteConsult (@PathVariable Hospital hospital_id) {
        int id = hospital_id.getReferralId();
        if (id <= 0) {
            System.out.println("Sorry, there is no such record on our database");
        }
        else {
            service.deleteById(id);
        }
    }
}
