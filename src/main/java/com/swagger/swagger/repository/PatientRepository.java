package com.swagger.swagger.repository;

import com.swagger.swagger.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
public interface PatientRepository extends JpaRepository<Patient,String> {
//    @Query(value = "update patient_name from patient u where u.patient_id=id",nativeQuery = true)
//    Patient updatePatient(Patient patient, String id);
}
