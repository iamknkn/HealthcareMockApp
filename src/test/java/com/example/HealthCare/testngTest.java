package com.example.HealthCare;
import com.example.HealthCare.controller.MedicureController;
import com.example.HealthCare.models.Doctor;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testngTest {

    MedicureController doctorService = new MedicureController();

    @Test
    void setUp() {
        System.out.println("Starting test run");
    }

    @Test
    void testService() {
        assertEquals(doctorService.sayHello(), "Hello from Doctor Naveen");
    }

    @Test
    void testRegisterDoctor() {
        Doctor doctor = new Doctor("MP1110","Shubham","Neurologist","15 Years");
        assertEquals(doctor.getDoctorRegistrationId(), doctorService.registerDummyDoctor());
    }

    @Test
    void tearDown() {
        System.out.println("Ending test run");
    }
}
