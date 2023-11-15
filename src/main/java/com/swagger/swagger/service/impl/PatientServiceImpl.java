package com.swagger.swagger.service.impl;

import com.swagger.swagger.entity.Patient;
import com.swagger.swagger.repository.PatientRepository;
import com.swagger.swagger.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatentService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatientDetails() {
        return patientRepository.findAll();
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updateService(Patient patient, String id) {
        return patient;
    }


}
