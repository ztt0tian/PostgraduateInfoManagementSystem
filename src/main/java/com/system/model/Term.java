package com.system.model;

public class Term {
    private Integer term_id;

    private String trem_name;

    public Term(Integer term_id, String trem_name) {
        this.term_id = term_id;
        this.trem_name = trem_name;
    }

    public Term() {
        super();
    }

    public Integer getTerm_id() {
        return term_id;
    }

    public void setTerm_id(Integer term_id) {
        this.term_id = term_id;
    }

    public String getTrem_name() {
        return trem_name;
    }

    public void setTrem_name(String trem_name) {
        this.trem_name = trem_name == null ? null : trem_name.trim();
    }
}