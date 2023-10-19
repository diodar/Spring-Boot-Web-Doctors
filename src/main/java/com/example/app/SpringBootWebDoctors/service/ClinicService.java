package com.example.app.SpringBootWebDoctors.service;

import com.example.app.SpringBootWebDoctors.entity.Clinic;
import com.example.app.SpringBootWebDoctors.repository.ClinicRepository;
import com.example.app.SpringBootWebDoctors.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ClinicService {

    @Autowired
    ClinicRepository repository;

    public List<Clinic> getClinic() {
        Iterable<Clinic> iterable = repository.findAll();
        List<Clinic> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(clinic -> new Clinic(clinic.getId(),
                                Constants.URL_IMAGES + clinic.getImg(),
                                clinic.getName(),
                                clinic.getDescr(),
                                clinic.getAdr()))
                        .toList();
        return new ArrayList<>(list);
    }
}