package com.system.model;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdmin_nameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameEqualTo(String value) {
            addCriterion("admin_name =", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThan(String value) {
            addCriterion("admin_name >", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThan(String value) {
            addCriterion("admin_name <", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLike(String value) {
            addCriterion("admin_name like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotLike(String value) {
            addCriterion("admin_name not like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIn(List<String> values) {
            addCriterion("admin_name in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordEqualTo(String value) {
            addCriterion("admin_password =", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThan(String value) {
            addCriterion("admin_password >", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThan(String value) {
            addCriterion("admin_password <", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLike(String value) {
            addCriterion("admin_password like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotLike(String value) {
            addCriterion("admin_password not like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIn(List<String> values) {
            addCriterion("admin_password in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "admin_password");
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