package com.system.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TutorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TutorExample() {
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

        public Criteria andTutor_idIsNull() {
            addCriterion("tutor_id is null");
            return (Criteria) this;
        }

        public Criteria andTutor_idIsNotNull() {
            addCriterion("tutor_id is not null");
            return (Criteria) this;
        }

        public Criteria andTutor_idEqualTo(Integer value) {
            addCriterion("tutor_id =", value, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idNotEqualTo(Integer value) {
            addCriterion("tutor_id <>", value, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idGreaterThan(Integer value) {
            addCriterion("tutor_id >", value, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutor_id >=", value, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idLessThan(Integer value) {
            addCriterion("tutor_id <", value, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idLessThanOrEqualTo(Integer value) {
            addCriterion("tutor_id <=", value, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idIn(List<Integer> values) {
            addCriterion("tutor_id in", values, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idNotIn(List<Integer> values) {
            addCriterion("tutor_id not in", values, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idBetween(Integer value1, Integer value2) {
            addCriterion("tutor_id between", value1, value2, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_idNotBetween(Integer value1, Integer value2) {
            addCriterion("tutor_id not between", value1, value2, "tutor_id");
            return (Criteria) this;
        }

        public Criteria andTutor_nameIsNull() {
            addCriterion("tutor_name is null");
            return (Criteria) this;
        }

        public Criteria andTutor_nameIsNotNull() {
            addCriterion("tutor_name is not null");
            return (Criteria) this;
        }

        public Criteria andTutor_nameEqualTo(String value) {
            addCriterion("tutor_name =", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameNotEqualTo(String value) {
            addCriterion("tutor_name <>", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameGreaterThan(String value) {
            addCriterion("tutor_name >", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_name >=", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameLessThan(String value) {
            addCriterion("tutor_name <", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameLessThanOrEqualTo(String value) {
            addCriterion("tutor_name <=", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameLike(String value) {
            addCriterion("tutor_name like", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameNotLike(String value) {
            addCriterion("tutor_name not like", value, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameIn(List<String> values) {
            addCriterion("tutor_name in", values, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameNotIn(List<String> values) {
            addCriterion("tutor_name not in", values, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameBetween(String value1, String value2) {
            addCriterion("tutor_name between", value1, value2, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_nameNotBetween(String value1, String value2) {
            addCriterion("tutor_name not between", value1, value2, "tutor_name");
            return (Criteria) this;
        }

        public Criteria andTutor_pswIsNull() {
            addCriterion("tutor_psw is null");
            return (Criteria) this;
        }

        public Criteria andTutor_pswIsNotNull() {
            addCriterion("tutor_psw is not null");
            return (Criteria) this;
        }

        public Criteria andTutor_pswEqualTo(String value) {
            addCriterion("tutor_psw =", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswNotEqualTo(String value) {
            addCriterion("tutor_psw <>", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswGreaterThan(String value) {
            addCriterion("tutor_psw >", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_psw >=", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswLessThan(String value) {
            addCriterion("tutor_psw <", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswLessThanOrEqualTo(String value) {
            addCriterion("tutor_psw <=", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswLike(String value) {
            addCriterion("tutor_psw like", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswNotLike(String value) {
            addCriterion("tutor_psw not like", value, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswIn(List<String> values) {
            addCriterion("tutor_psw in", values, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswNotIn(List<String> values) {
            addCriterion("tutor_psw not in", values, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswBetween(String value1, String value2) {
            addCriterion("tutor_psw between", value1, value2, "tutor_psw");
            return (Criteria) this;
        }

        public Criteria andTutor_pswNotBetween(String value1, String value2) {
            addCriterion("tutor_psw not between", value1, value2, "tutor_psw");
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