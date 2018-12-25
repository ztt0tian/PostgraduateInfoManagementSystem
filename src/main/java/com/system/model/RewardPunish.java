package com.system.model;

public class RewardPunish {
    private Integer reward_punish_id;

    private String reward_punish_name;

    private Float reward_punish_money;

    private Integer reward_punish_flag;

    public RewardPunish(Integer reward_punish_id, String reward_punish_name, Float reward_punish_money, Integer reward_punish_flag) {
        this.reward_punish_id = reward_punish_id;
        this.reward_punish_name = reward_punish_name;
        this.reward_punish_money = reward_punish_money;
        this.reward_punish_flag = reward_punish_flag;
    }

    public RewardPunish() {
        super();
    }

    public Integer getReward_punish_id() {
        return reward_punish_id;
    }

    public void setReward_punish_id(Integer reward_punish_id) {
        this.reward_punish_id = reward_punish_id;
    }

    public String getReward_punish_name() {
        return reward_punish_name;
    }

    public void setReward_punish_name(String reward_punish_name) {
        this.reward_punish_name = reward_punish_name == null ? null : reward_punish_name.trim();
    }

    public Float getReward_punish_money() {
        return reward_punish_money;
    }

    public void setReward_punish_money(Float reward_punish_money) {
        this.reward_punish_money = reward_punish_money;
    }

    public Integer getReward_punish_flag() {
        return reward_punish_flag;
    }

    public void setReward_punish_flag(Integer reward_punish_flag) {
        this.reward_punish_flag = reward_punish_flag;
    }
}