package com.example.hospitalreferralapi.ReferringHospital;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @Column(name = "referring_hospital_name")
    private String referringHospitalName;
    @OneToMany(mappedBy = "hospital" , cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JsonManagedReference
    private List<Patient> patients;
    @Column(name = "ref_hosp_address")
    private String address;
    @Column(name = "destination_hospital_name")
    private String destinationHospital;
    @Column(name = "referring_unit")
    private String referringUnit;
  //  private boolean isBedSpaceAvailable;

    public Hospital(String referringHospitalName, Patient patient, String address, String destinationHospital, String referringUnit) {
        this.referringHospitalName = referringHospitalName;
        patients = new ArrayList<>();
        patients.add(patient);

        patient.setHospital(this);

        this.address = address;
        this.referringUnit = referringUnit;
        this.destinationHospital = destinationHospital;
    }

    public Hospital() {
    }

    public int getReferralId() {
        return referralId;
    }

    public void setReferralId(int referralId) {
        this.referralId = referralId;
    }

    public String getReferringHospitalName() {
        return referringHospitalName;
    }

    public void setReferringHospitalName(String referringHospitalName) {
        this.referringHospitalName = referringHospitalName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReferringUnit() {
        return referringUnit;
    }

    public void setReferringUnit(String referringUnit) {
        this.referringUnit = referringUnit;
    }

    public String getDestinationHospital() {
        return destinationHospital;
    }

    public void setDestinationHospital(String destinationHospital) {
        this.destinationHospital = destinationHospital;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

//    public boolean isBedSpaceAvailable() {
//        return isBedSpaceAvailable;
//    }
//
//    public void setBedSpaceAvailable(boolean bedSpaceAvailable) {
//        isBedSpaceAvailable = bedSpaceAvailable;
//    }
}
