package com.healthify.opdservice.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Consultation {
    private String uuid;
    private boolean isFirstConsultation;
    private String parentConsultationId;
    private String patientId;
    private String doctorId;
    private String symptoms;
    private String notes;
    private List<String> paymentId;
    private List<String> meds;
    private List<String> testsIds;
    private List<String> rooms;
    private LocalDateTime time;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isFirstConsultation() {
        return isFirstConsultation;
    }

    public void setFirstConsultation(boolean firstConsultation) {
        isFirstConsultation = firstConsultation;
    }

    public String getParentConsultationId() {
        return parentConsultationId;
    }

    public void setParentConsultationId(String parentConsultationId) {
        this.parentConsultationId = parentConsultationId;
    }

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

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<String> getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(List<String> paymentId) {
        this.paymentId = paymentId;
    }

    public List<String> getMeds() {
        return meds;
    }

    public void setMeds(List<String> meds) {
        this.meds = meds;
    }

    public List<String> getTestsIds() {
        return testsIds;
    }

    public void setTestsIds(List<String> testsIds) {
        this.testsIds = testsIds;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
