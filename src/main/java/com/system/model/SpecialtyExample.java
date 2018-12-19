package com.system.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SpecialtyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialtyExample() {
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

        public Criteria andSpecialty_idIsNull() {
            addCriterion("specialty_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idIsNotNull() {
            addCriterion("specialty_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idEqualTo(Integer value) {
            addCriterion("specialty_id =", value, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idNotEqualTo(Integer value) {
            addCriterion("specialty_id <>", value, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idGreaterThan(Integer value) {
            addCriterion("specialty_id >", value, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialty_id >=", value, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idLessThan(Integer value) {
            addCriterion("specialty_id <", value, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idLessThanOrEqualTo(Integer value) {
            addCriterion("specialty_id <=", value, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idIn(List<Integer> values) {
            addCriterion("specialty_id in", values, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idNotIn(List<Integer> values) {
            addCriterion("specialty_id not in", values, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idBetween(Integer value1, Integer value2) {
            addCriterion("specialty_id between", value1, value2, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_idNotBetween(Integer value1, Integer value2) {
            addCriterion("specialty_id not between", value1, value2, "specialty_id");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameIsNull() {
            addCriterion("specialty_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameIsNotNull() {
            addCriterion("specialty_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameEqualTo(String value) {
            addCriterion("specialty_name =", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameNotEqualTo(String value) {
            addCriterion("specialty_name <>", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameGreaterThan(String value) {
            addCriterion("specialty_name >", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameGreaterThanOrEqualTo(String value) {
            addCriterion("specialty_name >=", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameLessThan(String value) {
            addCriterion("specialty_name <", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameLessThanOrEqualTo(String value) {
            addCriterion("specialty_name <=", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameLike(String value) {
            addCriterion("specialty_name like", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameNotLike(String value) {
            addCriterion("specialty_name not like", value, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameIn(List<String> values) {
            addCriterion("specialty_name in", values, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameNotIn(List<String> values) {
            addCriterion("specialty_name not in", values, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameBetween(String value1, String value2) {
            addCriterion("specialty_name between", value1, value2, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_nameNotBetween(String value1, String value2) {
            addCriterion("specialty_name not between", value1, value2, "specialty_name");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descIsNull() {
            addCriterion("specialty_desc is null");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descIsNotNull() {
            addCriterion("specialty_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descEqualTo(String value) {
            addCriterion("specialty_desc =", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descNotEqualTo(String value) {
            addCriterion("specialty_desc <>", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descGreaterThan(String value) {
            addCriterion("specialty_desc >", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descGreaterThanOrEqualTo(String value) {
            addCriterion("specialty_desc >=", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descLessThan(String value) {
            addCriterion("specialty_desc <", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descLessThanOrEqualTo(String value) {
            addCriterion("specialty_desc <=", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descLike(String value) {
            addCriterion("specialty_desc like", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descNotLike(String value) {
            addCriterion("specialty_desc not like", value, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descIn(List<String> values) {
            addCriterion("specialty_desc in", values, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descNotIn(List<String> values) {
            addCriterion("specialty_desc not in", values, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descBetween(String value1, String value2) {
            addCriterion("specialty_desc between", value1, value2, "specialty_desc");
            return (Criteria) this;
        }

        public Criteria andSpecialty_descNotBetween(String value1, String value2) {
            addCriterion("specialty_desc not between", value1, value2, "specialty_desc");
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