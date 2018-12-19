package com.system.model;

import java.util.ArrayList;
import java.util.List;

public class TermExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TermExample() {
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

        public Criteria andTrem_nameIsNull() {
            addCriterion("trem_name is null");
            return (Criteria) this;
        }

        public Criteria andTrem_nameIsNotNull() {
            addCriterion("trem_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrem_nameEqualTo(String value) {
            addCriterion("trem_name =", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameNotEqualTo(String value) {
            addCriterion("trem_name <>", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameGreaterThan(String value) {
            addCriterion("trem_name >", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameGreaterThanOrEqualTo(String value) {
            addCriterion("trem_name >=", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameLessThan(String value) {
            addCriterion("trem_name <", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameLessThanOrEqualTo(String value) {
            addCriterion("trem_name <=", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameLike(String value) {
            addCriterion("trem_name like", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameNotLike(String value) {
            addCriterion("trem_name not like", value, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameIn(List<String> values) {
            addCriterion("trem_name in", values, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameNotIn(List<String> values) {
            addCriterion("trem_name not in", values, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameBetween(String value1, String value2) {
            addCriterion("trem_name between", value1, value2, "trem_name");
            return (Criteria) this;
        }

        public Criteria andTrem_nameNotBetween(String value1, String value2) {
            addCriterion("trem_name not between", value1, value2, "trem_name");
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