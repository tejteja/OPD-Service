package com.healthify.opdservice.entities;

public class Technician {
    private String uuid;
    private String name;
    private String speialization;
    private String hospitalId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getSpeialization() {
        return speialization;
    }

    public void setSpeialization(String speialization) {
        this.speialization = speialization;
    }
}
