package com.system.model;

public class Course {
    private Integer course_id;

    private String course_name;

    private String course_desc;

    private Integer course_point;

    private String course_teacher;

    private String course_during;

    private String course_place;

    private String course_time;

    private String course_hour_credit;

    private String course_checkmethod;

    public Course(Integer course_id, String course_name, String course_desc, Integer course_point, String course_teacher, String course_during, String course_place, String course_time, String course_hour_credit, String course_checkmethod) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_desc = course_desc;
        this.course_point = course_point;
        this.course_teacher = course_teacher;
        this.course_during = course_during;
        this.course_place = course_place;
        this.course_time = course_time;
        this.course_hour_credit = course_hour_credit;
        this.course_checkmethod = course_checkmethod;
    }

    public Course() {
        super();
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

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc == null ? null : course_desc.trim();
    }

    public Integer getCourse_point() {
        return course_point;
    }

    public void setCourse_point(Integer course_point) {
        this.course_point = course_point;
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher == null ? null : course_teacher.trim();
    }

    public String getCourse_during() {
        return course_during;
    }

    public void setCourse_during(String course_during) {
        this.course_during = course_during == null ? null : course_during.trim();
    }

    public String getCourse_place() {
        return course_place;
    }

    public void setCourse_place(String course_place) {
        this.course_place = course_place == null ? null : course_place.trim();
    }

    public String getCourse_time() {
        return course_time;
    }

    public void setCourse_time(String course_time) {
        this.course_time = course_time == null ? null : course_time.trim();
    }

    public String getCourse_hour_credit() {
        return course_hour_credit;
    }

    public void setCourse_hour_credit(String course_hour_credit) {
        this.course_hour_credit = course_hour_credit == null ? null : course_hour_credit.trim();
    }

    public String getCourse_checkmethod() {
        return course_checkmethod;
    }

    public void setCourse_checkmethod(String course_checkmethod) {
        this.course_checkmethod = course_checkmethod == null ? null : course_checkmethod.trim();
    }
}