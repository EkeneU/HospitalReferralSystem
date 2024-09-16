package com.example.hospitalreferralapi.DestinationHospital;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private int referralId;
    @Column(name = "destination_hospital_name")
    private String name;
    @OneToMany(mappedBy = "hospital", cascade = {CascadeType.ALL, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JsonManagedReference
    private List<Patient> patients;
    @Column(name = "ref_hosp_address")
    private String address;
    @Column(name = "referring_hospital_name")
    private String referringHospitalName;
    @Column(name = "referring_unit")
    private String referringUnit;
   // private boolean isBedSpaceAvailable;

    public Hospital(String name, String address, Patient patient, String referringHospitalName, String referringUnit) {
        this.name = name;
        this.address = address;

        patients = new ArrayList<>();
        patients.add(patient);

        patient.setHospital(this);
        this.referringHospitalName = referringHospitalName;
        this.referringUnit = referringUnit;
    }
    public Hospital() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getReferralId() {
        return referralId;
    }

    public void setReferralId(int referralId) {
        this.referralId = referralId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferringHospitalName() {
        return referringHospitalName;
    }

    public void setReferringHospitalName(String referringHospitalName) {
        this.referringHospitalName = referringHospitalName;
    }

    public String getReferringUnit() {
        return referringUnit;
    }

    public void setReferringUnit(String referringUnit) {
        this.referringUnit = referringUnit;
    }

//    public boolean isBedSpaceAvailable() {
//        return isBedSpaceAvailable;
//    }
//
//    public void setBedSpaceAvailable(boolean bedSpaceAvailable) {
//        isBedSpaceAvailable = bedSpaceAvailable;
//    }


    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
