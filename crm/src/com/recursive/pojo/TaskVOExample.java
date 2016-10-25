package com.recursive.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TaskVOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdIsNull() {
            addCriterion("salon_info_id is null");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdIsNotNull() {
            addCriterion("salon_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdEqualTo(Integer value) {
            addCriterion("salon_info_id =", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdNotEqualTo(Integer value) {
            addCriterion("salon_info_id <>", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdGreaterThan(Integer value) {
            addCriterion("salon_info_id >", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salon_info_id >=", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdLessThan(Integer value) {
            addCriterion("salon_info_id <", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("salon_info_id <=", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdIn(List<Integer> values) {
            addCriterion("salon_info_id in", values, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdNotIn(List<Integer> values) {
            addCriterion("salon_info_id not in", values, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("salon_info_id between", value1, value2, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salon_info_id not between", value1, value2, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNull() {
            addCriterion("task_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNotNull() {
            addCriterion("task_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeEqualTo(Date value) {
            addCriterion("task_create_time =", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotEqualTo(Date value) {
            addCriterion("task_create_time <>", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThan(Date value) {
            addCriterion("task_create_time >", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_create_time >=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThan(Date value) {
            addCriterion("task_create_time <", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_create_time <=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIn(List<Date> values) {
            addCriterion("task_create_time in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotIn(List<Date> values) {
            addCriterion("task_create_time not in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeBetween(Date value1, Date value2) {
            addCriterion("task_create_time between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_create_time not between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNull() {
            addCriterion("task_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNotNull() {
            addCriterion("task_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeEqualTo(Date value) {
            addCriterion("task_finish_time =", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotEqualTo(Date value) {
            addCriterion("task_finish_time <>", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThan(Date value) {
            addCriterion("task_finish_time >", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_finish_time >=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThan(Date value) {
            addCriterion("task_finish_time <", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_finish_time <=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIn(List<Date> values) {
            addCriterion("task_finish_time in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotIn(List<Date> values) {
            addCriterion("task_finish_time not in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeBetween(Date value1, Date value2) {
            addCriterion("task_finish_time between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_finish_time not between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Byte value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Byte value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Byte value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Byte value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Byte value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Byte> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Byte> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Byte value1, Byte value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskCommentIsNull() {
            addCriterion("task_comment is null");
            return (Criteria) this;
        }

        public Criteria andTaskCommentIsNotNull() {
            addCriterion("task_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCommentEqualTo(String value) {
            addCriterion("task_comment =", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentNotEqualTo(String value) {
            addCriterion("task_comment <>", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentGreaterThan(String value) {
            addCriterion("task_comment >", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentGreaterThanOrEqualTo(String value) {
            addCriterion("task_comment >=", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentLessThan(String value) {
            addCriterion("task_comment <", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentLessThanOrEqualTo(String value) {
            addCriterion("task_comment <=", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentLike(String value) {
            addCriterion("task_comment like", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentNotLike(String value) {
            addCriterion("task_comment not like", value, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentIn(List<String> values) {
            addCriterion("task_comment in", values, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentNotIn(List<String> values) {
            addCriterion("task_comment not in", values, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentBetween(String value1, String value2) {
            addCriterion("task_comment between", value1, value2, "taskComment");
            return (Criteria) this;
        }

        public Criteria andTaskCommentNotBetween(String value1, String value2) {
            addCriterion("task_comment not between", value1, value2, "taskComment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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