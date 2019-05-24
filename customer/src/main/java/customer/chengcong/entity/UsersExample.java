package customer.chengcong.entity;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsersLoginnameIsNull() {
            addCriterion("USERS_LOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameIsNotNull() {
            addCriterion("USERS_LOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameEqualTo(String value) {
            addCriterion("USERS_LOGINNAME =", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameNotEqualTo(String value) {
            addCriterion("USERS_LOGINNAME <>", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameGreaterThan(String value) {
            addCriterion("USERS_LOGINNAME >", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_LOGINNAME >=", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameLessThan(String value) {
            addCriterion("USERS_LOGINNAME <", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameLessThanOrEqualTo(String value) {
            addCriterion("USERS_LOGINNAME <=", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameLike(String value) {
            addCriterion("USERS_LOGINNAME like", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameNotLike(String value) {
            addCriterion("USERS_LOGINNAME not like", value, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameIn(List<String> values) {
            addCriterion("USERS_LOGINNAME in", values, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameNotIn(List<String> values) {
            addCriterion("USERS_LOGINNAME not in", values, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameBetween(String value1, String value2) {
            addCriterion("USERS_LOGINNAME between", value1, value2, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersLoginnameNotBetween(String value1, String value2) {
            addCriterion("USERS_LOGINNAME not between", value1, value2, "usersLoginname");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNull() {
            addCriterion("USERS_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNotNull() {
            addCriterion("USERS_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordEqualTo(String value) {
            addCriterion("USERS_PASSWORD =", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotEqualTo(String value) {
            addCriterion("USERS_PASSWORD <>", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThan(String value) {
            addCriterion("USERS_PASSWORD >", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_PASSWORD >=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThan(String value) {
            addCriterion("USERS_PASSWORD <", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThanOrEqualTo(String value) {
            addCriterion("USERS_PASSWORD <=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLike(String value) {
            addCriterion("USERS_PASSWORD like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotLike(String value) {
            addCriterion("USERS_PASSWORD not like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIn(List<String> values) {
            addCriterion("USERS_PASSWORD in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotIn(List<String> values) {
            addCriterion("USERS_PASSWORD not in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordBetween(String value1, String value2) {
            addCriterion("USERS_PASSWORD between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotBetween(String value1, String value2) {
            addCriterion("USERS_PASSWORD not between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameIsNull() {
            addCriterion("USERS_REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameIsNotNull() {
            addCriterion("USERS_REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameEqualTo(String value) {
            addCriterion("USERS_REALNAME =", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameNotEqualTo(String value) {
            addCriterion("USERS_REALNAME <>", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameGreaterThan(String value) {
            addCriterion("USERS_REALNAME >", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_REALNAME >=", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameLessThan(String value) {
            addCriterion("USERS_REALNAME <", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameLessThanOrEqualTo(String value) {
            addCriterion("USERS_REALNAME <=", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameLike(String value) {
            addCriterion("USERS_REALNAME like", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameNotLike(String value) {
            addCriterion("USERS_REALNAME not like", value, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameIn(List<String> values) {
            addCriterion("USERS_REALNAME in", values, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameNotIn(List<String> values) {
            addCriterion("USERS_REALNAME not in", values, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameBetween(String value1, String value2) {
            addCriterion("USERS_REALNAME between", value1, value2, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersRealnameNotBetween(String value1, String value2) {
            addCriterion("USERS_REALNAME not between", value1, value2, "usersRealname");
            return (Criteria) this;
        }

        public Criteria andUsersSexIsNull() {
            addCriterion("USERS_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUsersSexIsNotNull() {
            addCriterion("USERS_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsersSexEqualTo(String value) {
            addCriterion("USERS_SEX =", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotEqualTo(String value) {
            addCriterion("USERS_SEX <>", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexGreaterThan(String value) {
            addCriterion("USERS_SEX >", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_SEX >=", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexLessThan(String value) {
            addCriterion("USERS_SEX <", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexLessThanOrEqualTo(String value) {
            addCriterion("USERS_SEX <=", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexLike(String value) {
            addCriterion("USERS_SEX like", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotLike(String value) {
            addCriterion("USERS_SEX not like", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexIn(List<String> values) {
            addCriterion("USERS_SEX in", values, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotIn(List<String> values) {
            addCriterion("USERS_SEX not in", values, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexBetween(String value1, String value2) {
            addCriterion("USERS_SEX between", value1, value2, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotBetween(String value1, String value2) {
            addCriterion("USERS_SEX not between", value1, value2, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneIsNull() {
            addCriterion("USERS_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneIsNotNull() {
            addCriterion("USERS_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneEqualTo(String value) {
            addCriterion("USERS_TELEPHONE =", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneNotEqualTo(String value) {
            addCriterion("USERS_TELEPHONE <>", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneGreaterThan(String value) {
            addCriterion("USERS_TELEPHONE >", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_TELEPHONE >=", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneLessThan(String value) {
            addCriterion("USERS_TELEPHONE <", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneLessThanOrEqualTo(String value) {
            addCriterion("USERS_TELEPHONE <=", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneLike(String value) {
            addCriterion("USERS_TELEPHONE like", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneNotLike(String value) {
            addCriterion("USERS_TELEPHONE not like", value, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneIn(List<String> values) {
            addCriterion("USERS_TELEPHONE in", values, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneNotIn(List<String> values) {
            addCriterion("USERS_TELEPHONE not in", values, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneBetween(String value1, String value2) {
            addCriterion("USERS_TELEPHONE between", value1, value2, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersTelephoneNotBetween(String value1, String value2) {
            addCriterion("USERS_TELEPHONE not between", value1, value2, "usersTelephone");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIsNull() {
            addCriterion("USERS_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIsNotNull() {
            addCriterion("USERS_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleEqualTo(Integer value) {
            addCriterion("USERS_ROLE =", value, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleNotEqualTo(Integer value) {
            addCriterion("USERS_ROLE <>", value, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleGreaterThan(Integer value) {
            addCriterion("USERS_ROLE >", value, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERS_ROLE >=", value, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleLessThan(Integer value) {
            addCriterion("USERS_ROLE <", value, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleLessThanOrEqualTo(Integer value) {
            addCriterion("USERS_ROLE <=", value, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIn(List<Integer> values) {
            addCriterion("USERS_ROLE in", values, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleNotIn(List<Integer> values) {
            addCriterion("USERS_ROLE not in", values, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ROLE between", value1, value2, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ROLE not between", value1, value2, "usersRole");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteIsNull() {
            addCriterion("USERS_CANDELETE is null");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteIsNotNull() {
            addCriterion("USERS_CANDELETE is not null");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteEqualTo(Integer value) {
            addCriterion("USERS_CANDELETE =", value, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteNotEqualTo(Integer value) {
            addCriterion("USERS_CANDELETE <>", value, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteGreaterThan(Integer value) {
            addCriterion("USERS_CANDELETE >", value, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERS_CANDELETE >=", value, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteLessThan(Integer value) {
            addCriterion("USERS_CANDELETE <", value, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteLessThanOrEqualTo(Integer value) {
            addCriterion("USERS_CANDELETE <=", value, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteIn(List<Integer> values) {
            addCriterion("USERS_CANDELETE in", values, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteNotIn(List<Integer> values) {
            addCriterion("USERS_CANDELETE not in", values, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteBetween(Integer value1, Integer value2) {
            addCriterion("USERS_CANDELETE between", value1, value2, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersCandeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("USERS_CANDELETE not between", value1, value2, "usersCandelete");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelIsNull() {
            addCriterion("USERS_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelIsNotNull() {
            addCriterion("USERS_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelEqualTo(Integer value) {
            addCriterion("USERS_ISDEL =", value, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelNotEqualTo(Integer value) {
            addCriterion("USERS_ISDEL <>", value, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelGreaterThan(Integer value) {
            addCriterion("USERS_ISDEL >", value, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERS_ISDEL >=", value, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelLessThan(Integer value) {
            addCriterion("USERS_ISDEL <", value, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("USERS_ISDEL <=", value, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelIn(List<Integer> values) {
            addCriterion("USERS_ISDEL in", values, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelNotIn(List<Integer> values) {
            addCriterion("USERS_ISDEL not in", values, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ISDEL between", value1, value2, "usersIsdel");
            return (Criteria) this;
        }

        public Criteria andUsersIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ISDEL not between", value1, value2, "usersIsdel");
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