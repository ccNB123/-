package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.List;

public class CardlevelsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardlevelsExample() {
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

        public Criteria andCardlevelsIdIsNull() {
            addCriterion("CARDLEVELS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdIsNotNull() {
            addCriterion("CARDLEVELS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdEqualTo(Integer value) {
            addCriterion("CARDLEVELS_ID =", value, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdNotEqualTo(Integer value) {
            addCriterion("CARDLEVELS_ID <>", value, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdGreaterThan(Integer value) {
            addCriterion("CARDLEVELS_ID >", value, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARDLEVELS_ID >=", value, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdLessThan(Integer value) {
            addCriterion("CARDLEVELS_ID <", value, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdLessThanOrEqualTo(Integer value) {
            addCriterion("CARDLEVELS_ID <=", value, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdIn(List<Integer> values) {
            addCriterion("CARDLEVELS_ID in", values, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdNotIn(List<Integer> values) {
            addCriterion("CARDLEVELS_ID not in", values, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdBetween(Integer value1, Integer value2) {
            addCriterion("CARDLEVELS_ID between", value1, value2, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CARDLEVELS_ID not between", value1, value2, "cardlevelsId");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameIsNull() {
            addCriterion("CARDLEVELS_LEVELNAME is null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameIsNotNull() {
            addCriterion("CARDLEVELS_LEVELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameEqualTo(String value) {
            addCriterion("CARDLEVELS_LEVELNAME =", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameNotEqualTo(String value) {
            addCriterion("CARDLEVELS_LEVELNAME <>", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameGreaterThan(String value) {
            addCriterion("CARDLEVELS_LEVELNAME >", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("CARDLEVELS_LEVELNAME >=", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameLessThan(String value) {
            addCriterion("CARDLEVELS_LEVELNAME <", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameLessThanOrEqualTo(String value) {
            addCriterion("CARDLEVELS_LEVELNAME <=", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameLike(String value) {
            addCriterion("CARDLEVELS_LEVELNAME like", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameNotLike(String value) {
            addCriterion("CARDLEVELS_LEVELNAME not like", value, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameIn(List<String> values) {
            addCriterion("CARDLEVELS_LEVELNAME in", values, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameNotIn(List<String> values) {
            addCriterion("CARDLEVELS_LEVELNAME not in", values, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameBetween(String value1, String value2) {
            addCriterion("CARDLEVELS_LEVELNAME between", value1, value2, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsLevelnameNotBetween(String value1, String value2) {
            addCriterion("CARDLEVELS_LEVELNAME not between", value1, value2, "cardlevelsLevelname");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointIsNull() {
            addCriterion("CARDLEVELS_NEEDPOINT is null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointIsNotNull() {
            addCriterion("CARDLEVELS_NEEDPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointEqualTo(Integer value) {
            addCriterion("CARDLEVELS_NEEDPOINT =", value, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointNotEqualTo(Integer value) {
            addCriterion("CARDLEVELS_NEEDPOINT <>", value, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointGreaterThan(Integer value) {
            addCriterion("CARDLEVELS_NEEDPOINT >", value, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARDLEVELS_NEEDPOINT >=", value, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointLessThan(Integer value) {
            addCriterion("CARDLEVELS_NEEDPOINT <", value, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointLessThanOrEqualTo(Integer value) {
            addCriterion("CARDLEVELS_NEEDPOINT <=", value, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointIn(List<Integer> values) {
            addCriterion("CARDLEVELS_NEEDPOINT in", values, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointNotIn(List<Integer> values) {
            addCriterion("CARDLEVELS_NEEDPOINT not in", values, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointBetween(Integer value1, Integer value2) {
            addCriterion("CARDLEVELS_NEEDPOINT between", value1, value2, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsNeedpointNotBetween(Integer value1, Integer value2) {
            addCriterion("CARDLEVELS_NEEDPOINT not between", value1, value2, "cardlevelsNeedpoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointIsNull() {
            addCriterion("CARDLEVELS_POINT is null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointIsNotNull() {
            addCriterion("CARDLEVELS_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointEqualTo(Float value) {
            addCriterion("CARDLEVELS_POINT =", value, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointNotEqualTo(Float value) {
            addCriterion("CARDLEVELS_POINT <>", value, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointGreaterThan(Float value) {
            addCriterion("CARDLEVELS_POINT >", value, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointGreaterThanOrEqualTo(Float value) {
            addCriterion("CARDLEVELS_POINT >=", value, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointLessThan(Float value) {
            addCriterion("CARDLEVELS_POINT <", value, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointLessThanOrEqualTo(Float value) {
            addCriterion("CARDLEVELS_POINT <=", value, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointIn(List<Float> values) {
            addCriterion("CARDLEVELS_POINT in", values, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointNotIn(List<Float> values) {
            addCriterion("CARDLEVELS_POINT not in", values, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointBetween(Float value1, Float value2) {
            addCriterion("CARDLEVELS_POINT between", value1, value2, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPointNotBetween(Float value1, Float value2) {
            addCriterion("CARDLEVELS_POINT not between", value1, value2, "cardlevelsPoint");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentIsNull() {
            addCriterion("CARDLEVELS_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentIsNotNull() {
            addCriterion("CARDLEVELS_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentEqualTo(Float value) {
            addCriterion("CARDLEVELS_PERCENT =", value, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentNotEqualTo(Float value) {
            addCriterion("CARDLEVELS_PERCENT <>", value, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentGreaterThan(Float value) {
            addCriterion("CARDLEVELS_PERCENT >", value, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("CARDLEVELS_PERCENT >=", value, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentLessThan(Float value) {
            addCriterion("CARDLEVELS_PERCENT <", value, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentLessThanOrEqualTo(Float value) {
            addCriterion("CARDLEVELS_PERCENT <=", value, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentIn(List<Float> values) {
            addCriterion("CARDLEVELS_PERCENT in", values, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentNotIn(List<Float> values) {
            addCriterion("CARDLEVELS_PERCENT not in", values, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentBetween(Float value1, Float value2) {
            addCriterion("CARDLEVELS_PERCENT between", value1, value2, "cardlevelsPercent");
            return (Criteria) this;
        }

        public Criteria andCardlevelsPercentNotBetween(Float value1, Float value2) {
            addCriterion("CARDLEVELS_PERCENT not between", value1, value2, "cardlevelsPercent");
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