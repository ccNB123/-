package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsumeordersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumeordersExample() {
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

        public Criteria andConsumeordersIdIsNull() {
            addCriterion("CONSUMEORDERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdIsNotNull() {
            addCriterion("CONSUMEORDERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ID =", value, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdNotEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ID <>", value, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdGreaterThan(Integer value) {
            addCriterion("CONSUMEORDERS_ID >", value, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ID >=", value, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdLessThan(Integer value) {
            addCriterion("CONSUMEORDERS_ID <", value, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ID <=", value, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_ID in", values, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdNotIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_ID not in", values, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_ID between", value1, value2, "consumeordersId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_ID not between", value1, value2, "consumeordersId");
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

        public Criteria andConsumeordersOrdercodeIsNull() {
            addCriterion("CONSUMEORDERS_ORDERCODE is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeIsNotNull() {
            addCriterion("CONSUMEORDERS_ORDERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeEqualTo(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE =", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeNotEqualTo(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE <>", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeGreaterThan(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE >", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE >=", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeLessThan(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE <", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeLessThanOrEqualTo(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE <=", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeLike(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE like", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeNotLike(String value) {
            addCriterion("CONSUMEORDERS_ORDERCODE not like", value, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeIn(List<String> values) {
            addCriterion("CONSUMEORDERS_ORDERCODE in", values, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeNotIn(List<String> values) {
            addCriterion("CONSUMEORDERS_ORDERCODE not in", values, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeBetween(String value1, String value2) {
            addCriterion("CONSUMEORDERS_ORDERCODE between", value1, value2, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdercodeNotBetween(String value1, String value2) {
            addCriterion("CONSUMEORDERS_ORDERCODE not between", value1, value2, "consumeordersOrdercode");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeIsNull() {
            addCriterion("CONSUMEORDERS_ORDERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeIsNotNull() {
            addCriterion("CONSUMEORDERS_ORDERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ORDERTYPE =", value, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeNotEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ORDERTYPE <>", value, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeGreaterThan(Integer value) {
            addCriterion("CONSUMEORDERS_ORDERTYPE >", value, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ORDERTYPE >=", value, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeLessThan(Integer value) {
            addCriterion("CONSUMEORDERS_ORDERTYPE <", value, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ORDERTYPE <=", value, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_ORDERTYPE in", values, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeNotIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_ORDERTYPE not in", values, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_ORDERTYPE between", value1, value2, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andConsumeordersOrdertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_ORDERTYPE not between", value1, value2, "consumeordersOrdertype");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdIsNull() {
            addCriterion("MEMCARDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdIsNotNull() {
            addCriterion("MEMCARDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdEqualTo(Integer value) {
            addCriterion("MEMCARDS_ID =", value, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_ID <>", value, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdGreaterThan(Integer value) {
            addCriterion("MEMCARDS_ID >", value, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ID >=", value, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdLessThan(Integer value) {
            addCriterion("MEMCARDS_ID <", value, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ID <=", value, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdIn(List<Integer> values) {
            addCriterion("MEMCARDS_ID in", values, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_ID not in", values, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ID between", value1, value2, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ID not between", value1, value2, "memcardsId");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidIsNull() {
            addCriterion("MEMCARDS_CARDID is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidIsNotNull() {
            addCriterion("MEMCARDS_CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidEqualTo(String value) {
            addCriterion("MEMCARDS_CARDID =", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidNotEqualTo(String value) {
            addCriterion("MEMCARDS_CARDID <>", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidGreaterThan(String value) {
            addCriterion("MEMCARDS_CARDID >", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_CARDID >=", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidLessThan(String value) {
            addCriterion("MEMCARDS_CARDID <", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_CARDID <=", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidLike(String value) {
            addCriterion("MEMCARDS_CARDID like", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidNotLike(String value) {
            addCriterion("MEMCARDS_CARDID not like", value, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidIn(List<String> values) {
            addCriterion("MEMCARDS_CARDID in", values, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidNotIn(List<String> values) {
            addCriterion("MEMCARDS_CARDID not in", values, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidBetween(String value1, String value2) {
            addCriterion("MEMCARDS_CARDID between", value1, value2, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andMemcardsCardidNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_CARDID not between", value1, value2, "memcardsCardid");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdIsNull() {
            addCriterion("EXCHANGGIFTS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdIsNotNull() {
            addCriterion("EXCHANGGIFTS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ID =", value, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdNotEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ID <>", value, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdGreaterThan(Integer value) {
            addCriterion("EXCHANGGIFTS_ID >", value, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ID >=", value, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdLessThan(Integer value) {
            addCriterion("EXCHANGGIFTS_ID <", value, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ID <=", value, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_ID in", values, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdNotIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_ID not in", values, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_ID between", value1, value2, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_ID not between", value1, value2, "exchanggiftsId");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyIsNull() {
            addCriterion("CONSUMEORDERS_TOTALMONEY is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyIsNotNull() {
            addCriterion("CONSUMEORDERS_TOTALMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_TOTALMONEY =", value, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyNotEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_TOTALMONEY <>", value, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyGreaterThan(Float value) {
            addCriterion("CONSUMEORDERS_TOTALMONEY >", value, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_TOTALMONEY >=", value, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyLessThan(Float value) {
            addCriterion("CONSUMEORDERS_TOTALMONEY <", value, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_TOTALMONEY <=", value, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyIn(List<Float> values) {
            addCriterion("CONSUMEORDERS_TOTALMONEY in", values, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyNotIn(List<Float> values) {
            addCriterion("CONSUMEORDERS_TOTALMONEY not in", values, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyBetween(Float value1, Float value2) {
            addCriterion("CONSUMEORDERS_TOTALMONEY between", value1, value2, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersTotalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("CONSUMEORDERS_TOTALMONEY not between", value1, value2, "consumeordersTotalmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyIsNull() {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyIsNotNull() {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY =", value, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyNotEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY <>", value, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyGreaterThan(Float value) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY >", value, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY >=", value, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyLessThan(Float value) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY <", value, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyLessThanOrEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY <=", value, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyIn(List<Float> values) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY in", values, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyNotIn(List<Float> values) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY not in", values, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyBetween(Float value1, Float value2) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY between", value1, value2, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersDiscountmoneyNotBetween(Float value1, Float value2) {
            addCriterion("CONSUMEORDERS_DISCOUNTMONEY not between", value1, value2, "consumeordersDiscountmoney");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointIsNull() {
            addCriterion("CONSUMEORDERS_GAVEPOINT is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointIsNotNull() {
            addCriterion("CONSUMEORDERS_GAVEPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_GAVEPOINT =", value, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointNotEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_GAVEPOINT <>", value, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointGreaterThan(Integer value) {
            addCriterion("CONSUMEORDERS_GAVEPOINT >", value, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_GAVEPOINT >=", value, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointLessThan(Integer value) {
            addCriterion("CONSUMEORDERS_GAVEPOINT <", value, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_GAVEPOINT <=", value, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_GAVEPOINT in", values, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointNotIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_GAVEPOINT not in", values, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_GAVEPOINT between", value1, value2, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersGavepointNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_GAVEPOINT not between", value1, value2, "consumeordersGavepoint");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashIsNull() {
            addCriterion("CONSUMEORDERS_RECASH is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashIsNotNull() {
            addCriterion("CONSUMEORDERS_RECASH is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_RECASH =", value, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashNotEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_RECASH <>", value, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashGreaterThan(Float value) {
            addCriterion("CONSUMEORDERS_RECASH >", value, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashGreaterThanOrEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_RECASH >=", value, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashLessThan(Float value) {
            addCriterion("CONSUMEORDERS_RECASH <", value, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashLessThanOrEqualTo(Float value) {
            addCriterion("CONSUMEORDERS_RECASH <=", value, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashIn(List<Float> values) {
            addCriterion("CONSUMEORDERS_RECASH in", values, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashNotIn(List<Float> values) {
            addCriterion("CONSUMEORDERS_RECASH not in", values, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashBetween(Float value1, Float value2) {
            addCriterion("CONSUMEORDERS_RECASH between", value1, value2, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRecashNotBetween(Float value1, Float value2) {
            addCriterion("CONSUMEORDERS_RECASH not between", value1, value2, "consumeordersRecash");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkIsNull() {
            addCriterion("CONSUMEORDERS_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkIsNotNull() {
            addCriterion("CONSUMEORDERS_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkEqualTo(String value) {
            addCriterion("CONSUMEORDERS_REMARK =", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkNotEqualTo(String value) {
            addCriterion("CONSUMEORDERS_REMARK <>", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkGreaterThan(String value) {
            addCriterion("CONSUMEORDERS_REMARK >", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUMEORDERS_REMARK >=", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkLessThan(String value) {
            addCriterion("CONSUMEORDERS_REMARK <", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkLessThanOrEqualTo(String value) {
            addCriterion("CONSUMEORDERS_REMARK <=", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkLike(String value) {
            addCriterion("CONSUMEORDERS_REMARK like", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkNotLike(String value) {
            addCriterion("CONSUMEORDERS_REMARK not like", value, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkIn(List<String> values) {
            addCriterion("CONSUMEORDERS_REMARK in", values, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkNotIn(List<String> values) {
            addCriterion("CONSUMEORDERS_REMARK not in", values, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkBetween(String value1, String value2) {
            addCriterion("CONSUMEORDERS_REMARK between", value1, value2, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersRemarkNotBetween(String value1, String value2) {
            addCriterion("CONSUMEORDERS_REMARK not between", value1, value2, "consumeordersRemark");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeIsNull() {
            addCriterion("CONSUMEORDERS_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeIsNotNull() {
            addCriterion("CONSUMEORDERS_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeEqualTo(Date value) {
            addCriterion("CONSUMEORDERS_CREATETIME =", value, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeNotEqualTo(Date value) {
            addCriterion("CONSUMEORDERS_CREATETIME <>", value, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeGreaterThan(Date value) {
            addCriterion("CONSUMEORDERS_CREATETIME >", value, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONSUMEORDERS_CREATETIME >=", value, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeLessThan(Date value) {
            addCriterion("CONSUMEORDERS_CREATETIME <", value, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CONSUMEORDERS_CREATETIME <=", value, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeIn(List<Date> values) {
            addCriterion("CONSUMEORDERS_CREATETIME in", values, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeNotIn(List<Date> values) {
            addCriterion("CONSUMEORDERS_CREATETIME not in", values, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CONSUMEORDERS_CREATETIME between", value1, value2, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CONSUMEORDERS_CREATETIME not between", value1, value2, "consumeordersCreatetime");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelIsNull() {
            addCriterion("CONSUMEORDERS_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelIsNotNull() {
            addCriterion("CONSUMEORDERS_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ISDEL =", value, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelNotEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ISDEL <>", value, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelGreaterThan(Integer value) {
            addCriterion("CONSUMEORDERS_ISDEL >", value, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ISDEL >=", value, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelLessThan(Integer value) {
            addCriterion("CONSUMEORDERS_ISDEL <", value, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUMEORDERS_ISDEL <=", value, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_ISDEL in", values, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelNotIn(List<Integer> values) {
            addCriterion("CONSUMEORDERS_ISDEL not in", values, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_ISDEL between", value1, value2, "consumeordersIsdel");
            return (Criteria) this;
        }

        public Criteria andConsumeordersIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMEORDERS_ISDEL not between", value1, value2, "consumeordersIsdel");
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