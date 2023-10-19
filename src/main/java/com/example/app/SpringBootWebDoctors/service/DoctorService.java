package com.example.app.SpringBootWebDoctors.service;

import com.example.app.SpringBootWebDoctors.entity.Doctor;
import com.example.app.SpringBootWebDoctors.repository.DoctorRepository;
import com.example.app.SpringBootWebDoctors.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public List<Doctor> getDoctor() {
        Iterable<Doctor> iterable = repository.findAll();
        List<Doctor> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(doctor -> new Doctor(doctor.getId(),
                                Constants.URL_IMAGES + doctor.getImg(),
                                doctor.getName(),
                                doctor.getSpec(),
                                doctor.getPhone()))
                        .toList();
        return new ArrayList<>(list);
    }
}