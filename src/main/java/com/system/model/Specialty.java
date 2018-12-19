package com.system.model;

public class Specialty {
    private Integer specialty_id;

    private String specialty_name;

    private String specialty_desc;

    public Specialty(Integer specialty_id, String specialty_name, String specialty_desc) {
        this.specialty_id = specialty_id;
        this.specialty_name = specialty_name;
        this.specialty_desc = specialty_desc;
    }

    public Specialty() {
        super();
    }

    public Integer getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(Integer specialty_id) {
        this.specialty_id = specialty_id;
    }

    public String getSpecialty_name() {
        return specialty_name;
    }

    public void setSpecialty_name(String specialty_name) {
        this.specialty_name = specialty_name == null ? null : specialty_name.trim();
    }

    public String getSpecialty_desc() {
        return specialty_desc;
    }

    public void setSpecialty_desc(String specialty_desc) {
        this.specialty_desc = specialty_desc == null ? null : specialty_desc.trim();
    }
}