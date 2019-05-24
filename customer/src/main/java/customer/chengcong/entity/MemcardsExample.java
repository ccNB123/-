package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemcardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemcardsExample() {
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

        public Criteria andMemcardsPasswordIsNull() {
            addCriterion("MEMCARDS_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordIsNotNull() {
            addCriterion("MEMCARDS_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordEqualTo(String value) {
            addCriterion("MEMCARDS_PASSWORD =", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordNotEqualTo(String value) {
            addCriterion("MEMCARDS_PASSWORD <>", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordGreaterThan(String value) {
            addCriterion("MEMCARDS_PASSWORD >", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_PASSWORD >=", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordLessThan(String value) {
            addCriterion("MEMCARDS_PASSWORD <", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_PASSWORD <=", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordLike(String value) {
            addCriterion("MEMCARDS_PASSWORD like", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordNotLike(String value) {
            addCriterion("MEMCARDS_PASSWORD not like", value, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordIn(List<String> values) {
            addCriterion("MEMCARDS_PASSWORD in", values, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordNotIn(List<String> values) {
            addCriterion("MEMCARDS_PASSWORD not in", values, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordBetween(String value1, String value2) {
            addCriterion("MEMCARDS_PASSWORD between", value1, value2, "memcardsPassword");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasswordNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_PASSWORD not between", value1, value2, "memcardsPassword");
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

        public Criteria andMemcardsSexIsNull() {
            addCriterion("MEMCARDS_SEX is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexIsNotNull() {
            addCriterion("MEMCARDS_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexEqualTo(String value) {
            addCriterion("MEMCARDS_SEX =", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexNotEqualTo(String value) {
            addCriterion("MEMCARDS_SEX <>", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexGreaterThan(String value) {
            addCriterion("MEMCARDS_SEX >", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_SEX >=", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexLessThan(String value) {
            addCriterion("MEMCARDS_SEX <", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_SEX <=", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexLike(String value) {
            addCriterion("MEMCARDS_SEX like", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexNotLike(String value) {
            addCriterion("MEMCARDS_SEX not like", value, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexIn(List<String> values) {
            addCriterion("MEMCARDS_SEX in", values, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexNotIn(List<String> values) {
            addCriterion("MEMCARDS_SEX not in", values, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexBetween(String value1, String value2) {
            addCriterion("MEMCARDS_SEX between", value1, value2, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsSexNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_SEX not between", value1, value2, "memcardsSex");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileIsNull() {
            addCriterion("MEMCARDS_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileIsNotNull() {
            addCriterion("MEMCARDS_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileEqualTo(String value) {
            addCriterion("MEMCARDS_MOBILE =", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileNotEqualTo(String value) {
            addCriterion("MEMCARDS_MOBILE <>", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileGreaterThan(String value) {
            addCriterion("MEMCARDS_MOBILE >", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_MOBILE >=", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileLessThan(String value) {
            addCriterion("MEMCARDS_MOBILE <", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_MOBILE <=", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileLike(String value) {
            addCriterion("MEMCARDS_MOBILE like", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileNotLike(String value) {
            addCriterion("MEMCARDS_MOBILE not like", value, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileIn(List<String> values) {
            addCriterion("MEMCARDS_MOBILE in", values, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileNotIn(List<String> values) {
            addCriterion("MEMCARDS_MOBILE not in", values, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileBetween(String value1, String value2) {
            addCriterion("MEMCARDS_MOBILE between", value1, value2, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsMobileNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_MOBILE not between", value1, value2, "memcardsMobile");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoIsNull() {
            addCriterion("MEMCARDS_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoIsNotNull() {
            addCriterion("MEMCARDS_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoEqualTo(String value) {
            addCriterion("MEMCARDS_PHOTO =", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoNotEqualTo(String value) {
            addCriterion("MEMCARDS_PHOTO <>", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoGreaterThan(String value) {
            addCriterion("MEMCARDS_PHOTO >", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_PHOTO >=", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoLessThan(String value) {
            addCriterion("MEMCARDS_PHOTO <", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_PHOTO <=", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoLike(String value) {
            addCriterion("MEMCARDS_PHOTO like", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoNotLike(String value) {
            addCriterion("MEMCARDS_PHOTO not like", value, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoIn(List<String> values) {
            addCriterion("MEMCARDS_PHOTO in", values, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoNotIn(List<String> values) {
            addCriterion("MEMCARDS_PHOTO not in", values, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoBetween(String value1, String value2) {
            addCriterion("MEMCARDS_PHOTO between", value1, value2, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsPhotoNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_PHOTO not between", value1, value2, "memcardsPhoto");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthIsNull() {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthIsNotNull() {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH =", value, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH <>", value, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthGreaterThan(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH >", value, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH >=", value, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthLessThan(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH <", value, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH <=", value, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthIn(List<Integer> values) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH in", values, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH not in", values, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH between", value1, value2, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_BIRTHDAY_MONTH not between", value1, value2, "memcardsBirthdayMonth");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayIsNull() {
            addCriterion("MEMCARDS_BIRTHDAY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayIsNotNull() {
            addCriterion("MEMCARDS_BIRTHDAY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY =", value, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY <>", value, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayGreaterThan(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY >", value, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY >=", value, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayLessThan(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY <", value, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY <=", value, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayIn(List<Integer> values) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY in", values, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY not in", values, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY between", value1, value2, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdayDayNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_BIRTHDAY_DAY not between", value1, value2, "memcardsBirthdayDay");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeIsNull() {
            addCriterion("MEMCARDS_BIRTHDAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeIsNotNull() {
            addCriterion("MEMCARDS_BIRTHDAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE =", value, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE <>", value, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeGreaterThan(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE >", value, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE >=", value, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeLessThan(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE <", value, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE <=", value, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeIn(List<Integer> values) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE in", values, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE not in", values, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE between", value1, value2, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsBirthdaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_BIRTHDAYTYPE not between", value1, value2, "memcardsBirthdaytype");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastIsNull() {
            addCriterion("MEMCARDS_ISPAST is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastIsNotNull() {
            addCriterion("MEMCARDS_ISPAST is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPAST =", value, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPAST <>", value, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastGreaterThan(Integer value) {
            addCriterion("MEMCARDS_ISPAST >", value, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPAST >=", value, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastLessThan(Integer value) {
            addCriterion("MEMCARDS_ISPAST <", value, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPAST <=", value, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastIn(List<Integer> values) {
            addCriterion("MEMCARDS_ISPAST in", values, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_ISPAST not in", values, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ISPAST between", value1, value2, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspastNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ISPAST not between", value1, value2, "memcardsIspast");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeIsNull() {
            addCriterion("MEMCARDS_PASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeIsNotNull() {
            addCriterion("MEMCARDS_PASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeEqualTo(Date value) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME =", value, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME <>", value, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME >", value, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME >=", value, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeLessThan(Date value) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME <", value, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME <=", value, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeIn(List<Date> values) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME in", values, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME not in", values, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME between", value1, value2, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPasttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEMCARDS_PASTTIME not between", value1, value2, "memcardsPasttime");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointIsNull() {
            addCriterion("MEMCARDS_POINT is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointIsNotNull() {
            addCriterion("MEMCARDS_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointEqualTo(Integer value) {
            addCriterion("MEMCARDS_POINT =", value, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_POINT <>", value, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointGreaterThan(Integer value) {
            addCriterion("MEMCARDS_POINT >", value, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_POINT >=", value, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointLessThan(Integer value) {
            addCriterion("MEMCARDS_POINT <", value, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_POINT <=", value, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointIn(List<Integer> values) {
            addCriterion("MEMCARDS_POINT in", values, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_POINT not in", values, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_POINT between", value1, value2, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsPointNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_POINT not between", value1, value2, "memcardsPoint");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyIsNull() {
            addCriterion("MEMCARDS_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyIsNotNull() {
            addCriterion("MEMCARDS_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyEqualTo(Float value) {
            addCriterion("MEMCARDS_MONEY =", value, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyNotEqualTo(Float value) {
            addCriterion("MEMCARDS_MONEY <>", value, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyGreaterThan(Float value) {
            addCriterion("MEMCARDS_MONEY >", value, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("MEMCARDS_MONEY >=", value, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyLessThan(Float value) {
            addCriterion("MEMCARDS_MONEY <", value, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyLessThanOrEqualTo(Float value) {
            addCriterion("MEMCARDS_MONEY <=", value, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyIn(List<Float> values) {
            addCriterion("MEMCARDS_MONEY in", values, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyNotIn(List<Float> values) {
            addCriterion("MEMCARDS_MONEY not in", values, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyBetween(Float value1, Float value2) {
            addCriterion("MEMCARDS_MONEY between", value1, value2, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsMoneyNotBetween(Float value1, Float value2) {
            addCriterion("MEMCARDS_MONEY not between", value1, value2, "memcardsMoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyIsNull() {
            addCriterion("MEMCARDS_TOTALMONEY is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyIsNotNull() {
            addCriterion("MEMCARDS_TOTALMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyEqualTo(Float value) {
            addCriterion("MEMCARDS_TOTALMONEY =", value, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyNotEqualTo(Float value) {
            addCriterion("MEMCARDS_TOTALMONEY <>", value, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyGreaterThan(Float value) {
            addCriterion("MEMCARDS_TOTALMONEY >", value, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("MEMCARDS_TOTALMONEY >=", value, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyLessThan(Float value) {
            addCriterion("MEMCARDS_TOTALMONEY <", value, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("MEMCARDS_TOTALMONEY <=", value, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyIn(List<Float> values) {
            addCriterion("MEMCARDS_TOTALMONEY in", values, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyNotIn(List<Float> values) {
            addCriterion("MEMCARDS_TOTALMONEY not in", values, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyBetween(Float value1, Float value2) {
            addCriterion("MEMCARDS_TOTALMONEY between", value1, value2, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("MEMCARDS_TOTALMONEY not between", value1, value2, "memcardsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountIsNull() {
            addCriterion("MEMCARDS_TOTALCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountIsNotNull() {
            addCriterion("MEMCARDS_TOTALCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountEqualTo(Integer value) {
            addCriterion("MEMCARDS_TOTALCOUNT =", value, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_TOTALCOUNT <>", value, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountGreaterThan(Integer value) {
            addCriterion("MEMCARDS_TOTALCOUNT >", value, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_TOTALCOUNT >=", value, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountLessThan(Integer value) {
            addCriterion("MEMCARDS_TOTALCOUNT <", value, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_TOTALCOUNT <=", value, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountIn(List<Integer> values) {
            addCriterion("MEMCARDS_TOTALCOUNT in", values, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_TOTALCOUNT not in", values, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_TOTALCOUNT between", value1, value2, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsTotalcountNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_TOTALCOUNT not between", value1, value2, "memcardsTotalcount");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateIsNull() {
            addCriterion("MEMCARDS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateIsNotNull() {
            addCriterion("MEMCARDS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateEqualTo(Integer value) {
            addCriterion("MEMCARDS_STATE =", value, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_STATE <>", value, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateGreaterThan(Integer value) {
            addCriterion("MEMCARDS_STATE >", value, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_STATE >=", value, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateLessThan(Integer value) {
            addCriterion("MEMCARDS_STATE <", value, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_STATE <=", value, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateIn(List<Integer> values) {
            addCriterion("MEMCARDS_STATE in", values, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_STATE not in", values, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_STATE between", value1, value2, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_STATE not between", value1, value2, "memcardsState");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoIsNull() {
            addCriterion("MEMCARDS_ISPOINTAUTO is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoIsNotNull() {
            addCriterion("MEMCARDS_ISPOINTAUTO is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPOINTAUTO =", value, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPOINTAUTO <>", value, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoGreaterThan(Integer value) {
            addCriterion("MEMCARDS_ISPOINTAUTO >", value, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPOINTAUTO >=", value, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoLessThan(Integer value) {
            addCriterion("MEMCARDS_ISPOINTAUTO <", value, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISPOINTAUTO <=", value, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoIn(List<Integer> values) {
            addCriterion("MEMCARDS_ISPOINTAUTO in", values, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_ISPOINTAUTO not in", values, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ISPOINTAUTO between", value1, value2, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsIspointautoNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ISPOINTAUTO not between", value1, value2, "memcardsIspointauto");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridIsNull() {
            addCriterion("MEMCARDS_REFERERID is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridIsNotNull() {
            addCriterion("MEMCARDS_REFERERID is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridEqualTo(Integer value) {
            addCriterion("MEMCARDS_REFERERID =", value, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_REFERERID <>", value, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridGreaterThan(Integer value) {
            addCriterion("MEMCARDS_REFERERID >", value, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_REFERERID >=", value, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridLessThan(Integer value) {
            addCriterion("MEMCARDS_REFERERID <", value, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_REFERERID <=", value, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridIn(List<Integer> values) {
            addCriterion("MEMCARDS_REFERERID in", values, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_REFERERID not in", values, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_REFERERID between", value1, value2, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsRefereridNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_REFERERID not between", value1, value2, "memcardsRefererid");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardIsNull() {
            addCriterion("MEMCARDS_REFERERCARD is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardIsNotNull() {
            addCriterion("MEMCARDS_REFERERCARD is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERCARD =", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardNotEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERCARD <>", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardGreaterThan(String value) {
            addCriterion("MEMCARDS_REFERERCARD >", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERCARD >=", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardLessThan(String value) {
            addCriterion("MEMCARDS_REFERERCARD <", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERCARD <=", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardLike(String value) {
            addCriterion("MEMCARDS_REFERERCARD like", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardNotLike(String value) {
            addCriterion("MEMCARDS_REFERERCARD not like", value, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardIn(List<String> values) {
            addCriterion("MEMCARDS_REFERERCARD in", values, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardNotIn(List<String> values) {
            addCriterion("MEMCARDS_REFERERCARD not in", values, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardBetween(String value1, String value2) {
            addCriterion("MEMCARDS_REFERERCARD between", value1, value2, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferercardNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_REFERERCARD not between", value1, value2, "memcardsReferercard");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameIsNull() {
            addCriterion("MEMCARDS_REFERERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameIsNotNull() {
            addCriterion("MEMCARDS_REFERERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERNAME =", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameNotEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERNAME <>", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameGreaterThan(String value) {
            addCriterion("MEMCARDS_REFERERNAME >", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERNAME >=", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameLessThan(String value) {
            addCriterion("MEMCARDS_REFERERNAME <", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameLessThanOrEqualTo(String value) {
            addCriterion("MEMCARDS_REFERERNAME <=", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameLike(String value) {
            addCriterion("MEMCARDS_REFERERNAME like", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameNotLike(String value) {
            addCriterion("MEMCARDS_REFERERNAME not like", value, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameIn(List<String> values) {
            addCriterion("MEMCARDS_REFERERNAME in", values, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameNotIn(List<String> values) {
            addCriterion("MEMCARDS_REFERERNAME not in", values, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameBetween(String value1, String value2) {
            addCriterion("MEMCARDS_REFERERNAME between", value1, value2, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsReferernameNotBetween(String value1, String value2) {
            addCriterion("MEMCARDS_REFERERNAME not between", value1, value2, "memcardsReferername");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeIsNull() {
            addCriterion("MEMCARDS_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeIsNotNull() {
            addCriterion("MEMCARDS_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeEqualTo(Date value) {
            addCriterion("MEMCARDS_CREATETIME =", value, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeNotEqualTo(Date value) {
            addCriterion("MEMCARDS_CREATETIME <>", value, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeGreaterThan(Date value) {
            addCriterion("MEMCARDS_CREATETIME >", value, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MEMCARDS_CREATETIME >=", value, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeLessThan(Date value) {
            addCriterion("MEMCARDS_CREATETIME <", value, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("MEMCARDS_CREATETIME <=", value, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeIn(List<Date> values) {
            addCriterion("MEMCARDS_CREATETIME in", values, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeNotIn(List<Date> values) {
            addCriterion("MEMCARDS_CREATETIME not in", values, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("MEMCARDS_CREATETIME between", value1, value2, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("MEMCARDS_CREATETIME not between", value1, value2, "memcardsCreatetime");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelIsNull() {
            addCriterion("MEMCARDS_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelIsNotNull() {
            addCriterion("MEMCARDS_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISDEL =", value, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelNotEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISDEL <>", value, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelGreaterThan(Integer value) {
            addCriterion("MEMCARDS_ISDEL >", value, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISDEL >=", value, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelLessThan(Integer value) {
            addCriterion("MEMCARDS_ISDEL <", value, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("MEMCARDS_ISDEL <=", value, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelIn(List<Integer> values) {
            addCriterion("MEMCARDS_ISDEL in", values, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelNotIn(List<Integer> values) {
            addCriterion("MEMCARDS_ISDEL not in", values, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ISDEL between", value1, value2, "memcardsIsdel");
            return (Criteria) this;
        }

        public Criteria andMemcardsIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMCARDS_ISDEL not between", value1, value2, "memcardsIsdel");
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