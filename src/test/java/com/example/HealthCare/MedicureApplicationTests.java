package com.example.HealthCare;

import com.example.HealthCare.controller.MedicureController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MedicureApplicationTests {

	@Autowired
	MedicureController doctorService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testService() {
	  assertEquals(doctorService.sayHello(), "Hello from Doctor Naveen");
	}
}
