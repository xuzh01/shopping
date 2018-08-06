package cn.edu.jxufe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AdvertisementExample() {
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

        public Criteria andAdvIdIsNull() {
            addCriterion("adv_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvIdIsNotNull() {
            addCriterion("adv_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvIdEqualTo(Integer value) {
            addCriterion("adv_id =", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotEqualTo(Integer value) {
            addCriterion("adv_id <>", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdGreaterThan(Integer value) {
            addCriterion("adv_id >", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_id >=", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdLessThan(Integer value) {
            addCriterion("adv_id <", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdLessThanOrEqualTo(Integer value) {
            addCriterion("adv_id <=", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdIn(List<Integer> values) {
            addCriterion("adv_id in", values, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotIn(List<Integer> values) {
            addCriterion("adv_id not in", values, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdBetween(Integer value1, Integer value2) {
            addCriterion("adv_id between", value1, value2, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_id not between", value1, value2, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIsNull() {
            addCriterion("adv_title is null");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIsNotNull() {
            addCriterion("adv_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTitleEqualTo(String value) {
            addCriterion("adv_title =", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotEqualTo(String value) {
            addCriterion("adv_title <>", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleGreaterThan(String value) {
            addCriterion("adv_title >", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("adv_title >=", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLessThan(String value) {
            addCriterion("adv_title <", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLessThanOrEqualTo(String value) {
            addCriterion("adv_title <=", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLike(String value) {
            addCriterion("adv_title like", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotLike(String value) {
            addCriterion("adv_title not like", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIn(List<String> values) {
            addCriterion("adv_title in", values, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotIn(List<String> values) {
            addCriterion("adv_title not in", values, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleBetween(String value1, String value2) {
            addCriterion("adv_title between", value1, value2, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotBetween(String value1, String value2) {
            addCriterion("adv_title not between", value1, value2, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlIsNull() {
            addCriterion("adv_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlIsNotNull() {
            addCriterion("adv_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlEqualTo(String value) {
            addCriterion("adv_pic_url =", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlNotEqualTo(String value) {
            addCriterion("adv_pic_url <>", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlGreaterThan(String value) {
            addCriterion("adv_pic_url >", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("adv_pic_url >=", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlLessThan(String value) {
            addCriterion("adv_pic_url <", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlLessThanOrEqualTo(String value) {
            addCriterion("adv_pic_url <=", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlLike(String value) {
            addCriterion("adv_pic_url like", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlNotLike(String value) {
            addCriterion("adv_pic_url not like", value, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlIn(List<String> values) {
            addCriterion("adv_pic_url in", values, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlNotIn(List<String> values) {
            addCriterion("adv_pic_url not in", values, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlBetween(String value1, String value2) {
            addCriterion("adv_pic_url between", value1, value2, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvPicUrlNotBetween(String value1, String value2) {
            addCriterion("adv_pic_url not between", value1, value2, "advPicUrl");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineIsNull() {
            addCriterion("adv_offline is null");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineIsNotNull() {
            addCriterion("adv_offline is not null");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineEqualTo(Short value) {
            addCriterion("adv_offline =", value, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineNotEqualTo(Short value) {
            addCriterion("adv_offline <>", value, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineGreaterThan(Short value) {
            addCriterion("adv_offline >", value, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineGreaterThanOrEqualTo(Short value) {
            addCriterion("adv_offline >=", value, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineLessThan(Short value) {
            addCriterion("adv_offline <", value, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineLessThanOrEqualTo(Short value) {
            addCriterion("adv_offline <=", value, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineIn(List<Short> values) {
            addCriterion("adv_offline in", values, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineNotIn(List<Short> values) {
            addCriterion("adv_offline not in", values, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineBetween(Short value1, Short value2) {
            addCriterion("adv_offline between", value1, value2, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOfflineNotBetween(Short value1, Short value2) {
            addCriterion("adv_offline not between", value1, value2, "advOffline");
            return (Criteria) this;
        }

        public Criteria andAdvOrderIsNull() {
            addCriterion("adv_order is null");
            return (Criteria) this;
        }

        public Criteria andAdvOrderIsNotNull() {
            addCriterion("adv_order is not null");
            return (Criteria) this;
        }

        public Criteria andAdvOrderEqualTo(Integer value) {
            addCriterion("adv_order =", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderNotEqualTo(Integer value) {
            addCriterion("adv_order <>", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderGreaterThan(Integer value) {
            addCriterion("adv_order >", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_order >=", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderLessThan(Integer value) {
            addCriterion("adv_order <", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderLessThanOrEqualTo(Integer value) {
            addCriterion("adv_order <=", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderIn(List<Integer> values) {
            addCriterion("adv_order in", values, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderNotIn(List<Integer> values) {
            addCriterion("adv_order not in", values, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderBetween(Integer value1, Integer value2) {
            addCriterion("adv_order between", value1, value2, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_order not between", value1, value2, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlIsNull() {
            addCriterion("adv_link_url is null");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlIsNotNull() {
            addCriterion("adv_link_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlEqualTo(String value) {
            addCriterion("adv_link_url =", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlNotEqualTo(String value) {
            addCriterion("adv_link_url <>", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlGreaterThan(String value) {
            addCriterion("adv_link_url >", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("adv_link_url >=", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlLessThan(String value) {
            addCriterion("adv_link_url <", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("adv_link_url <=", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlLike(String value) {
            addCriterion("adv_link_url like", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlNotLike(String value) {
            addCriterion("adv_link_url not like", value, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlIn(List<String> values) {
            addCriterion("adv_link_url in", values, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlNotIn(List<String> values) {
            addCriterion("adv_link_url not in", values, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlBetween(String value1, String value2) {
            addCriterion("adv_link_url between", value1, value2, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvLinkUrlNotBetween(String value1, String value2) {
            addCriterion("adv_link_url not between", value1, value2, "advLinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeIsNull() {
            addCriterion("adv_cratetime is null");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeIsNotNull() {
            addCriterion("adv_cratetime is not null");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeEqualTo(Date value) {
            addCriterion("adv_cratetime =", value, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeNotEqualTo(Date value) {
            addCriterion("adv_cratetime <>", value, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeGreaterThan(Date value) {
            addCriterion("adv_cratetime >", value, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adv_cratetime >=", value, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeLessThan(Date value) {
            addCriterion("adv_cratetime <", value, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeLessThanOrEqualTo(Date value) {
            addCriterion("adv_cratetime <=", value, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeIn(List<Date> values) {
            addCriterion("adv_cratetime in", values, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeNotIn(List<Date> values) {
            addCriterion("adv_cratetime not in", values, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeBetween(Date value1, Date value2) {
            addCriterion("adv_cratetime between", value1, value2, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvCratetimeNotBetween(Date value1, Date value2) {
            addCriterion("adv_cratetime not between", value1, value2, "advCratetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeIsNull() {
            addCriterion("adv_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeIsNotNull() {
            addCriterion("adv_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeEqualTo(Date value) {
            addCriterion("adv_updatetime =", value, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeNotEqualTo(Date value) {
            addCriterion("adv_updatetime <>", value, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeGreaterThan(Date value) {
            addCriterion("adv_updatetime >", value, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adv_updatetime >=", value, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeLessThan(Date value) {
            addCriterion("adv_updatetime <", value, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("adv_updatetime <=", value, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeIn(List<Date> values) {
            addCriterion("adv_updatetime in", values, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeNotIn(List<Date> values) {
            addCriterion("adv_updatetime not in", values, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("adv_updatetime between", value1, value2, "advUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdvUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("adv_updatetime not between", value1, value2, "advUpdatetime");
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