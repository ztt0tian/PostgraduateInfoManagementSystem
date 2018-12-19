package com.system.model;

public class StuCourRKey {
    private Integer course_id;

    private Integer student_id;

    public StuCourRKey(Integer course_id, Integer student_id) {
        this.course_id = course_id;
        this.student_id = student_id;
    }

    public StuCourRKey() {
        super();
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }
}