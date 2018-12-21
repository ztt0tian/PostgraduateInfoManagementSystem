package com.system.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andCourse_idIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourse_idIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_idEqualTo(Integer value) {
            addCriterion("course_id =", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idGreaterThan(Integer value) {
            addCriterion("course_id >", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idLessThan(Integer value) {
            addCriterion("course_id <", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idIn(List<Integer> values) {
            addCriterion("course_id in", values, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_nameEqualTo(String value) {
            addCriterion("course_name =", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameGreaterThan(String value) {
            addCriterion("course_name >", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLessThan(String value) {
            addCriterion("course_name <", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLike(String value) {
            addCriterion("course_name like", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotLike(String value) {
            addCriterion("course_name not like", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIn(List<String> values) {
            addCriterion("course_name in", values, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherIsNull() {
            addCriterion("course_teacher is null");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherIsNotNull() {
            addCriterion("course_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherEqualTo(String value) {
            addCriterion("course_teacher =", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherNotEqualTo(String value) {
            addCriterion("course_teacher <>", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherGreaterThan(String value) {
            addCriterion("course_teacher >", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherGreaterThanOrEqualTo(String value) {
            addCriterion("course_teacher >=", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherLessThan(String value) {
            addCriterion("course_teacher <", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherLessThanOrEqualTo(String value) {
            addCriterion("course_teacher <=", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherLike(String value) {
            addCriterion("course_teacher like", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherNotLike(String value) {
            addCriterion("course_teacher not like", value, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherIn(List<String> values) {
            addCriterion("course_teacher in", values, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherNotIn(List<String> values) {
            addCriterion("course_teacher not in", values, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherBetween(String value1, String value2) {
            addCriterion("course_teacher between", value1, value2, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_teacherNotBetween(String value1, String value2) {
            addCriterion("course_teacher not between", value1, value2, "course_teacher");
            return (Criteria) this;
        }

        public Criteria andCourse_weekIsNull() {
            addCriterion("course_week is null");
            return (Criteria) this;
        }

        public Criteria andCourse_weekIsNotNull() {
            addCriterion("course_week is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_weekEqualTo(String value) {
            addCriterion("course_week =", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekNotEqualTo(String value) {
            addCriterion("course_week <>", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekGreaterThan(String value) {
            addCriterion("course_week >", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekGreaterThanOrEqualTo(String value) {
            addCriterion("course_week >=", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekLessThan(String value) {
            addCriterion("course_week <", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekLessThanOrEqualTo(String value) {
            addCriterion("course_week <=", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekLike(String value) {
            addCriterion("course_week like", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekNotLike(String value) {
            addCriterion("course_week not like", value, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekIn(List<String> values) {
            addCriterion("course_week in", values, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekNotIn(List<String> values) {
            addCriterion("course_week not in", values, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekBetween(String value1, String value2) {
            addCriterion("course_week between", value1, value2, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_weekNotBetween(String value1, String value2) {
            addCriterion("course_week not between", value1, value2, "course_week");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeIsNull() {
            addCriterion("course_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeIsNotNull() {
            addCriterion("course_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeEqualTo(Date value) {
            addCriterionForJDBCTime("course_start_time =", value, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeNotEqualTo(Date value) {
            addCriterionForJDBCTime("course_start_time <>", value, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeGreaterThan(Date value) {
            addCriterionForJDBCTime("course_start_time >", value, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("course_start_time >=", value, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeLessThan(Date value) {
            addCriterionForJDBCTime("course_start_time <", value, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("course_start_time <=", value, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeIn(List<Date> values) {
            addCriterionForJDBCTime("course_start_time in", values, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeNotIn(List<Date> values) {
            addCriterionForJDBCTime("course_start_time not in", values, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("course_start_time between", value1, value2, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_start_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("course_start_time not between", value1, value2, "course_start_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeIsNull() {
            addCriterion("course_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeIsNotNull() {
            addCriterion("course_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeEqualTo(Date value) {
            addCriterionForJDBCTime("course_end_time =", value, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeNotEqualTo(Date value) {
            addCriterionForJDBCTime("course_end_time <>", value, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeGreaterThan(Date value) {
            addCriterionForJDBCTime("course_end_time >", value, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("course_end_time >=", value, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeLessThan(Date value) {
            addCriterionForJDBCTime("course_end_time <", value, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("course_end_time <=", value, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeIn(List<Date> values) {
            addCriterionForJDBCTime("course_end_time in", values, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeNotIn(List<Date> values) {
            addCriterionForJDBCTime("course_end_time not in", values, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("course_end_time between", value1, value2, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_end_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("course_end_time not between", value1, value2, "course_end_time");
            return (Criteria) this;
        }

        public Criteria andCourse_addressIsNull() {
            addCriterion("course_address is null");
            return (Criteria) this;
        }

        public Criteria andCourse_addressIsNotNull() {
            addCriterion("course_address is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_addressEqualTo(String value) {
            addCriterion("course_address =", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressNotEqualTo(String value) {
            addCriterion("course_address <>", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressGreaterThan(String value) {
            addCriterion("course_address >", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressGreaterThanOrEqualTo(String value) {
            addCriterion("course_address >=", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressLessThan(String value) {
            addCriterion("course_address <", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressLessThanOrEqualTo(String value) {
            addCriterion("course_address <=", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressLike(String value) {
            addCriterion("course_address like", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressNotLike(String value) {
            addCriterion("course_address not like", value, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressIn(List<String> values) {
            addCriterion("course_address in", values, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressNotIn(List<String> values) {
            addCriterion("course_address not in", values, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressBetween(String value1, String value2) {
            addCriterion("course_address between", value1, value2, "course_address");
            return (Criteria) this;
        }

        public Criteria andCourse_addressNotBetween(String value1, String value2) {
            addCriterion("course_address not between", value1, value2, "course_address");
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