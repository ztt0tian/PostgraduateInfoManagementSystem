package com.system.model;

import java.util.Date;

public class RewardPunishRecord {
    private Integer rp_record_id;

    private Integer student_id;

    private Integer reward_punish_id;

    private Integer term_id;

    private Date rp_record_date;

    public RewardPunishRecord(Integer rp_record_id, Integer student_id, Integer reward_punish_id, Integer term_id, Date rp_record_date) {
        this.rp_record_id = rp_record_id;
        this.student_id = student_id;
        this.reward_punish_id = reward_punish_id;
        this.term_id = term_id;
        this.rp_record_date = rp_record_date;
    }

    public RewardPunishRecord() {
        super();
    }

    public Integer getRp_record_id() {
        return rp_record_id;
    }

    public void setRp_record_id(Integer rp_record_id) {
        this.rp_record_id = rp_record_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getReward_punish_id() {
        return reward_punish_id;
    }

    public void setReward_punish_id(Integer reward_punish_id) {
        this.reward_punish_id = reward_punish_id;
    }

    public Integer getTerm_id() {
        return term_id;
    }

    public void setTerm_id(Integer term_id) {
        this.term_id = term_id;
    }

    public Date getRp_record_date() {
        return rp_record_date;
    }

    public void setRp_record_date(Date rp_record_date) {
        this.rp_record_date = rp_record_date;
    }
}