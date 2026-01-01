package com.healthify.opdservice.entities;

import com.healthify.opdservice.enums.BloodGroup;

public class PatientDetails {
    private String gender;
    private String patiententUuid;
    private BloodGroup bloodGroup;
    private EmergencyContact emergencyContact;
    private String marritalStatus;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatiententUuid() {
        return patiententUuid;
    }

    public void setPatiententUuid(String patiententUuid) {
        this.patiententUuid = patiententUuid;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getMarritalStatus() {
        return marritalStatus;
    }

    public void setMarritalStatus(String marritalStatus) {
        this.marritalStatus = marritalStatus;
    }
}
