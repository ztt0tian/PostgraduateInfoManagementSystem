package com.system.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RewardPunishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardPunishExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReward_punish_idIsNull() {
            addCriterion("reward_punish_id is null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idIsNotNull() {
            addCriterion("reward_punish_id is not null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idEqualTo(Integer value) {
            addCriterion("reward_punish_id =", value, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idNotEqualTo(Integer value) {
            addCriterion("reward_punish_id <>", value, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idGreaterThan(Integer value) {
            addCriterion("reward_punish_id >", value, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_punish_id >=", value, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idLessThan(Integer value) {
            addCriterion("reward_punish_id <", value, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idLessThanOrEqualTo(Integer value) {
            addCriterion("reward_punish_id <=", value, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idIn(List<Integer> values) {
            addCriterion("reward_punish_id in", values, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idNotIn(List<Integer> values) {
            addCriterion("reward_punish_id not in", values, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idBetween(Integer value1, Integer value2) {
            addCriterion("reward_punish_id between", value1, value2, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_idNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_punish_id not between", value1, value2, "reward_punish_id");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameIsNull() {
            addCriterion("reward_punish_name is null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameIsNotNull() {
            addCriterion("reward_punish_name is not null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameEqualTo(String value) {
            addCriterion("reward_punish_name =", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameNotEqualTo(String value) {
            addCriterion("reward_punish_name <>", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameGreaterThan(String value) {
            addCriterion("reward_punish_name >", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameGreaterThanOrEqualTo(String value) {
            addCriterion("reward_punish_name >=", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameLessThan(String value) {
            addCriterion("reward_punish_name <", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameLessThanOrEqualTo(String value) {
            addCriterion("reward_punish_name <=", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameLike(String value) {
            addCriterion("reward_punish_name like", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameNotLike(String value) {
            addCriterion("reward_punish_name not like", value, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameIn(List<String> values) {
            addCriterion("reward_punish_name in", values, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameNotIn(List<String> values) {
            addCriterion("reward_punish_name not in", values, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameBetween(String value1, String value2) {
            addCriterion("reward_punish_name between", value1, value2, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_nameNotBetween(String value1, String value2) {
            addCriterion("reward_punish_name not between", value1, value2, "reward_punish_name");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyIsNull() {
            addCriterion("reward_punish_money is null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyIsNotNull() {
            addCriterion("reward_punish_money is not null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyEqualTo(Float value) {
            addCriterion("reward_punish_money =", value, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyNotEqualTo(Float value) {
            addCriterion("reward_punish_money <>", value, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyGreaterThan(Float value) {
            addCriterion("reward_punish_money >", value, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyGreaterThanOrEqualTo(Float value) {
            addCriterion("reward_punish_money >=", value, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyLessThan(Float value) {
            addCriterion("reward_punish_money <", value, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyLessThanOrEqualTo(Float value) {
            addCriterion("reward_punish_money <=", value, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyIn(List<Float> values) {
            addCriterion("reward_punish_money in", values, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyNotIn(List<Float> values) {
            addCriterion("reward_punish_money not in", values, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyBetween(Float value1, Float value2) {
            addCriterion("reward_punish_money between", value1, value2, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_moneyNotBetween(Float value1, Float value2) {
            addCriterion("reward_punish_money not between", value1, value2, "reward_punish_money");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagIsNull() {
            addCriterion("reward_punish_flag is null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagIsNotNull() {
            addCriterion("reward_punish_flag is not null");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagEqualTo(Integer value) {
            addCriterion("reward_punish_flag =", value, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagNotEqualTo(Integer value) {
            addCriterion("reward_punish_flag <>", value, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagGreaterThan(Integer value) {
            addCriterion("reward_punish_flag >", value, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_punish_flag >=", value, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagLessThan(Integer value) {
            addCriterion("reward_punish_flag <", value, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagLessThanOrEqualTo(Integer value) {
            addCriterion("reward_punish_flag <=", value, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagIn(List<Integer> values) {
            addCriterion("reward_punish_flag in", values, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagNotIn(List<Integer> values) {
            addCriterion("reward_punish_flag not in", values, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagBetween(Integer value1, Integer value2) {
            addCriterion("reward_punish_flag between", value1, value2, "reward_punish_flag");
            return (Criteria) this;
        }

        public Criteria andReward_punish_flagNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_punish_flag not between", value1, value2, "reward_punish_flag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}