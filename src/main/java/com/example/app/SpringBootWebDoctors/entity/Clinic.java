package com.example.app.SpringBootWebDoctors.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clinics")
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String img;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String descr;
    @Column(name = "address")
    private String adr;
}