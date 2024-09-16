package com.example.security.HospitalSecurityReloaded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HospitalSecurityReloadedApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalSecurityReloadedApplication.class, args);
	}

}
