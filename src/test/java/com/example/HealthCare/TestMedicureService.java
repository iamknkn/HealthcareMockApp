package com.example.HealthCare;

import com.example.HealthCare.controller.MedicureController;
import com.example.HealthCare.models.Doctor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestMedicureService {
	
	@Autowired
	MedicureController doctorService;
	
	@Test
	public void testRegisterDoctor() {
		Doctor doctor = new Doctor("MP1110","Shubham","Neurologist","15 Years");
		assertEquals(doctor.getDoctorRegistrationId(), doctorService.registerDummyDoctor());
	}

}
