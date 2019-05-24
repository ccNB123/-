package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopsExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIsNull() {
            addCriterion("SHOP_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIsNotNull() {
            addCriterion("SHOP_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdEqualTo(Integer value) {
            addCriterion("SHOP_CATEGORY_ID =", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotEqualTo(Integer value) {
            addCriterion("SHOP_CATEGORY_ID <>", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThan(Integer value) {
            addCriterion("SHOP_CATEGORY_ID >", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_CATEGORY_ID >=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThan(Integer value) {
            addCriterion("SHOP_CATEGORY_ID <", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_CATEGORY_ID <=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIn(List<Integer> values) {
            addCriterion("SHOP_CATEGORY_ID in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotIn(List<Integer> values) {
            addCriterion("SHOP_CATEGORY_ID not in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_CATEGORY_ID between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_CATEGORY_ID not between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopContactnameIsNull() {
            addCriterion("SHOP_CONTACTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShopContactnameIsNotNull() {
            addCriterion("SHOP_CONTACTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopContactnameEqualTo(String value) {
            addCriterion("SHOP_CONTACTNAME =", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameNotEqualTo(String value) {
            addCriterion("SHOP_CONTACTNAME <>", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameGreaterThan(String value) {
            addCriterion("SHOP_CONTACTNAME >", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_CONTACTNAME >=", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameLessThan(String value) {
            addCriterion("SHOP_CONTACTNAME <", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_CONTACTNAME <=", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameLike(String value) {
            addCriterion("SHOP_CONTACTNAME like", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameNotLike(String value) {
            addCriterion("SHOP_CONTACTNAME not like", value, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameIn(List<String> values) {
            addCriterion("SHOP_CONTACTNAME in", values, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameNotIn(List<String> values) {
            addCriterion("SHOP_CONTACTNAME not in", values, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameBetween(String value1, String value2) {
            addCriterion("SHOP_CONTACTNAME between", value1, value2, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContactnameNotBetween(String value1, String value2) {
            addCriterion("SHOP_CONTACTNAME not between", value1, value2, "shopContactname");
            return (Criteria) this;
        }

        public Criteria andShopContacttelIsNull() {
            addCriterion("SHOP_CONTACTTEL is null");
            return (Criteria) this;
        }

        public Criteria andShopContacttelIsNotNull() {
            addCriterion("SHOP_CONTACTTEL is not null");
            return (Criteria) this;
        }

        public Criteria andShopContacttelEqualTo(String value) {
            addCriterion("SHOP_CONTACTTEL =", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelNotEqualTo(String value) {
            addCriterion("SHOP_CONTACTTEL <>", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelGreaterThan(String value) {
            addCriterion("SHOP_CONTACTTEL >", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_CONTACTTEL >=", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelLessThan(String value) {
            addCriterion("SHOP_CONTACTTEL <", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelLessThanOrEqualTo(String value) {
            addCriterion("SHOP_CONTACTTEL <=", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelLike(String value) {
            addCriterion("SHOP_CONTACTTEL like", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelNotLike(String value) {
            addCriterion("SHOP_CONTACTTEL not like", value, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelIn(List<String> values) {
            addCriterion("SHOP_CONTACTTEL in", values, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelNotIn(List<String> values) {
            addCriterion("SHOP_CONTACTTEL not in", values, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelBetween(String value1, String value2) {
            addCriterion("SHOP_CONTACTTEL between", value1, value2, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopContacttelNotBetween(String value1, String value2) {
            addCriterion("SHOP_CONTACTTEL not between", value1, value2, "shopContacttel");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("SHOP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("SHOP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("SHOP_ADDRESS =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("SHOP_ADDRESS >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("SHOP_ADDRESS <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("SHOP_ADDRESS like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("SHOP_ADDRESS not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("SHOP_ADDRESS in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("SHOP_ADDRESS not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIsNull() {
            addCriterion("SHOP_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIsNotNull() {
            addCriterion("SHOP_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andShopRemarkEqualTo(String value) {
            addCriterion("SHOP_REMARK =", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotEqualTo(String value) {
            addCriterion("SHOP_REMARK <>", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkGreaterThan(String value) {
            addCriterion("SHOP_REMARK >", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_REMARK >=", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLessThan(String value) {
            addCriterion("SHOP_REMARK <", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLessThanOrEqualTo(String value) {
            addCriterion("SHOP_REMARK <=", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLike(String value) {
            addCriterion("SHOP_REMARK like", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotLike(String value) {
            addCriterion("SHOP_REMARK not like", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIn(List<String> values) {
            addCriterion("SHOP_REMARK in", values, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotIn(List<String> values) {
            addCriterion("SHOP_REMARK not in", values, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkBetween(String value1, String value2) {
            addCriterion("SHOP_REMARK between", value1, value2, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotBetween(String value1, String value2) {
            addCriterion("SHOP_REMARK not between", value1, value2, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminIsNull() {
            addCriterion("SHOP_ISHASSETADMIN is null");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminIsNotNull() {
            addCriterion("SHOP_ISHASSETADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminEqualTo(Integer value) {
            addCriterion("SHOP_ISHASSETADMIN =", value, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminNotEqualTo(Integer value) {
            addCriterion("SHOP_ISHASSETADMIN <>", value, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminGreaterThan(Integer value) {
            addCriterion("SHOP_ISHASSETADMIN >", value, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ISHASSETADMIN >=", value, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminLessThan(Integer value) {
            addCriterion("SHOP_ISHASSETADMIN <", value, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ISHASSETADMIN <=", value, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminIn(List<Integer> values) {
            addCriterion("SHOP_ISHASSETADMIN in", values, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminNotIn(List<Integer> values) {
            addCriterion("SHOP_ISHASSETADMIN not in", values, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ISHASSETADMIN between", value1, value2, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopIshassetadminNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ISHASSETADMIN not between", value1, value2, "shopIshassetadmin");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeIsNull() {
            addCriterion("SHOP_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeIsNotNull() {
            addCriterion("SHOP_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeEqualTo(Date value) {
            addCriterion("SHOP_CREATETIME =", value, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeNotEqualTo(Date value) {
            addCriterion("SHOP_CREATETIME <>", value, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeGreaterThan(Date value) {
            addCriterion("SHOP_CREATETIME >", value, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SHOP_CREATETIME >=", value, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeLessThan(Date value) {
            addCriterion("SHOP_CREATETIME <", value, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("SHOP_CREATETIME <=", value, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeIn(List<Date> values) {
            addCriterion("SHOP_CREATETIME in", values, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeNotIn(List<Date> values) {
            addCriterion("SHOP_CREATETIME not in", values, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeBetween(Date value1, Date value2) {
            addCriterion("SHOP_CREATETIME between", value1, value2, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("SHOP_CREATETIME not between", value1, value2, "shopCreatetime");
            return (Criteria) this;
        }

        public Criteria andShopIsdelIsNull() {
            addCriterion("SHOP_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andShopIsdelIsNotNull() {
            addCriterion("SHOP_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andShopIsdelEqualTo(Integer value) {
            addCriterion("SHOP_ISDEL =", value, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelNotEqualTo(Integer value) {
            addCriterion("SHOP_ISDEL <>", value, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelGreaterThan(Integer value) {
            addCriterion("SHOP_ISDEL >", value, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ISDEL >=", value, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelLessThan(Integer value) {
            addCriterion("SHOP_ISDEL <", value, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ISDEL <=", value, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelIn(List<Integer> values) {
            addCriterion("SHOP_ISDEL in", values, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelNotIn(List<Integer> values) {
            addCriterion("SHOP_ISDEL not in", values, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ISDEL between", value1, value2, "shopIsdel");
            return (Criteria) this;
        }

        public Criteria andShopIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ISDEL not between", value1, value2, "shopIsdel");
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