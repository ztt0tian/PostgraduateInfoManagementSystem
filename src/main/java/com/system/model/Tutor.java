package com.system.model;

public class Tutor {
    private Integer tutor_id;

    private String tutor_name;

    private String tutor_psw;

    public Tutor(Integer tutor_id, String tutor_name, String tutor_psw) {
        this.tutor_id = tutor_id;
        this.tutor_name = tutor_name;
        this.tutor_psw = tutor_psw;
    }

    public Tutor() {
        super();
    }

    public Integer getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(Integer tutor_id) {
        this.tutor_id = tutor_id;
    }

    public String getTutor_name() {
        return tutor_name;
    }

    public void setTutor_name(String tutor_name) {
        this.tutor_name = tutor_name == null ? null : tutor_name.trim();
    }

    public String getTutor_psw() {
        return tutor_psw;
    }

    public void setTutor_psw(String tutor_psw) {
        this.tutor_psw = tutor_psw == null ? null : tutor_psw.trim();
    }
}