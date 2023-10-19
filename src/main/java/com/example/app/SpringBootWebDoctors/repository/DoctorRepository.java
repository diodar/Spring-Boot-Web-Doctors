package com.example.app.SpringBootWebDoctors.repository;

import com.example.app.SpringBootWebDoctors.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
}