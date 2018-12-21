package com.system.model;


import java.sql.Time;

public class Course {
    private Integer course_id;

    private String course_name;

    private String course_teacher;

    private String course_week;


    private Time course_start_time;

    private Time course_end_time;

    private String course_address;

    public Course(Integer course_id, String course_name, String course_teacher, String course_week, Time course_start_time, Time course_end_time, String course_address) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_teacher = course_teacher;
        this.course_week = course_week;
        this.course_start_time = course_start_time;
        this.course_end_time = course_end_time;
        this.course_address = course_address;
    }

    public Course() {
        super();
    }

    public Course(String course_name, String course_teacher, String course_week, Time course_start_time, Time course_end_time, String course_address) {
        this.course_name = course_name;
        this.course_teacher = course_teacher;
        this.course_week = course_week;
        this.course_start_time = course_start_time;
        this.course_end_time = course_end_time;
        this.course_address = course_address;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name == null ? null : course_name.trim();
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher == null ? null : course_teacher.trim();
    }

    public String getCourse_week() {
        return course_week;
    }

    public void setCourse_week(String course_week) {
        this.course_week = course_week == null ? null : course_week.trim();
    }

    public Time getCourse_start_time() {
        return course_start_time;
    }

    public void setCourse_start_time(Time course_start_time) {
        this.course_start_time = course_start_time;
    }

    public Time getCourse_end_time() {
        return course_end_time;
    }

    public void setCourse_end_time(Time course_end_time) {
        this.course_end_time = course_end_time;
    }

    public String getCourse_address() {
        return course_address;
    }

    public void setCourse_address(String course_address) {
        this.course_address = course_address == null ? null : course_address.trim();
    }
}