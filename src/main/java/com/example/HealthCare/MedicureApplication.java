package com.example.HealthCare;

import com.example.HealthCare.controller.MedicureController;
import com.example.HealthCare.dao.MedicureRepository;
import com.example.HealthCare.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicureApplication {


	public static void main(String[] args) {
		SpringApplication.run(MedicureApplication.class, args);
	}


	/* TODO: Use this if you wish to use autowired controller from here and preload some data

	private static MedicureController doctorRepository;

	@Autowired
	public MedicureApplication(MedicureController mc) {
		MedicureApplication.doctorRepository = mc;
	}

	public static void main(String[] args) {
		SpringApplication.run(MedicureApplication.class, args);
		doctorRepository.registerDoctor(new Doctor("AP297", "Manoj", "Neuro", "10 Years"));
		doctorRepository.registerDoctor(new Doctor("MH097", "Jack", "Nephro", "12 Years"));
		doctorRepository.registerDoctor(new Doctor("TN7t8", "Chan", "Psych", "25 Years"));
	}
	 */
}
