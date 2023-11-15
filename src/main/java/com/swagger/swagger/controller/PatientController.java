package com.swagger.swagger.controller;

import com.swagger.swagger.entity.Patient;
import com.swagger.swagger.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patient")
public class PatientController {
    @Autowired
    PatentService patientService;

    @GetMapping("/details")
    public List<Patient> getAllPatientDetails(){
        return patientService.getAllPatientDetails();
    }

    @PostMapping("/create")
    public Patient createPatient(@RequestBody Patient patient){
        return  patientService.createPatient(patient);
    }

    @PutMapping("/update/{id}")
    public Patient updatePatient(@RequestBody Patient patient,@RequestParam String id){
        return patientService.updateService(patient,id);
    }


}
