package com.swagger.swagger.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="patient")
public class Patient {

    @Id
    @Column(name = "patient_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    String patientId;

    @Column(name = "patient_name")
    String patientName;

    @Column(name = "patient_age")
    int patientAge;

    @Column(name = "patient_address")
    String patientAddress;

    @Column(name = "doctor")
    String doctor;
}
