package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchanglogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchanglogsExample() {
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

        public Criteria andExchanglogsIdIsNull() {
            addCriterion("EXCHANGLOGS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdIsNotNull() {
            addCriterion("EXCHANGLOGS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ID =", value, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdNotEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ID <>", value, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdGreaterThan(Integer value) {
            addCriterion("EXCHANGLOGS_ID >", value, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ID >=", value, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdLessThan(Integer value) {
            addCriterion("EXCHANGLOGS_ID <", value, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ID <=", value, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_ID in", values, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdNotIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_ID not in", values, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_ID between", value1, value2, "exchanglogsId");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_ID not between", value1, value2, "exchanglogsId");
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

        public Criteria andMemcardsNameIsNull() {
            addCriterion("MEMCARDS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameIsNotNull() {
            addCriterion("MEMCARDS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameEqualTo(String value) {
            addCriterion("MEMCARDS_NAME =", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameNotEqualTo(String value) {
            addCriterion("MEMCARDS_NAME <>", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameGreaterThan(String value) {
            addCriterion("MEMCARDS_NAME >", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_NAME >=", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameLessThan(String value) {
            addCriterion("MEMCARDS_NAME <", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_NAME <=", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameLike(String value) {
            addCriterion("MEMCARDS_NAME like", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameNotLike(String value) {
            addCriterion("MEMCARDS_NAME not like", value, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameIn(List<String> values) {
            addCriterion("MEMCARDS_NAME in", values, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameNotIn(List<String> values) {
            addCriterion("MEMCARDS_NAME not in", values, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameBetween(String value1, String value2) {
            addCriterion("MEMCARDS_NAME between", value1, value2, "memcardsName");
            return (Criteria) this;
        }

        public Criteria andMemcardsNameNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_NAME not between", value1, value2, "memcardsName");
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

        public Criteria andExchanglogsNumberIsNull() {
            addCriterion("EXCHANGLOGS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberIsNotNull() {
            addCriterion("EXCHANGLOGS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_NUMBER =", value, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberNotEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_NUMBER <>", value, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberGreaterThan(Integer value) {
            addCriterion("EXCHANGLOGS_NUMBER >", value, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_NUMBER >=", value, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberLessThan(Integer value) {
            addCriterion("EXCHANGLOGS_NUMBER <", value, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_NUMBER <=", value, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_NUMBER in", values, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberNotIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_NUMBER not in", values, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_NUMBER between", value1, value2, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_NUMBER not between", value1, value2, "exchanglogsNumber");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointIsNull() {
            addCriterion("EXCHANGLOGS_POINT is null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointIsNotNull() {
            addCriterion("EXCHANGLOGS_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_POINT =", value, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointNotEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_POINT <>", value, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointGreaterThan(Integer value) {
            addCriterion("EXCHANGLOGS_POINT >", value, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_POINT >=", value, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointLessThan(Integer value) {
            addCriterion("EXCHANGLOGS_POINT <", value, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_POINT <=", value, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_POINT in", values, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointNotIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_POINT not in", values, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_POINT between", value1, value2, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsPointNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_POINT not between", value1, value2, "exchanglogsPoint");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeIsNull() {
            addCriterion("EXCHANGLOGS_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeIsNotNull() {
            addCriterion("EXCHANGLOGS_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeEqualTo(Date value) {
            addCriterion("EXCHANGLOGS_CREATETIME =", value, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeNotEqualTo(Date value) {
            addCriterion("EXCHANGLOGS_CREATETIME <>", value, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeGreaterThan(Date value) {
            addCriterion("EXCHANGLOGS_CREATETIME >", value, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXCHANGLOGS_CREATETIME >=", value, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeLessThan(Date value) {
            addCriterion("EXCHANGLOGS_CREATETIME <", value, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("EXCHANGLOGS_CREATETIME <=", value, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeIn(List<Date> values) {
            addCriterion("EXCHANGLOGS_CREATETIME in", values, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeNotIn(List<Date> values) {
            addCriterion("EXCHANGLOGS_CREATETIME not in", values, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("EXCHANGLOGS_CREATETIME between", value1, value2, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("EXCHANGLOGS_CREATETIME not between", value1, value2, "exchanglogsCreatetime");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelIsNull() {
            addCriterion("EXCHANGLOGS_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelIsNotNull() {
            addCriterion("EXCHANGLOGS_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ISDEL =", value, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelNotEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ISDEL <>", value, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelGreaterThan(Integer value) {
            addCriterion("EXCHANGLOGS_ISDEL >", value, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ISDEL >=", value, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelLessThan(Integer value) {
            addCriterion("EXCHANGLOGS_ISDEL <", value, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("EXCHANGLOGS_ISDEL <=", value, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_ISDEL in", values, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelNotIn(List<Integer> values) {
            addCriterion("EXCHANGLOGS_ISDEL not in", values, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_ISDEL between", value1, value2, "exchanglogsIsdel");
            return (Criteria) this;
        }

        public Criteria andExchanglogsIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCHANGLOGS_ISDEL not between", value1, value2, "exchanglogsIsdel");
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