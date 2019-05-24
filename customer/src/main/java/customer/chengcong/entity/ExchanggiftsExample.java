package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.List;

public class ExchanggiftsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchanggiftsExample() {
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

        public Criteria andExchanggiftsGiftcodeIsNull() {
            addCriterion("EXCHANGGIFTS_GIFTCODE is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeIsNotNull() {
            addCriterion("EXCHANGGIFTS_GIFTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE =", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeNotEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE <>", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeGreaterThan(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE >", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE >=", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeLessThan(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE <", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE <=", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeLike(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE like", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeNotLike(String value) {
            addCriterion("EXCHANGGIFTS_GIFTCODE not like", value, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_GIFTCODE in", values, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeNotIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_GIFTCODE not in", values, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_GIFTCODE between", value1, value2, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftcodeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_GIFTCODE not between", value1, value2, "exchanggiftsGiftcode");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameIsNull() {
            addCriterion("EXCHANGGIFTS_GIFTNAME is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameIsNotNull() {
            addCriterion("EXCHANGGIFTS_GIFTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME =", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameNotEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME <>", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameGreaterThan(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME >", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME >=", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameLessThan(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME <", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME <=", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameLike(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME like", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameNotLike(String value) {
            addCriterion("EXCHANGGIFTS_GIFTNAME not like", value, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_GIFTNAME in", values, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameNotIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_GIFTNAME not in", values, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_GIFTNAME between", value1, value2, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsGiftnameNotBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_GIFTNAME not between", value1, value2, "exchanggiftsGiftname");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoIsNull() {
            addCriterion("EXCHANGGIFTS_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoIsNotNull() {
            addCriterion("EXCHANGGIFTS_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO =", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoNotEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO <>", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoGreaterThan(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO >", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO >=", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoLessThan(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO <", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO <=", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoLike(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO like", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoNotLike(String value) {
            addCriterion("EXCHANGGIFTS_PHOTO not like", value, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_PHOTO in", values, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoNotIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_PHOTO not in", values, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_PHOTO between", value1, value2, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPhotoNotBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_PHOTO not between", value1, value2, "exchanggiftsPhoto");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointIsNull() {
            addCriterion("EXCHANGGIFTS_POINT is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointIsNotNull() {
            addCriterion("EXCHANGGIFTS_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_POINT =", value, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointNotEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_POINT <>", value, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointGreaterThan(Integer value) {
            addCriterion("EXCHANGGIFTS_POINT >", value, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_POINT >=", value, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointLessThan(Integer value) {
            addCriterion("EXCHANGGIFTS_POINT <", value, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_POINT <=", value, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_POINT in", values, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointNotIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_POINT not in", values, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_POINT between", value1, value2, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsPointNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_POINT not between", value1, value2, "exchanggiftsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerIsNull() {
            addCriterion("EXCHANGGIFTS_INTEGER is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerIsNotNull() {
            addCriterion("EXCHANGGIFTS_INTEGER is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_INTEGER =", value, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerNotEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_INTEGER <>", value, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerGreaterThan(Integer value) {
            addCriterion("EXCHANGGIFTS_INTEGER >", value, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_INTEGER >=", value, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerLessThan(Integer value) {
            addCriterion("EXCHANGGIFTS_INTEGER <", value, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_INTEGER <=", value, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_INTEGER in", values, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerNotIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_INTEGER not in", values, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_INTEGER between", value1, value2, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIntegerNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_INTEGER not between", value1, value2, "exchanggiftsInteger");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumIsNull() {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumIsNotNull() {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM =", value, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumNotEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM <>", value, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumGreaterThan(Integer value) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM >", value, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM >=", value, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumLessThan(Integer value) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM <", value, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM <=", value, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM in", values, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumNotIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM not in", values, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM between", value1, value2, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsExchangnumNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_EXCHANGNUM not between", value1, value2, "exchanggiftsExchangnum");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkIsNull() {
            addCriterion("EXCHANGGIFTS_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkIsNotNull() {
            addCriterion("EXCHANGGIFTS_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_REMARK =", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkNotEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_REMARK <>", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkGreaterThan(String value) {
            addCriterion("EXCHANGGIFTS_REMARK >", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_REMARK >=", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkLessThan(String value) {
            addCriterion("EXCHANGGIFTS_REMARK <", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGGIFTS_REMARK <=", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkLike(String value) {
            addCriterion("EXCHANGGIFTS_REMARK like", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkNotLike(String value) {
            addCriterion("EXCHANGGIFTS_REMARK not like", value, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_REMARK in", values, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkNotIn(List<String> values) {
            addCriterion("EXCHANGGIFTS_REMARK not in", values, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_REMARK between", value1, value2, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsRemarkNotBetween(String value1, String value2) {
            addCriterion("EXCHANGGIFTS_REMARK not between", value1, value2, "exchanggiftsRemark");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateIsNull() {
            addCriterion("EXCHANGGIFTS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateIsNotNull() {
            addCriterion("EXCHANGGIFTS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_STATE =", value, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateNotEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_STATE <>", value, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateGreaterThan(Integer value) {
            addCriterion("EXCHANGGIFTS_STATE >", value, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_STATE >=", value, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateLessThan(Integer value) {
            addCriterion("EXCHANGGIFTS_STATE <", value, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_STATE <=", value, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_STATE in", values, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateNotIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_STATE not in", values, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_STATE between", value1, value2, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_STATE not between", value1, value2, "exchanggiftsState");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelIsNull() {
            addCriterion("EXCHANGGIFTS_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelIsNotNull() {
            addCriterion("EXCHANGGIFTS_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ISDEL =", value, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelNotEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ISDEL <>", value, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelGreaterThan(Integer value) {
            addCriterion("EXCHANGGIFTS_ISDEL >", value, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ISDEL >=", value, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelLessThan(Integer value) {
            addCriterion("EXCHANGGIFTS_ISDEL <", value, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGGIFTS_ISDEL <=", value, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_ISDEL in", values, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelNotIn(List<Integer> values) {
            addCriterion("EXCHANGGIFTS_ISDEL not in", values, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_ISDEL between", value1, value2, "exchanggiftsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanggiftsIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGGIFTS_ISDEL not between", value1, value2, "exchanggiftsIsdel");
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