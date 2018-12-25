package com.system.model;

public class JsonDataOfClassRPrecord {
    private String class_name;
    private Integer class_P_count;
    private Integer class_R_count;

    public JsonDataOfClassRPrecord(String class_name, Integer class_P_count, Integer class_R_count) {
        this.class_name = class_name;
        this.class_P_count = class_P_count;
        this.class_R_count = class_R_count;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Integer getClass_P_count() {
        return class_P_count;
    }

    public void setClass_P_count(Integer class_P_count) {
        this.class_P_count = class_P_count;
    }

    public Integer getClass_R_count() {
        return class_R_count;
    }

    public void setClass_R_count(Integer class_R_count) {
        this.class_R_count = class_R_count;
    }

    public JsonDataOfClassRPrecord() {
    }
}
