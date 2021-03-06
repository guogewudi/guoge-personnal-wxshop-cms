package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Coupon implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.full_money
     *
     * @mbg.generated
     */
    private BigDecimal fullMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.minus
     *
     * @mbg.generated
     */
    private BigDecimal minus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.rate
     *
     * @mbg.generated
     */
    private BigDecimal rate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.type
     *
     * @mbg.generated
     */
    private Short type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.delete_time
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.activity_id
     *
     * @mbg.generated
     */
    private Integer activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.whole_store
     *
     * @mbg.generated
     */
    private Byte wholeStore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.id
     *
     * @return the value of coupon.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.id
     *
     * @param id the value for coupon.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.title
     *
     * @return the value of coupon.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.title
     *
     * @param title the value for coupon.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.start_time
     *
     * @return the value of coupon.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.start_time
     *
     * @param startTime the value for coupon.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.end_time
     *
     * @return the value of coupon.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.end_time
     *
     * @param endTime the value for coupon.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.description
     *
     * @return the value of coupon.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.description
     *
     * @param description the value for coupon.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.full_money
     *
     * @return the value of coupon.full_money
     *
     * @mbg.generated
     */
    public BigDecimal getFullMoney() {
        return fullMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.full_money
     *
     * @param fullMoney the value for coupon.full_money
     *
     * @mbg.generated
     */
    public void setFullMoney(BigDecimal fullMoney) {
        this.fullMoney = fullMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.minus
     *
     * @return the value of coupon.minus
     *
     * @mbg.generated
     */
    public BigDecimal getMinus() {
        return minus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.minus
     *
     * @param minus the value for coupon.minus
     *
     * @mbg.generated
     */
    public void setMinus(BigDecimal minus) {
        this.minus = minus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.rate
     *
     * @return the value of coupon.rate
     *
     * @mbg.generated
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.rate
     *
     * @param rate the value for coupon.rate
     *
     * @mbg.generated
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.type
     *
     * @return the value of coupon.type
     *
     * @mbg.generated
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.type
     *
     * @param type the value for coupon.type
     *
     * @mbg.generated
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.create_time
     *
     * @return the value of coupon.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.create_time
     *
     * @param createTime the value for coupon.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.update_time
     *
     * @return the value of coupon.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.update_time
     *
     * @param updateTime the value for coupon.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.delete_time
     *
     * @return the value of coupon.delete_time
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.delete_time
     *
     * @param deleteTime the value for coupon.delete_time
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.activity_id
     *
     * @return the value of coupon.activity_id
     *
     * @mbg.generated
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.activity_id
     *
     * @param activityId the value for coupon.activity_id
     *
     * @mbg.generated
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.remark
     *
     * @return the value of coupon.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.remark
     *
     * @param remark the value for coupon.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.whole_store
     *
     * @return the value of coupon.whole_store
     *
     * @mbg.generated
     */
    public Byte getWholeStore() {
        return wholeStore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.whole_store
     *
     * @param wholeStore the value for coupon.whole_store
     *
     * @mbg.generated
     */
    public void setWholeStore(Byte wholeStore) {
        this.wholeStore = wholeStore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", description=").append(description);
        sb.append(", fullMoney=").append(fullMoney);
        sb.append(", minus=").append(minus);
        sb.append(", rate=").append(rate);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", activityId=").append(activityId);
        sb.append(", remark=").append(remark);
        sb.append(", wholeStore=").append(wholeStore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}