package com.healthify.opdservice.entities;

import com.healthify.opdservice.enums.SampleType;
import com.healthify.opdservice.enums.Tests;

import java.time.LocalDateTime;

public class Test {
    private String patientId;
    private String doctorId;
    private String uuid;
    private Tests test;
    private SampleType sample;
    private String consultationId;
    private LocalDateTime time;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Tests getTest() {
        return test;
    }

    public void setTest(Tests test) {
        this.test = test;
    }

    public SampleType getSample() {
        return sample;
    }

    public void setSample(SampleType sample) {
        this.sample = sample;
    }

    public String getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(String consultationId) {
        this.consultationId = consultationId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
