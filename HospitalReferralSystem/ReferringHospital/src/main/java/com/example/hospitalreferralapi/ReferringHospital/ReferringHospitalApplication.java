package com.example.hospitalreferralapi.ReferringHospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReferringHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferringHospitalApplication.class, args);
	}

}
