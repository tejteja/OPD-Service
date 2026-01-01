package com.healthify.opdservice.entities;

import java.time.LocalDateTime;

public class Doctor {

   private String uuid;
   private String hospitalUuid;
   private String specialization;
   private LocalDateTime joiningTime;
   private String name;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDateTime getJoiningTime() {
        return joiningTime;
    }
    public String getUuid() {
        return uuid;
    }

    public String getHospitalUuid() {
        return hospitalUuid;
    }

    public void setHospitalUuid(String hospitalUuid) {
        this.hospitalUuid = hospitalUuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setJoiningTime(LocalDateTime joiningTime) {
        this.joiningTime = joiningTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
