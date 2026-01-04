package com.healthify.opdservice.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Consultation {
    private final String uuid;
    private final boolean isFirstConsultation;
    private final String parentConsultationId;
    private final String patientId;
    private final String doctorId;
    private final String symptoms;
    private final String notes;
    private final List<String> paymentId;
    private final List<String> meds;
    private final List<String> testsIds;
    private final List<String> rooms;
    private final LocalDateTime time;

    private Consultation(Builder builder){
        //required for builder pattern
        this.uuid=builder.uuid;
        this.isFirstConsultation=builder.isFirstConsultation;
        this.parentConsultationId=builder.parentConsultationId;
        this.patientId=builder.patientId;
        this.doctorId=builder.doctorId;
        this.symptoms=builder.symptoms;
        this.notes= builder.notes;
        this.paymentId=builder.paymentId;
        this.meds=builder.meds;
        this.testsIds=builder.testsIds;
        this.rooms=builder.rooms;
        this.time=builder.time;
         }

    public String getUuid() {
        return uuid;
    }

    public boolean IsFirstConsultation() {
        return isFirstConsultation;
    }

    public String getParentConsultationId() {
        return parentConsultationId;
    }

    public String getPatientId() {
        return patientId;
    }


    public String getDoctorId() {
        return doctorId;
    }


    public String getSymptoms() {
        return symptoms;
    }

    public String getNotes() {
        return notes;
    }


    public List<String> getPaymentId() {
        return paymentId;
    }


    public List<String> getMeds() {
        return meds;
    }


    public List<String> getTestsIds() {
        return testsIds;
    }


    public List<String> getRooms() {
        return rooms;
    }


    public LocalDateTime getTime() {
        return time;
    }


    public static class Builder{
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

        public Builder setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setFirstConsultation(boolean firstConsultation) {
            isFirstConsultation = firstConsultation;
            return this;
        }

        public Builder setParentConsultationId(String parentConsultationId) {
            this.parentConsultationId = parentConsultationId;
            return this;
        }

        public Builder setPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setSymptoms(String symptoms) {
            this.symptoms = symptoms;
            return this;
        }

        public Builder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder setPaymentId(List<String> paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setMeds(List<String> meds) {
            this.meds = meds;
            return this;
        }

        public Builder setTestsIds(List<String> testsIds) {
            this.testsIds = testsIds;
            return this;
        }

        public Builder setRooms(List<String> rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setTime(LocalDateTime time) {
            this.time = time;
            return this;
        }

        public Consultation build(){
            return new Consultation(this);
        }
    }
}
