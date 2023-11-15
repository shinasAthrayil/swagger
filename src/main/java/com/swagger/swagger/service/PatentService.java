package com.swagger.swagger.service;

import com.swagger.swagger.entity.Patient;

import java.util.List;

public interface PatentService {
    List<Patient> getAllPatientDetails();

    Patient createPatient(Patient patient);

    Patient updateService(Patient patient, String id);


}
