package com.healthify.opdservice.dataLayer;

import com.healthify.opdservice.entities.Doctor;
import com.healthify.opdservice.enums.Constants;
import com.healthify.opdservice.util.UuidUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class DoctorData {
    String defaultDoc = UuidUtils.getnewUuid();
    public List<Doctor> doctorData = new ArrayList<>();

    DoctorData(){
        //add hardcoded data until db is impl
        Doctor d1 = new Doctor.Builder().setUuid(UuidUtils.getnewUuid()).setHospitalUuid(Constants.HOSPITAL_UUID.name()).setSpecialization("ENT").setJoiningTime(LocalDate.of(2020, Month.JANUARY, 18).atTime(12,00,00,00)).setName("Raj").build();
        Doctor d2 = new Doctor.Builder().setUuid(defaultDoc).setHospitalUuid(Constants.HOSPITAL_UUID.name()).setSpecialization("MD").setJoiningTime(LocalDate.of(2021, Month.JANUARY, 18).atTime(12,00,00,00)).setName("Ram").build();
        Doctor d3 = new Doctor.Builder().setUuid(UuidUtils.getnewUuid()).setHospitalUuid(Constants.HOSPITAL_UUID.name()).setSpecialization("Neuro").setJoiningTime(LocalDate.of(2025, Month.JANUARY, 18).atTime(12,00,00,00)).setName("Kumar").build();

        doctorData.add(d1);
        doctorData.add(d2);
        doctorData.add(d3);

    }

    public String adddoctorData(Doctor data){
        //todo: impl this later,  for now add into hard coded list

        return null;
    }

    public List<Doctor> getAlldoctorData(String id){
        //todo: impl this later, for now return hard coded list
        return doctorData;
    }

    public String getDoctorDataByName(String name){
        //todo: impl this later,for now return 1 record from hard coded list
        return doctorData.stream().filter(d -> d.getName().equals(name)).map(d -> d.getUuid()).findFirst().orElse(defaultDoc);

    }


}
