package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.List;

public class CategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoriesExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("CATEGORY_NAME =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("CATEGORY_NAME <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("CATEGORY_NAME >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("CATEGORY_NAME <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("CATEGORY_NAME like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("CATEGORY_NAME not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("CATEGORY_NAME in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("CATEGORY_NAME not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNull() {
            addCriterion("CATEGORY_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNotNull() {
            addCriterion("CATEGORY_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleEqualTo(String value) {
            addCriterion("CATEGORY_TITLE =", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotEqualTo(String value) {
            addCriterion("CATEGORY_TITLE <>", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThan(String value) {
            addCriterion("CATEGORY_TITLE >", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_TITLE >=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThan(String value) {
            addCriterion("CATEGORY_TITLE <", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_TITLE <=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLike(String value) {
            addCriterion("CATEGORY_TITLE like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotLike(String value) {
            addCriterion("CATEGORY_TITLE not like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIn(List<String> values) {
            addCriterion("CATEGORY_TITLE in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotIn(List<String> values) {
            addCriterion("CATEGORY_TITLE not in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleBetween(String value1, String value2) {
            addCriterion("CATEGORY_TITLE between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_TITLE not between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryPidIsNull() {
            addCriterion("CATEGORY_PID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryPidIsNotNull() {
            addCriterion("CATEGORY_PID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryPidEqualTo(Integer value) {
            addCriterion("CATEGORY_PID =", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidNotEqualTo(Integer value) {
            addCriterion("CATEGORY_PID <>", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidGreaterThan(Integer value) {
            addCriterion("CATEGORY_PID >", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_PID >=", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidLessThan(Integer value) {
            addCriterion("CATEGORY_PID <", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_PID <=", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidIn(List<Integer> values) {
            addCriterion("CATEGORY_PID in", values, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidNotIn(List<Integer> values) {
            addCriterion("CATEGORY_PID not in", values, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_PID between", value1, value2, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_PID not between", value1, value2, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelIsNull() {
            addCriterion("CATEGORY_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelIsNotNull() {
            addCriterion("CATEGORY_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelEqualTo(Integer value) {
            addCriterion("CATEGORY_ISDEL =", value, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelNotEqualTo(Integer value) {
            addCriterion("CATEGORY_ISDEL <>", value, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelGreaterThan(Integer value) {
            addCriterion("CATEGORY_ISDEL >", value, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ISDEL >=", value, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelLessThan(Integer value) {
            addCriterion("CATEGORY_ISDEL <", value, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ISDEL <=", value, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelIn(List<Integer> values) {
            addCriterion("CATEGORY_ISDEL in", values, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelNotIn(List<Integer> values) {
            addCriterion("CATEGORY_ISDEL not in", values, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ISDEL between", value1, value2, "categoryIsdel");
            return (Criteria) this;
        }

        public Criteria andCategoryIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ISDEL not between", value1, value2, "categoryIsdel");
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