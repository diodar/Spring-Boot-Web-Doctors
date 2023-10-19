package com.example.app.SpringBootWebDoctors.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String img;
    @Column(name = "name")
    private String name;
    @Column(name = "specialization")
    private String spec;
    @Column(name = "phone")
    private String phone;
}