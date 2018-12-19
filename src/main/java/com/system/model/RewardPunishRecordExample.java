package com.system.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RewardPunishRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardPunishRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRp_record_idIsNull() {
            addCriterion("rp_record_id is null");
            return (Criteria) this;
        }

        public Criteria andRp_record_idIsNotNull() {
            addCriterion("rp_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRp_record_idEqualTo(Integer value) {
            addCriterion("rp_record_id =", value, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idNotEqualTo(Integer value) {
            addCriterion("rp_record_id <>", value, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idGreaterThan(Integer value) {
            addCriterion("rp_record_id >", value, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("rp_record_id >=", value, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idLessThan(Integer value) {
            addCriterion("rp_record_id <", value, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idLessThanOrEqualTo(Integer value) {
            addCriterion("rp_record_id <=", value, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idIn(List<Integer> values) {
            addCriterion("rp_record_id in", values, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idNotIn(List<Integer> values) {
            addCriterion("rp_record_id not in", values, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idBetween(Integer value1, Integer value2) {
            addCriterion("rp_record_id between", value1, value2, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_idNotBetween(Integer value1, Integer value2) {
            addCriterion("rp_record_id not between", value1, value2, "rp_record_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudent_idIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_idEqualTo(Integer value) {
            addCriterion("student_id =", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idGreaterThan(Integer value) {
            addCriterion("student_id >", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLessThan(Integer value) {
            addCriterion("student_id <", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idIn(List<Integer> values) {
            addCriterion("student_id in", values, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "student_id");
            return (Criteria) this;
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

        public Criteria andTerm_idIsNull() {
            addCriterion("term_id is null");
            return (Criteria) this;
        }

        public Criteria andTerm_idIsNotNull() {
            addCriterion("term_id is not null");
            return (Criteria) this;
        }

        public Criteria andTerm_idEqualTo(Integer value) {
            addCriterion("term_id =", value, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idNotEqualTo(Integer value) {
            addCriterion("term_id <>", value, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idGreaterThan(Integer value) {
            addCriterion("term_id >", value, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_id >=", value, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idLessThan(Integer value) {
            addCriterion("term_id <", value, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idLessThanOrEqualTo(Integer value) {
            addCriterion("term_id <=", value, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idIn(List<Integer> values) {
            addCriterion("term_id in", values, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idNotIn(List<Integer> values) {
            addCriterion("term_id not in", values, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idBetween(Integer value1, Integer value2) {
            addCriterion("term_id between", value1, value2, "term_id");
            return (Criteria) this;
        }

        public Criteria andTerm_idNotBetween(Integer value1, Integer value2) {
            addCriterion("term_id not between", value1, value2, "term_id");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateIsNull() {
            addCriterion("rp_record_date is null");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateIsNotNull() {
            addCriterion("rp_record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateEqualTo(Date value) {
            addCriterionForJDBCDate("rp_record_date =", value, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rp_record_date <>", value, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("rp_record_date >", value, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rp_record_date >=", value, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateLessThan(Date value) {
            addCriterionForJDBCDate("rp_record_date <", value, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rp_record_date <=", value, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateIn(List<Date> values) {
            addCriterionForJDBCDate("rp_record_date in", values, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rp_record_date not in", values, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rp_record_date between", value1, value2, "rp_record_date");
            return (Criteria) this;
        }

        public Criteria andRp_record_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rp_record_date not between", value1, value2, "rp_record_date");
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