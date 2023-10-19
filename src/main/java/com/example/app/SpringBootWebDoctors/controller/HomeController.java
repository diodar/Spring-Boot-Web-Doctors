package com.example.app.SpringBootWebDoctors.controller;

import com.example.app.SpringBootWebDoctors.service.DoctorService;
import com.example.app.SpringBootWebDoctors.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Autowired
    ClinicService clinicService;
    @Autowired
    DoctorService doctorService;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("clinics", clinicService.getClinic());
        model.addAttribute("doctors", doctorService.getDoctor());
        return "home";
    }
}