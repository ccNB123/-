package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransferlogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferlogsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTransferlogsIdIsNull() {
            addCriterion("TRANSFERLOGS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdIsNotNull() {
            addCriterion("TRANSFERLOGS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ID =", value, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdNotEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ID <>", value, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdGreaterThan(Integer value) {
            addCriterion("TRANSFERLOGS_ID >", value, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ID >=", value, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdLessThan(Integer value) {
            addCriterion("TRANSFERLOGS_ID <", value, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ID <=", value, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_ID in", values, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdNotIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_ID not in", values, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_ID between", value1, value2, "transferlogsId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_ID not between", value1, value2, "transferlogsId");
            return (Criteria) this;
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

        public Criteria andUsersIdIsNull() {
            addCriterion("USERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("USERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("USERS_ID =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("USERS_ID <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("USERS_ID >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERS_ID >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("USERS_ID <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("USERS_ID <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("USERS_ID in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("USERS_ID not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ID between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ID not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdIsNull() {
            addCriterion("TRANSFERLOGS_FROMMC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdIsNotNull() {
            addCriterion("TRANSFERLOGS_FROMMC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_FROMMC_ID =", value, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdNotEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_FROMMC_ID <>", value, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdGreaterThan(Integer value) {
            addCriterion("TRANSFERLOGS_FROMMC_ID >", value, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_FROMMC_ID >=", value, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdLessThan(Integer value) {
            addCriterion("TRANSFERLOGS_FROMMC_ID <", value, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_FROMMC_ID <=", value, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_FROMMC_ID in", values, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdNotIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_FROMMC_ID not in", values, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_FROMMC_ID between", value1, value2, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_FROMMC_ID not between", value1, value2, "transferlogsFrommcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidIsNull() {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidIsNotNull() {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidEqualTo(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID =", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidNotEqualTo(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID <>", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidGreaterThan(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID >", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID >=", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidLessThan(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID <", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidLessThanOrEqualTo(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID <=", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidLike(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID like", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidNotLike(String value) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID not like", value, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidIn(List<String> values) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID in", values, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidNotIn(List<String> values) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID not in", values, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidBetween(String value1, String value2) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID between", value1, value2, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsFrommcCardidNotBetween(String value1, String value2) {
            addCriterion("TRANSFERLOGS_FROMMC_CARDID not between", value1, value2, "transferlogsFrommcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdIsNull() {
            addCriterion("TRANSFERLOGS_TOMC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdIsNotNull() {
            addCriterion("TRANSFERLOGS_TOMC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_TOMC_ID =", value, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdNotEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_TOMC_ID <>", value, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdGreaterThan(Integer value) {
            addCriterion("TRANSFERLOGS_TOMC_ID >", value, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_TOMC_ID >=", value, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdLessThan(Integer value) {
            addCriterion("TRANSFERLOGS_TOMC_ID <", value, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_TOMC_ID <=", value, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_TOMC_ID in", values, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdNotIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_TOMC_ID not in", values, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_TOMC_ID between", value1, value2, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_TOMC_ID not between", value1, value2, "transferlogsTomcId");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidIsNull() {
            addCriterion("TRANSFERLOGS_TOMC_CARDID is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidIsNotNull() {
            addCriterion("TRANSFERLOGS_TOMC_CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidEqualTo(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID =", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidNotEqualTo(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID <>", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidGreaterThan(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID >", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID >=", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidLessThan(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID <", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidLessThanOrEqualTo(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID <=", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidLike(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID like", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidNotLike(String value) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID not like", value, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidIn(List<String> values) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID in", values, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidNotIn(List<String> values) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID not in", values, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidBetween(String value1, String value2) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID between", value1, value2, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTomcCardidNotBetween(String value1, String value2) {
            addCriterion("TRANSFERLOGS_TOMC_CARDID not between", value1, value2, "transferlogsTomcCardid");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyIsNull() {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyIsNotNull() {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyEqualTo(Float value) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY =", value, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyNotEqualTo(Float value) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY <>", value, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyGreaterThan(Float value) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY >", value, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY >=", value, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyLessThan(Float value) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY <", value, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyLessThanOrEqualTo(Float value) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY <=", value, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyIn(List<Float> values) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY in", values, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyNotIn(List<Float> values) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY not in", values, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyBetween(Float value1, Float value2) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY between", value1, value2, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsTransfermoneyNotBetween(Float value1, Float value2) {
            addCriterion("TRANSFERLOGS_TRANSFERMONEY not between", value1, value2, "transferlogsTransfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkIsNull() {
            addCriterion("TRANSFERLOGS_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkIsNotNull() {
            addCriterion("TRANSFERLOGS_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkEqualTo(String value) {
            addCriterion("TRANSFERLOGS_REMARK =", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkNotEqualTo(String value) {
            addCriterion("TRANSFERLOGS_REMARK <>", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkGreaterThan(String value) {
            addCriterion("TRANSFERLOGS_REMARK >", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFERLOGS_REMARK >=", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkLessThan(String value) {
            addCriterion("TRANSFERLOGS_REMARK <", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkLessThanOrEqualTo(String value) {
            addCriterion("TRANSFERLOGS_REMARK <=", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkLike(String value) {
            addCriterion("TRANSFERLOGS_REMARK like", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkNotLike(String value) {
            addCriterion("TRANSFERLOGS_REMARK not like", value, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkIn(List<String> values) {
            addCriterion("TRANSFERLOGS_REMARK in", values, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkNotIn(List<String> values) {
            addCriterion("TRANSFERLOGS_REMARK not in", values, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkBetween(String value1, String value2) {
            addCriterion("TRANSFERLOGS_REMARK between", value1, value2, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsRemarkNotBetween(String value1, String value2) {
            addCriterion("TRANSFERLOGS_REMARK not between", value1, value2, "transferlogsRemark");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeIsNull() {
            addCriterion("TRANSFERLOGS_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeIsNotNull() {
            addCriterion("TRANSFERLOGS_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME =", value, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME <>", value, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME >", value, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME >=", value, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME <", value, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME <=", value, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME in", values, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME not in", values, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME between", value1, value2, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSFERLOGS_CREATETIME not between", value1, value2, "transferlogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelIsNull() {
            addCriterion("TRANSFERLOGS_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelIsNotNull() {
            addCriterion("TRANSFERLOGS_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ISDEL =", value, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelNotEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ISDEL <>", value, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelGreaterThan(Integer value) {
            addCriterion("TRANSFERLOGS_ISDEL >", value, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ISDEL >=", value, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelLessThan(Integer value) {
            addCriterion("TRANSFERLOGS_ISDEL <", value, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERLOGS_ISDEL <=", value, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_ISDEL in", values, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelNotIn(List<Integer> values) {
            addCriterion("TRANSFERLOGS_ISDEL not in", values, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_ISDEL between", value1, value2, "transferlogsIsdel");
            return (Criteria) this;
        }

        public Criteria andTransferlogsIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERLOGS_ISDEL not between", value1, value2, "transferlogsIsdel");
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