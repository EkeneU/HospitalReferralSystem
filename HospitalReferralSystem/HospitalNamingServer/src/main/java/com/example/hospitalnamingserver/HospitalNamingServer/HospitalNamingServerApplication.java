package com.example.hospitalnamingserver.HospitalNamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HospitalNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalNamingServerApplication.class, args);
	}

}
