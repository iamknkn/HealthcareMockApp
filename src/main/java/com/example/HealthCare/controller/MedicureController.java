package com.example.HealthCare.controller;

import com.example.HealthCare.dao.MedicureRepository;
import com.example.HealthCare.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MedicureController {

	@Autowired
	private MedicureRepository doctorRepository;

    @GetMapping
    public String sayHello() {
        return "Hello from Doctor Naveen";
    }


//    @PostMapping("/createDoctor")
//    public String createDoctor() {
//		Doctor doctor = new Doctor("MP1110","Shubham","Neurologist","15 Years");
//		doctorRepository.save(doctor);
//        return "Created new doctor";
//    }

    @PostMapping("/registerDoctor")
    public String registerDoctor(@RequestBody Doctor doctor) {
        doctorRepository.save(doctor);
        return "Registered given doctor";
    }

    @PutMapping("/updateDoctor")
    public String updateDoctor(@RequestBody Doctor doctor) {
        doctorRepository.save(doctor);
        return "Updated doctor details";
    }

    @GetMapping("/getDoctor/{doctorRegistrationId}")
    public Doctor getDoctor(@PathVariable String doctorRegistrationId) {
        return doctorRepository.findAllById(Collections.singleton(doctorRegistrationId)).get(0);
    }

    @GetMapping("/getAll")
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @GetMapping("/searchDoctor/{doctorName}")
    public List<Doctor> searchDoctor(@PathVariable String doctorName) {
        return getAllDoctors().stream().filter(doc -> doc.getDoctorName().contains(doctorName)).collect(Collectors.toList());
    }

    @DeleteMapping("/deleteDoctor/{doctorRegistrationId}")
    public String deleteDoctor(@PathVariable String doctorRegistrationId) {
        doctorRepository.delete(doctorRepository.getOne(doctorRegistrationId));
        return "Deleted doctor with id: "+doctorRegistrationId;
    }

	public String registerDummyDoctor() {
		Doctor doctor = new Doctor("MP1110","Shubham","Neurologist","15 Years");
		return "MP1110";
	}


}
