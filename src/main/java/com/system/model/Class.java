package com.system.model;

public class Class {
    private Integer class_id;

    private String class_name;

    private Integer class_nums;

    public Class(Integer class_id, String class_name, Integer class_nums) {
        this.class_id = class_id;
        this.class_name = class_name;
        this.class_nums = class_nums;
    }

    public Class() {
        super();
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name == null ? null : class_name.trim();
    }

    public Integer getClass_nums() {
        return class_nums;
    }

    public void setClass_nums(Integer class_nums) {
        this.class_nums = class_nums;
    }
}