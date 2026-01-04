package com.healthify.opdservice.data;

import com.healthify.opdservice.entities.Patient;
import com.healthify.opdservice.util.UuidUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientData {
    public  List<Patient> patientData = new ArrayList<>();
    private static Logger logger = LoggerFactory.getLogger(PatientData.class);

    PatientData(){
        //add hardcoded data until db is impl
        Patient p1 = new Patient.Builder()
                .setId(UuidUtils.getnewUuid())
                .setName("Amit Kumar")
                .setEmail("amit.kumar@gmail.com")
                .setPhone(9876543210L)
                .setPatientDetails(null)
                .build();
        Patient p2 = new Patient.Builder()
                .setId(UuidUtils.getnewUuid())
                .setName("Neha Singh")
                .setEmail("neha.singh@gmail.com")
                .setPhone(9123456789L)
                .setPatientDetails(null)
                .build();


        Patient p3 = new Patient.Builder()
                .setId(UuidUtils.getnewUuid())
                .setName("Neha Singh")
                .setEmail("neha.singh@gmail.com")
                .setPhone(9123456789L)
                .setPatientDetails(null)
                .build();


        patientData.add(p1);
        patientData.add(p2);
        patientData.add(p3);
    }

    public String addPatientData(Patient data){
        //todo: impl this later, for now use hard coded data
        return null;
    }

    public List<PatientData> getAllPatientData(String id){
        //todo: impl this later, for now use hard coded data
        return null;
    }

    public String getPatientDataByName(String name){
        //todo: impl this later, for now use hard coded data
        logger.info("searching for: {}",name);
        return patientData.stream().filter(p -> p.getName().equals(name)).peek(p->p.getName()).map(p->p.getId()).findFirst().orElse("no such patient");
    }


}
