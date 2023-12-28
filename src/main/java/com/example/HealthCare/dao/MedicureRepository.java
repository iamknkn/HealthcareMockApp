package com.example.HealthCare.dao;

import com.example.HealthCare.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicureRepository extends JpaRepository<Doctor,String>{

}
