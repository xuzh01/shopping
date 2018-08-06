package cn.edu.jxufe.shopping.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MemberinfoExample() {
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

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNull() {
            addCriterion("member_mobile is null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNotNull() {
            addCriterion("member_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileEqualTo(String value) {
            addCriterion("member_mobile =", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotEqualTo(String value) {
            addCriterion("member_mobile <>", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThan(String value) {
            addCriterion("member_mobile >", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThanOrEqualTo(String value) {
            addCriterion("member_mobile >=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThan(String value) {
            addCriterion("member_mobile <", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThanOrEqualTo(String value) {
            addCriterion("member_mobile <=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLike(String value) {
            addCriterion("member_mobile like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotLike(String value) {
            addCriterion("member_mobile not like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIn(List<String> values) {
            addCriterion("member_mobile in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotIn(List<String> values) {
            addCriterion("member_mobile not in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileBetween(String value1, String value2) {
            addCriterion("member_mobile between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotBetween(String value1, String value2) {
            addCriterion("member_mobile not between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNull() {
            addCriterion("member_birthday is null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNotNull() {
            addCriterion("member_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayEqualTo(Long value) {
            addCriterion("member_birthday =", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotEqualTo(Long value) {
            addCriterion("member_birthday <>", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThan(Long value) {
            addCriterion("member_birthday >", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThanOrEqualTo(Long value) {
            addCriterion("member_birthday >=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThan(Long value) {
            addCriterion("member_birthday <", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThanOrEqualTo(Long value) {
            addCriterion("member_birthday <=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIn(List<Long> values) {
            addCriterion("member_birthday in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotIn(List<Long> values) {
            addCriterion("member_birthday not in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayBetween(Long value1, Long value2) {
            addCriterion("member_birthday between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotBetween(Long value1, Long value2) {
            addCriterion("member_birthday not between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdIsNull() {
            addCriterion("member_passwd is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdIsNotNull() {
            addCriterion("member_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdEqualTo(String value) {
            addCriterion("member_passwd =", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotEqualTo(String value) {
            addCriterion("member_passwd <>", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdGreaterThan(String value) {
            addCriterion("member_passwd >", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("member_passwd >=", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdLessThan(String value) {
            addCriterion("member_passwd <", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdLessThanOrEqualTo(String value) {
            addCriterion("member_passwd <=", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdLike(String value) {
            addCriterion("member_passwd like", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotLike(String value) {
            addCriterion("member_passwd not like", value, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdIn(List<String> values) {
            addCriterion("member_passwd in", values, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotIn(List<String> values) {
            addCriterion("member_passwd not in", values, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdBetween(String value1, String value2) {
            addCriterion("member_passwd between", value1, value2, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberPasswdNotBetween(String value1, String value2) {
            addCriterion("member_passwd not between", value1, value2, "memberPasswd");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberWwIsNull() {
            addCriterion("member_ww is null");
            return (Criteria) this;
        }

        public Criteria andMemberWwIsNotNull() {
            addCriterion("member_ww is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWwEqualTo(String value) {
            addCriterion("member_ww =", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotEqualTo(String value) {
            addCriterion("member_ww <>", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwGreaterThan(String value) {
            addCriterion("member_ww >", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwGreaterThanOrEqualTo(String value) {
            addCriterion("member_ww >=", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwLessThan(String value) {
            addCriterion("member_ww <", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwLessThanOrEqualTo(String value) {
            addCriterion("member_ww <=", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwLike(String value) {
            addCriterion("member_ww like", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotLike(String value) {
            addCriterion("member_ww not like", value, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwIn(List<String> values) {
            addCriterion("member_ww in", values, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotIn(List<String> values) {
            addCriterion("member_ww not in", values, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwBetween(String value1, String value2) {
            addCriterion("member_ww between", value1, value2, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberWwNotBetween(String value1, String value2) {
            addCriterion("member_ww not between", value1, value2, "memberWw");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumIsNull() {
            addCriterion("member_login_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumIsNotNull() {
            addCriterion("member_login_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumEqualTo(Integer value) {
            addCriterion("member_login_num =", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumNotEqualTo(Integer value) {
            addCriterion("member_login_num <>", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumGreaterThan(Integer value) {
            addCriterion("member_login_num >", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_login_num >=", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumLessThan(Integer value) {
            addCriterion("member_login_num <", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_login_num <=", value, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumIn(List<Integer> values) {
            addCriterion("member_login_num in", values, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumNotIn(List<Integer> values) {
            addCriterion("member_login_num not in", values, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("member_login_num between", value1, value2, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andMemberLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_login_num not between", value1, value2, "memberLoginNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeIsNull() {
            addCriterion("member_login_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeIsNotNull() {
            addCriterion("member_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeEqualTo(Date value) {
            addCriterion("member_login_time =", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotEqualTo(Date value) {
            addCriterion("member_login_time <>", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeGreaterThan(Date value) {
            addCriterion("member_login_time >", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_login_time >=", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeLessThan(Date value) {
            addCriterion("member_login_time <", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_login_time <=", value, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeIn(List<Date> values) {
            addCriterion("member_login_time in", values, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotIn(List<Date> values) {
            addCriterion("member_login_time not in", values, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeBetween(Date value1, Date value2) {
            addCriterion("member_login_time between", value1, value2, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_login_time not between", value1, value2, "memberLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeIsNull() {
            addCriterion("member_old_login_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeIsNotNull() {
            addCriterion("member_old_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeEqualTo(Date value) {
            addCriterion("member_old_login_time =", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotEqualTo(Date value) {
            addCriterion("member_old_login_time <>", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeGreaterThan(Date value) {
            addCriterion("member_old_login_time >", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_old_login_time >=", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeLessThan(Date value) {
            addCriterion("member_old_login_time <", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_old_login_time <=", value, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeIn(List<Date> values) {
            addCriterion("member_old_login_time in", values, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotIn(List<Date> values) {
            addCriterion("member_old_login_time not in", values, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeBetween(Date value1, Date value2) {
            addCriterion("member_old_login_time between", value1, value2, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_old_login_time not between", value1, value2, "memberOldLoginTime");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpIsNull() {
            addCriterion("member_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpIsNotNull() {
            addCriterion("member_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpEqualTo(String value) {
            addCriterion("member_login_ip =", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotEqualTo(String value) {
            addCriterion("member_login_ip <>", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpGreaterThan(String value) {
            addCriterion("member_login_ip >", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("member_login_ip >=", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpLessThan(String value) {
            addCriterion("member_login_ip <", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpLessThanOrEqualTo(String value) {
            addCriterion("member_login_ip <=", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpLike(String value) {
            addCriterion("member_login_ip like", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotLike(String value) {
            addCriterion("member_login_ip not like", value, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpIn(List<String> values) {
            addCriterion("member_login_ip in", values, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotIn(List<String> values) {
            addCriterion("member_login_ip not in", values, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpBetween(String value1, String value2) {
            addCriterion("member_login_ip between", value1, value2, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberLoginIpNotBetween(String value1, String value2) {
            addCriterion("member_login_ip not between", value1, value2, "memberLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpIsNull() {
            addCriterion("member_old_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpIsNotNull() {
            addCriterion("member_old_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpEqualTo(String value) {
            addCriterion("member_old_login_ip =", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotEqualTo(String value) {
            addCriterion("member_old_login_ip <>", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpGreaterThan(String value) {
            addCriterion("member_old_login_ip >", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("member_old_login_ip >=", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpLessThan(String value) {
            addCriterion("member_old_login_ip <", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpLessThanOrEqualTo(String value) {
            addCriterion("member_old_login_ip <=", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpLike(String value) {
            addCriterion("member_old_login_ip like", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotLike(String value) {
            addCriterion("member_old_login_ip not like", value, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpIn(List<String> values) {
            addCriterion("member_old_login_ip in", values, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotIn(List<String> values) {
            addCriterion("member_old_login_ip not in", values, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpBetween(String value1, String value2) {
            addCriterion("member_old_login_ip between", value1, value2, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andMemberOldLoginIpNotBetween(String value1, String value2) {
            addCriterion("member_old_login_ip not between", value1, value2, "memberOldLoginIp");
            return (Criteria) this;
        }

        public Criteria andIsSellIsNull() {
            addCriterion("is_sell is null");
            return (Criteria) this;
        }

        public Criteria andIsSellIsNotNull() {
            addCriterion("is_sell is not null");
            return (Criteria) this;
        }

        public Criteria andIsSellEqualTo(Boolean value) {
            addCriterion("is_sell =", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellNotEqualTo(Boolean value) {
            addCriterion("is_sell <>", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellGreaterThan(Boolean value) {
            addCriterion("is_sell >", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_sell >=", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellLessThan(Boolean value) {
            addCriterion("is_sell <", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellLessThanOrEqualTo(Boolean value) {
            addCriterion("is_sell <=", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellIn(List<Boolean> values) {
            addCriterion("is_sell in", values, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellNotIn(List<Boolean> values) {
            addCriterion("is_sell not in", values, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sell between", value1, value2, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sell not between", value1, value2, "isSell");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNull() {
            addCriterion("member_state is null");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNotNull() {
            addCriterion("member_state is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStateEqualTo(Boolean value) {
            addCriterion("member_state =", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotEqualTo(Boolean value) {
            addCriterion("member_state <>", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThan(Boolean value) {
            addCriterion("member_state >", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("member_state >=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThan(Boolean value) {
            addCriterion("member_state <", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThanOrEqualTo(Boolean value) {
            addCriterion("member_state <=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateIn(List<Boolean> values) {
            addCriterion("member_state in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotIn(List<Boolean> values) {
            addCriterion("member_state not in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateBetween(Boolean value1, Boolean value2) {
            addCriterion("member_state between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("member_state not between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberPicIsNull() {
            addCriterion("member_pic is null");
            return (Criteria) this;
        }

        public Criteria andMemberPicIsNotNull() {
            addCriterion("member_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPicEqualTo(String value) {
            addCriterion("member_pic =", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicNotEqualTo(String value) {
            addCriterion("member_pic <>", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicGreaterThan(String value) {
            addCriterion("member_pic >", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicGreaterThanOrEqualTo(String value) {
            addCriterion("member_pic >=", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicLessThan(String value) {
            addCriterion("member_pic <", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicLessThanOrEqualTo(String value) {
            addCriterion("member_pic <=", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicLike(String value) {
            addCriterion("member_pic like", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicNotLike(String value) {
            addCriterion("member_pic not like", value, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicIn(List<String> values) {
            addCriterion("member_pic in", values, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicNotIn(List<String> values) {
            addCriterion("member_pic not in", values, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicBetween(String value1, String value2) {
            addCriterion("member_pic between", value1, value2, "memberPic");
            return (Criteria) this;
        }

        public Criteria andMemberPicNotBetween(String value1, String value2) {
            addCriterion("member_pic not between", value1, value2, "memberPic");
            return (Criteria) this;
        }
    }

    /**
     */
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