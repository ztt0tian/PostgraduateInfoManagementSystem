package com.system.model;

import java.util.ArrayList;
import java.util.List;

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

        public Criteria andCourse_descIsNull() {
            addCriterion("course_desc is null");
            return (Criteria) this;
        }

        public Criteria andCourse_descIsNotNull() {
            addCriterion("course_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_descEqualTo(String value) {
            addCriterion("course_desc =", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descNotEqualTo(String value) {
            addCriterion("course_desc <>", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descGreaterThan(String value) {
            addCriterion("course_desc >", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descGreaterThanOrEqualTo(String value) {
            addCriterion("course_desc >=", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descLessThan(String value) {
            addCriterion("course_desc <", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descLessThanOrEqualTo(String value) {
            addCriterion("course_desc <=", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descLike(String value) {
            addCriterion("course_desc like", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descNotLike(String value) {
            addCriterion("course_desc not like", value, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descIn(List<String> values) {
            addCriterion("course_desc in", values, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descNotIn(List<String> values) {
            addCriterion("course_desc not in", values, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descBetween(String value1, String value2) {
            addCriterion("course_desc between", value1, value2, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_descNotBetween(String value1, String value2) {
            addCriterion("course_desc not between", value1, value2, "course_desc");
            return (Criteria) this;
        }

        public Criteria andCourse_pointIsNull() {
            addCriterion("course_point is null");
            return (Criteria) this;
        }

        public Criteria andCourse_pointIsNotNull() {
            addCriterion("course_point is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_pointEqualTo(Integer value) {
            addCriterion("course_point =", value, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointNotEqualTo(Integer value) {
            addCriterion("course_point <>", value, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointGreaterThan(Integer value) {
            addCriterion("course_point >", value, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_point >=", value, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointLessThan(Integer value) {
            addCriterion("course_point <", value, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointLessThanOrEqualTo(Integer value) {
            addCriterion("course_point <=", value, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointIn(List<Integer> values) {
            addCriterion("course_point in", values, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointNotIn(List<Integer> values) {
            addCriterion("course_point not in", values, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointBetween(Integer value1, Integer value2) {
            addCriterion("course_point between", value1, value2, "course_point");
            return (Criteria) this;
        }

        public Criteria andCourse_pointNotBetween(Integer value1, Integer value2) {
            addCriterion("course_point not between", value1, value2, "course_point");
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

        public Criteria andCourse_duringIsNull() {
            addCriterion("course_during is null");
            return (Criteria) this;
        }

        public Criteria andCourse_duringIsNotNull() {
            addCriterion("course_during is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_duringEqualTo(String value) {
            addCriterion("course_during =", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringNotEqualTo(String value) {
            addCriterion("course_during <>", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringGreaterThan(String value) {
            addCriterion("course_during >", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringGreaterThanOrEqualTo(String value) {
            addCriterion("course_during >=", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringLessThan(String value) {
            addCriterion("course_during <", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringLessThanOrEqualTo(String value) {
            addCriterion("course_during <=", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringLike(String value) {
            addCriterion("course_during like", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringNotLike(String value) {
            addCriterion("course_during not like", value, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringIn(List<String> values) {
            addCriterion("course_during in", values, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringNotIn(List<String> values) {
            addCriterion("course_during not in", values, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringBetween(String value1, String value2) {
            addCriterion("course_during between", value1, value2, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_duringNotBetween(String value1, String value2) {
            addCriterion("course_during not between", value1, value2, "course_during");
            return (Criteria) this;
        }

        public Criteria andCourse_placeIsNull() {
            addCriterion("course_place is null");
            return (Criteria) this;
        }

        public Criteria andCourse_placeIsNotNull() {
            addCriterion("course_place is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_placeEqualTo(String value) {
            addCriterion("course_place =", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeNotEqualTo(String value) {
            addCriterion("course_place <>", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeGreaterThan(String value) {
            addCriterion("course_place >", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeGreaterThanOrEqualTo(String value) {
            addCriterion("course_place >=", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeLessThan(String value) {
            addCriterion("course_place <", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeLessThanOrEqualTo(String value) {
            addCriterion("course_place <=", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeLike(String value) {
            addCriterion("course_place like", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeNotLike(String value) {
            addCriterion("course_place not like", value, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeIn(List<String> values) {
            addCriterion("course_place in", values, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeNotIn(List<String> values) {
            addCriterion("course_place not in", values, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeBetween(String value1, String value2) {
            addCriterion("course_place between", value1, value2, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_placeNotBetween(String value1, String value2) {
            addCriterion("course_place not between", value1, value2, "course_place");
            return (Criteria) this;
        }

        public Criteria andCourse_timeIsNull() {
            addCriterion("course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourse_timeIsNotNull() {
            addCriterion("course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_timeEqualTo(String value) {
            addCriterion("course_time =", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeNotEqualTo(String value) {
            addCriterion("course_time <>", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeGreaterThan(String value) {
            addCriterion("course_time >", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeGreaterThanOrEqualTo(String value) {
            addCriterion("course_time >=", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeLessThan(String value) {
            addCriterion("course_time <", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeLessThanOrEqualTo(String value) {
            addCriterion("course_time <=", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeLike(String value) {
            addCriterion("course_time like", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeNotLike(String value) {
            addCriterion("course_time not like", value, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeIn(List<String> values) {
            addCriterion("course_time in", values, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeNotIn(List<String> values) {
            addCriterion("course_time not in", values, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeBetween(String value1, String value2) {
            addCriterion("course_time between", value1, value2, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_timeNotBetween(String value1, String value2) {
            addCriterion("course_time not between", value1, value2, "course_time");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditIsNull() {
            addCriterion("course_hour_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditIsNotNull() {
            addCriterion("course_hour_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditEqualTo(String value) {
            addCriterion("course_hour_credit =", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditNotEqualTo(String value) {
            addCriterion("course_hour_credit <>", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditGreaterThan(String value) {
            addCriterion("course_hour_credit >", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditGreaterThanOrEqualTo(String value) {
            addCriterion("course_hour_credit >=", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditLessThan(String value) {
            addCriterion("course_hour_credit <", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditLessThanOrEqualTo(String value) {
            addCriterion("course_hour_credit <=", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditLike(String value) {
            addCriterion("course_hour_credit like", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditNotLike(String value) {
            addCriterion("course_hour_credit not like", value, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditIn(List<String> values) {
            addCriterion("course_hour_credit in", values, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditNotIn(List<String> values) {
            addCriterion("course_hour_credit not in", values, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditBetween(String value1, String value2) {
            addCriterion("course_hour_credit between", value1, value2, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_hour_creditNotBetween(String value1, String value2) {
            addCriterion("course_hour_credit not between", value1, value2, "course_hour_credit");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodIsNull() {
            addCriterion("course_checkmethod is null");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodIsNotNull() {
            addCriterion("course_checkmethod is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodEqualTo(String value) {
            addCriterion("course_checkmethod =", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodNotEqualTo(String value) {
            addCriterion("course_checkmethod <>", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodGreaterThan(String value) {
            addCriterion("course_checkmethod >", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodGreaterThanOrEqualTo(String value) {
            addCriterion("course_checkmethod >=", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodLessThan(String value) {
            addCriterion("course_checkmethod <", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodLessThanOrEqualTo(String value) {
            addCriterion("course_checkmethod <=", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodLike(String value) {
            addCriterion("course_checkmethod like", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodNotLike(String value) {
            addCriterion("course_checkmethod not like", value, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodIn(List<String> values) {
            addCriterion("course_checkmethod in", values, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodNotIn(List<String> values) {
            addCriterion("course_checkmethod not in", values, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodBetween(String value1, String value2) {
            addCriterion("course_checkmethod between", value1, value2, "course_checkmethod");
            return (Criteria) this;
        }

        public Criteria andCourse_checkmethodNotBetween(String value1, String value2) {
            addCriterion("course_checkmethod not between", value1, value2, "course_checkmethod");
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