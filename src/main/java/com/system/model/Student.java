package com.system.model;

import java.util.Date;

public class Student {
    private Integer student_id;

    private Integer class_id;

    private Integer tutor_id;

    private Integer specialty_id;

    private String name;

    private String password;

    private String sex;

    private Date birthday;

    private String phonenumber;

    private String address;

    public Student(Integer student_id, Integer class_id, Integer tutor_id, Integer specialty_id, String name, String password, String sex, Date birthday, String phonenumber, String address) {
        this.student_id = student_id;
        this.class_id = class_id;
        this.tutor_id = tutor_id;
        this.specialty_id = specialty_id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public Student() {
        super();
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public Integer getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(Integer tutor_id) {
        this.tutor_id = tutor_id;
    }

    public Integer getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(Integer specialty_id) {
        this.specialty_id = specialty_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}