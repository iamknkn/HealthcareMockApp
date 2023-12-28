package com.example.HealthCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicureApplication {

//	@Bean
//	@Primary
//	public MedicureService getDoctorService() {
//		return new MedicureService();
//	}
//
	public static void main(String[] args) {
		SpringApplication.run(MedicureApplication.class, args);
	}

}
