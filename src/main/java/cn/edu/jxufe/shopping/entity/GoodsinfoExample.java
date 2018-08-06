package cn.edu.jxufe.shopping.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GoodsinfoExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleIsNull() {
            addCriterion("goods_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleIsNotNull() {
            addCriterion("goods_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleEqualTo(String value) {
            addCriterion("goods_subtitle =", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotEqualTo(String value) {
            addCriterion("goods_subtitle <>", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleGreaterThan(String value) {
            addCriterion("goods_subtitle >", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_subtitle >=", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleLessThan(String value) {
            addCriterion("goods_subtitle <", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleLessThanOrEqualTo(String value) {
            addCriterion("goods_subtitle <=", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleLike(String value) {
            addCriterion("goods_subtitle like", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotLike(String value) {
            addCriterion("goods_subtitle not like", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleIn(List<String> values) {
            addCriterion("goods_subtitle in", values, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotIn(List<String> values) {
            addCriterion("goods_subtitle not in", values, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleBetween(String value1, String value2) {
            addCriterion("goods_subtitle between", value1, value2, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotBetween(String value1, String value2) {
            addCriterion("goods_subtitle not between", value1, value2, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGcIdIsNull() {
            addCriterion("gc_id is null");
            return (Criteria) this;
        }

        public Criteria andGcIdIsNotNull() {
            addCriterion("gc_id is not null");
            return (Criteria) this;
        }

        public Criteria andGcIdEqualTo(Integer value) {
            addCriterion("gc_id =", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotEqualTo(Integer value) {
            addCriterion("gc_id <>", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdGreaterThan(Integer value) {
            addCriterion("gc_id >", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gc_id >=", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdLessThan(Integer value) {
            addCriterion("gc_id <", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdLessThanOrEqualTo(Integer value) {
            addCriterion("gc_id <=", value, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdIn(List<Integer> values) {
            addCriterion("gc_id in", values, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotIn(List<Integer> values) {
            addCriterion("gc_id not in", values, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdBetween(Integer value1, Integer value2) {
            addCriterion("gc_id between", value1, value2, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gc_id not between", value1, value2, "gcId");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNull() {
            addCriterion("gc_name is null");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNotNull() {
            addCriterion("gc_name is not null");
            return (Criteria) this;
        }

        public Criteria andGcNameEqualTo(String value) {
            addCriterion("gc_name =", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotEqualTo(String value) {
            addCriterion("gc_name <>", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThan(String value) {
            addCriterion("gc_name >", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThanOrEqualTo(String value) {
            addCriterion("gc_name >=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThan(String value) {
            addCriterion("gc_name <", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThanOrEqualTo(String value) {
            addCriterion("gc_name <=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLike(String value) {
            addCriterion("gc_name like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotLike(String value) {
            addCriterion("gc_name not like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameIn(List<String> values) {
            addCriterion("gc_name in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotIn(List<String> values) {
            addCriterion("gc_name not in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameBetween(String value1, String value2) {
            addCriterion("gc_name between", value1, value2, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotBetween(String value1, String value2) {
            addCriterion("gc_name not between", value1, value2, "gcName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIsNull() {
            addCriterion("goods_click is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIsNotNull() {
            addCriterion("goods_click is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickEqualTo(Integer value) {
            addCriterion("goods_click =", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotEqualTo(Integer value) {
            addCriterion("goods_click <>", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickGreaterThan(Integer value) {
            addCriterion("goods_click >", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_click >=", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickLessThan(Integer value) {
            addCriterion("goods_click <", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickLessThanOrEqualTo(Integer value) {
            addCriterion("goods_click <=", value, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickIn(List<Integer> values) {
            addCriterion("goods_click in", values, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotIn(List<Integer> values) {
            addCriterion("goods_click not in", values, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickBetween(Integer value1, Integer value2) {
            addCriterion("goods_click between", value1, value2, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_click not between", value1, value2, "goodsClick");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(Integer value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(Integer value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(Integer value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(Integer value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<Integer> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<Integer> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIsNull() {
            addCriterion("goods_commend is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIsNotNull() {
            addCriterion("goods_commend is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendEqualTo(Integer value) {
            addCriterion("goods_commend =", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotEqualTo(Integer value) {
            addCriterion("goods_commend <>", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendGreaterThan(Integer value) {
            addCriterion("goods_commend >", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_commend >=", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendLessThan(Integer value) {
            addCriterion("goods_commend <", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendLessThanOrEqualTo(Integer value) {
            addCriterion("goods_commend <=", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIn(List<Integer> values) {
            addCriterion("goods_commend in", values, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotIn(List<Integer> values) {
            addCriterion("goods_commend not in", values, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendBetween(Integer value1, Integer value2) {
            addCriterion("goods_commend between", value1, value2, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_commend not between", value1, value2, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIsNull() {
            addCriterion("goods_description is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIsNotNull() {
            addCriterion("goods_description is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionEqualTo(String value) {
            addCriterion("goods_description =", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotEqualTo(String value) {
            addCriterion("goods_description <>", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionGreaterThan(String value) {
            addCriterion("goods_description >", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("goods_description >=", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLessThan(String value) {
            addCriterion("goods_description <", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("goods_description <=", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLike(String value) {
            addCriterion("goods_description like", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotLike(String value) {
            addCriterion("goods_description not like", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIn(List<String> values) {
            addCriterion("goods_description in", values, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotIn(List<String> values) {
            addCriterion("goods_description not in", values, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionBetween(String value1, String value2) {
            addCriterion("goods_description between", value1, value2, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotBetween(String value1, String value2) {
            addCriterion("goods_description not between", value1, value2, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonIsNull() {
            addCriterion("goods_close_reason is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonIsNotNull() {
            addCriterion("goods_close_reason is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonEqualTo(String value) {
            addCriterion("goods_close_reason =", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonNotEqualTo(String value) {
            addCriterion("goods_close_reason <>", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonGreaterThan(String value) {
            addCriterion("goods_close_reason >", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("goods_close_reason >=", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonLessThan(String value) {
            addCriterion("goods_close_reason <", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonLessThanOrEqualTo(String value) {
            addCriterion("goods_close_reason <=", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonLike(String value) {
            addCriterion("goods_close_reason like", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonNotLike(String value) {
            addCriterion("goods_close_reason not like", value, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonIn(List<String> values) {
            addCriterion("goods_close_reason in", values, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonNotIn(List<String> values) {
            addCriterion("goods_close_reason not in", values, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonBetween(String value1, String value2) {
            addCriterion("goods_close_reason between", value1, value2, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andGoodsCloseReasonNotBetween(String value1, String value2) {
            addCriterion("goods_close_reason not between", value1, value2, "goodsCloseReason");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumIsNull() {
            addCriterion("thumbs_up_num is null");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumIsNotNull() {
            addCriterion("thumbs_up_num is not null");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumEqualTo(Long value) {
            addCriterion("thumbs_up_num =", value, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumNotEqualTo(Long value) {
            addCriterion("thumbs_up_num <>", value, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumGreaterThan(Long value) {
            addCriterion("thumbs_up_num >", value, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumGreaterThanOrEqualTo(Long value) {
            addCriterion("thumbs_up_num >=", value, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumLessThan(Long value) {
            addCriterion("thumbs_up_num <", value, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumLessThanOrEqualTo(Long value) {
            addCriterion("thumbs_up_num <=", value, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumIn(List<Long> values) {
            addCriterion("thumbs_up_num in", values, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumNotIn(List<Long> values) {
            addCriterion("thumbs_up_num not in", values, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumBetween(Long value1, Long value2) {
            addCriterion("thumbs_up_num between", value1, value2, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNumNotBetween(Long value1, Long value2) {
            addCriterion("thumbs_up_num not between", value1, value2, "thumbsUpNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumIsNull() {
            addCriterion("salenum_num is null");
            return (Criteria) this;
        }

        public Criteria andSalenumNumIsNotNull() {
            addCriterion("salenum_num is not null");
            return (Criteria) this;
        }

        public Criteria andSalenumNumEqualTo(Integer value) {
            addCriterion("salenum_num =", value, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumNotEqualTo(Integer value) {
            addCriterion("salenum_num <>", value, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumGreaterThan(Integer value) {
            addCriterion("salenum_num >", value, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("salenum_num >=", value, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumLessThan(Integer value) {
            addCriterion("salenum_num <", value, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumLessThanOrEqualTo(Integer value) {
            addCriterion("salenum_num <=", value, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumIn(List<Integer> values) {
            addCriterion("salenum_num in", values, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumNotIn(List<Integer> values) {
            addCriterion("salenum_num not in", values, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumBetween(Integer value1, Integer value2) {
            addCriterion("salenum_num between", value1, value2, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andSalenumNumNotBetween(Integer value1, Integer value2) {
            addCriterion("salenum_num not between", value1, value2, "salenumNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumIsNull() {
            addCriterion("goods_collect_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumIsNotNull() {
            addCriterion("goods_collect_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumEqualTo(Integer value) {
            addCriterion("goods_collect_num =", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumNotEqualTo(Integer value) {
            addCriterion("goods_collect_num <>", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumGreaterThan(Integer value) {
            addCriterion("goods_collect_num >", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_collect_num >=", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumLessThan(Integer value) {
            addCriterion("goods_collect_num <", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_collect_num <=", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumIn(List<Integer> values) {
            addCriterion("goods_collect_num in", values, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumNotIn(List<Integer> values) {
            addCriterion("goods_collect_num not in", values, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect_num between", value1, value2, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect_num not between", value1, value2, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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