package com.example.hospitalreferralapi.DestinationHospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DestinationHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestinationHospitalApplication.class, args);
	}

}
