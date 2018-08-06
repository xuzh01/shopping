package cn.edu.jxufe.shopping.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ArticleinfoExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlIsNull() {
            addCriterion("article_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlIsNotNull() {
            addCriterion("article_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlEqualTo(String value) {
            addCriterion("article_pic_url =", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotEqualTo(String value) {
            addCriterion("article_pic_url <>", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlGreaterThan(String value) {
            addCriterion("article_pic_url >", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_pic_url >=", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlLessThan(String value) {
            addCriterion("article_pic_url <", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlLessThanOrEqualTo(String value) {
            addCriterion("article_pic_url <=", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlLike(String value) {
            addCriterion("article_pic_url like", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotLike(String value) {
            addCriterion("article_pic_url not like", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlIn(List<String> values) {
            addCriterion("article_pic_url in", values, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotIn(List<String> values) {
            addCriterion("article_pic_url not in", values, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlBetween(String value1, String value2) {
            addCriterion("article_pic_url between", value1, value2, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotBetween(String value1, String value2) {
            addCriterion("article_pic_url not between", value1, value2, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticleShowIsNull() {
            addCriterion("article_show is null");
            return (Criteria) this;
        }

        public Criteria andArticleShowIsNotNull() {
            addCriterion("article_show is not null");
            return (Criteria) this;
        }

        public Criteria andArticleShowEqualTo(Boolean value) {
            addCriterion("article_show =", value, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowNotEqualTo(Boolean value) {
            addCriterion("article_show <>", value, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowGreaterThan(Boolean value) {
            addCriterion("article_show >", value, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_show >=", value, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowLessThan(Boolean value) {
            addCriterion("article_show <", value, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowLessThanOrEqualTo(Boolean value) {
            addCriterion("article_show <=", value, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowIn(List<Boolean> values) {
            addCriterion("article_show in", values, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowNotIn(List<Boolean> values) {
            addCriterion("article_show not in", values, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowBetween(Boolean value1, Boolean value2) {
            addCriterion("article_show between", value1, value2, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_show not between", value1, value2, "articleShow");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingIsNull() {
            addCriterion("amount_of_reading is null");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingIsNotNull() {
            addCriterion("amount_of_reading is not null");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingEqualTo(Long value) {
            addCriterion("amount_of_reading =", value, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingNotEqualTo(Long value) {
            addCriterion("amount_of_reading <>", value, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingGreaterThan(Long value) {
            addCriterion("amount_of_reading >", value, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingGreaterThanOrEqualTo(Long value) {
            addCriterion("amount_of_reading >=", value, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingLessThan(Long value) {
            addCriterion("amount_of_reading <", value, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingLessThanOrEqualTo(Long value) {
            addCriterion("amount_of_reading <=", value, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingIn(List<Long> values) {
            addCriterion("amount_of_reading in", values, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingNotIn(List<Long> values) {
            addCriterion("amount_of_reading not in", values, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingBetween(Long value1, Long value2) {
            addCriterion("amount_of_reading between", value1, value2, "amountOfReading");
            return (Criteria) this;
        }

        public Criteria andAmountOfReadingNotBetween(Long value1, Long value2) {
            addCriterion("amount_of_reading not between", value1, value2, "amountOfReading");
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