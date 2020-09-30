package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CouponTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.full_money
     *
     * @mbg.generated
     */
    private BigDecimal fullMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.minus
     *
     * @mbg.generated
     */
    private BigDecimal minus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.discount
     *
     * @mbg.generated
     */
    private BigDecimal discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.type
     *
     * @mbg.generated
     */
    private Short type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.delete_time
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.id
     *
     * @return the value of coupon_template.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.id
     *
     * @param id the value for coupon_template.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.title
     *
     * @return the value of coupon_template.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.title
     *
     * @param title the value for coupon_template.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.description
     *
     * @return the value of coupon_template.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.description
     *
     * @param description the value for coupon_template.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.full_money
     *
     * @return the value of coupon_template.full_money
     *
     * @mbg.generated
     */
    public BigDecimal getFullMoney() {
        return fullMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.full_money
     *
     * @param fullMoney the value for coupon_template.full_money
     *
     * @mbg.generated
     */
    public void setFullMoney(BigDecimal fullMoney) {
        this.fullMoney = fullMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.minus
     *
     * @return the value of coupon_template.minus
     *
     * @mbg.generated
     */
    public BigDecimal getMinus() {
        return minus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.minus
     *
     * @param minus the value for coupon_template.minus
     *
     * @mbg.generated
     */
    public void setMinus(BigDecimal minus) {
        this.minus = minus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.discount
     *
     * @return the value of coupon_template.discount
     *
     * @mbg.generated
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.discount
     *
     * @param discount the value for coupon_template.discount
     *
     * @mbg.generated
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.type
     *
     * @return the value of coupon_template.type
     *
     * @mbg.generated
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.type
     *
     * @param type the value for coupon_template.type
     *
     * @mbg.generated
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.create_time
     *
     * @return the value of coupon_template.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.create_time
     *
     * @param createTime the value for coupon_template.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.update_time
     *
     * @return the value of coupon_template.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.update_time
     *
     * @param updateTime the value for coupon_template.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.delete_time
     *
     * @return the value of coupon_template.delete_time
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.delete_time
     *
     * @param deleteTime the value for coupon_template.delete_time
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
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
        sb.append(", description=").append(description);
        sb.append(", fullMoney=").append(fullMoney);
        sb.append(", minus=").append(minus);
        sb.append(", discount=").append(discount);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}