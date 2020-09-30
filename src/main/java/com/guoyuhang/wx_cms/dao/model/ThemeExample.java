package com.guoyuhang.wx_cms.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThemeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table theme
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table theme
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table theme
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public ThemeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table theme
     *
     * @mbg.generated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("`id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("`id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("`id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("`id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("`id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("`id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("`id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("`id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("`id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("`title` is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("`title` is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("`title` =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("`title` <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("`title` >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("`title` >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("`title` <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("`title` <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("`title` like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("`title` not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("`title` in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("`title` not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("`title` between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("`title` not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("`description` is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("`description` is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("`description` =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("`description` <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("`description` >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("`description` >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("`description` <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("`description` <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("`description` like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("`description` not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("`description` in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("`description` not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("`description` between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("`description` not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNull() {
            addCriterion("`tpl_name` is null");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNotNull() {
            addCriterion("`tpl_name` is not null");
            return (Criteria) this;
        }

        public Criteria andTplNameEqualTo(String value) {
            addCriterion("`tpl_name` =", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotEqualTo(String value) {
            addCriterion("`tpl_name` <>", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThan(String value) {
            addCriterion("`tpl_name` >", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThanOrEqualTo(String value) {
            addCriterion("`tpl_name` >=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThan(String value) {
            addCriterion("`tpl_name` <", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThanOrEqualTo(String value) {
            addCriterion("`tpl_name` <=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLike(String value) {
            addCriterion("`tpl_name` like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotLike(String value) {
            addCriterion("`tpl_name` not like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameIn(List<String> values) {
            addCriterion("`tpl_name` in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotIn(List<String> values) {
            addCriterion("`tpl_name` not in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameBetween(String value1, String value2) {
            addCriterion("`tpl_name` between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotBetween(String value1, String value2) {
            addCriterion("`tpl_name` not between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("`update_time` is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("`update_time` is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("`update_time` =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("`update_time` <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("`update_time` >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`update_time` >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("`update_time` <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`update_time` <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("`update_time` in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("`update_time` not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("`update_time` between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`update_time` not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("`delete_time` is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("`delete_time` is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("`delete_time` =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("`delete_time` <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("`delete_time` >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`delete_time` >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("`delete_time` <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("`delete_time` <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("`delete_time` in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("`delete_time` not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("`delete_time` between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("`delete_time` not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andEntranceImgIsNull() {
            addCriterion("`entrance_img` is null");
            return (Criteria) this;
        }

        public Criteria andEntranceImgIsNotNull() {
            addCriterion("`entrance_img` is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceImgEqualTo(String value) {
            addCriterion("`entrance_img` =", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgNotEqualTo(String value) {
            addCriterion("`entrance_img` <>", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgGreaterThan(String value) {
            addCriterion("`entrance_img` >", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgGreaterThanOrEqualTo(String value) {
            addCriterion("`entrance_img` >=", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgLessThan(String value) {
            addCriterion("`entrance_img` <", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgLessThanOrEqualTo(String value) {
            addCriterion("`entrance_img` <=", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgLike(String value) {
            addCriterion("`entrance_img` like", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgNotLike(String value) {
            addCriterion("`entrance_img` not like", value, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgIn(List<String> values) {
            addCriterion("`entrance_img` in", values, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgNotIn(List<String> values) {
            addCriterion("`entrance_img` not in", values, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgBetween(String value1, String value2) {
            addCriterion("`entrance_img` between", value1, value2, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andEntranceImgNotBetween(String value1, String value2) {
            addCriterion("`entrance_img` not between", value1, value2, "entranceImg");
            return (Criteria) this;
        }

        public Criteria andExtendIsNull() {
            addCriterion("`extend` is null");
            return (Criteria) this;
        }

        public Criteria andExtendIsNotNull() {
            addCriterion("`extend` is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEqualTo(String value) {
            addCriterion("`extend` =", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotEqualTo(String value) {
            addCriterion("`extend` <>", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThan(String value) {
            addCriterion("`extend` >", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThanOrEqualTo(String value) {
            addCriterion("`extend` >=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThan(String value) {
            addCriterion("`extend` <", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThanOrEqualTo(String value) {
            addCriterion("`extend` <=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLike(String value) {
            addCriterion("`extend` like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotLike(String value) {
            addCriterion("`extend` not like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendIn(List<String> values) {
            addCriterion("`extend` in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotIn(List<String> values) {
            addCriterion("`extend` not in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendBetween(String value1, String value2) {
            addCriterion("`extend` between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotBetween(String value1, String value2) {
            addCriterion("`extend` not between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgIsNull() {
            addCriterion("`internal_top_img` is null");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgIsNotNull() {
            addCriterion("`internal_top_img` is not null");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgEqualTo(String value) {
            addCriterion("`internal_top_img` =", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgNotEqualTo(String value) {
            addCriterion("`internal_top_img` <>", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgGreaterThan(String value) {
            addCriterion("`internal_top_img` >", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgGreaterThanOrEqualTo(String value) {
            addCriterion("`internal_top_img` >=", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgLessThan(String value) {
            addCriterion("`internal_top_img` <", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgLessThanOrEqualTo(String value) {
            addCriterion("`internal_top_img` <=", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgLike(String value) {
            addCriterion("`internal_top_img` like", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgNotLike(String value) {
            addCriterion("`internal_top_img` not like", value, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgIn(List<String> values) {
            addCriterion("`internal_top_img` in", values, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgNotIn(List<String> values) {
            addCriterion("`internal_top_img` not in", values, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgBetween(String value1, String value2) {
            addCriterion("`internal_top_img` between", value1, value2, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andInternalTopImgNotBetween(String value1, String value2) {
            addCriterion("`internal_top_img` not between", value1, value2, "internalTopImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgIsNull() {
            addCriterion("`title_img` is null");
            return (Criteria) this;
        }

        public Criteria andTitleImgIsNotNull() {
            addCriterion("`title_img` is not null");
            return (Criteria) this;
        }

        public Criteria andTitleImgEqualTo(String value) {
            addCriterion("`title_img` =", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotEqualTo(String value) {
            addCriterion("`title_img` <>", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgGreaterThan(String value) {
            addCriterion("`title_img` >", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgGreaterThanOrEqualTo(String value) {
            addCriterion("`title_img` >=", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgLessThan(String value) {
            addCriterion("`title_img` <", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgLessThanOrEqualTo(String value) {
            addCriterion("`title_img` <=", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgLike(String value) {
            addCriterion("`title_img` like", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotLike(String value) {
            addCriterion("`title_img` not like", value, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgIn(List<String> values) {
            addCriterion("`title_img` in", values, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotIn(List<String> values) {
            addCriterion("`title_img` not in", values, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgBetween(String value1, String value2) {
            addCriterion("`title_img` between", value1, value2, "titleImg");
            return (Criteria) this;
        }

        public Criteria andTitleImgNotBetween(String value1, String value2) {
            addCriterion("`title_img` not between", value1, value2, "titleImg");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("`online` is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("`online` is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Byte value) {
            addCriterion("`online` =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Byte value) {
            addCriterion("`online` <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Byte value) {
            addCriterion("`online` >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("`online` >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Byte value) {
            addCriterion("`online` <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("`online` <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Byte> values) {
            addCriterion("`online` in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Byte> values) {
            addCriterion("`online` not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Byte value1, Byte value2) {
            addCriterion("`online` between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("`online` not between", value1, value2, "online");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table theme
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table theme
     *
     * @mbg.generated
     */
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