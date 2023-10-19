package com.example.app.SpringBootWebDoctors.repository;

import com.example.app.SpringBootWebDoctors.entity.Clinic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepository extends CrudRepository<Clinic, Integer> {
}