package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Sku implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.discount_price
     *
     * @mbg.generated
     */
    private BigDecimal discountPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.online
     *
     * @mbg.generated
     */
    private Byte online;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.spu_id
     *
     * @mbg.generated
     */
    private Integer spuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.delete_time
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.specs
     *
     * @mbg.generated
     */
    private Object specs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.stock
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.root_category_id
     *
     * @mbg.generated
     */
    private Integer rootCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sku
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.id
     *
     * @return the value of sku.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.id
     *
     * @param id the value for sku.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.price
     *
     * @return the value of sku.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.price
     *
     * @param price the value for sku.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.discount_price
     *
     * @return the value of sku.discount_price
     *
     * @mbg.generated
     */
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.discount_price
     *
     * @param discountPrice the value for sku.discount_price
     *
     * @mbg.generated
     */
    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.online
     *
     * @return the value of sku.online
     *
     * @mbg.generated
     */
    public Byte getOnline() {
        return online;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.online
     *
     * @param online the value for sku.online
     *
     * @mbg.generated
     */
    public void setOnline(Byte online) {
        this.online = online;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.img
     *
     * @return the value of sku.img
     *
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.img
     *
     * @param img the value for sku.img
     *
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.title
     *
     * @return the value of sku.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.title
     *
     * @param title the value for sku.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.spu_id
     *
     * @return the value of sku.spu_id
     *
     * @mbg.generated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.spu_id
     *
     * @param spuId the value for sku.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.create_time
     *
     * @return the value of sku.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.create_time
     *
     * @param createTime the value for sku.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.update_time
     *
     * @return the value of sku.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.update_time
     *
     * @param updateTime the value for sku.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.delete_time
     *
     * @return the value of sku.delete_time
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.delete_time
     *
     * @param deleteTime the value for sku.delete_time
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.specs
     *
     * @return the value of sku.specs
     *
     * @mbg.generated
     */
    public Object getSpecs() {
        return specs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.specs
     *
     * @param specs the value for sku.specs
     *
     * @mbg.generated
     */
    public void setSpecs(Object specs) {
        this.specs = specs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.code
     *
     * @return the value of sku.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.code
     *
     * @param code the value for sku.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.stock
     *
     * @return the value of sku.stock
     *
     * @mbg.generated
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.stock
     *
     * @param stock the value for sku.stock
     *
     * @mbg.generated
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.category_id
     *
     * @return the value of sku.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.category_id
     *
     * @param categoryId the value for sku.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.root_category_id
     *
     * @return the value of sku.root_category_id
     *
     * @mbg.generated
     */
    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.root_category_id
     *
     * @param rootCategoryId the value for sku.root_category_id
     *
     * @mbg.generated
     */
    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sku
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
        sb.append(", price=").append(price);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", online=").append(online);
        sb.append(", img=").append(img);
        sb.append(", title=").append(title);
        sb.append(", spuId=").append(spuId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", specs=").append(specs);
        sb.append(", code=").append(code);
        sb.append(", stock=").append(stock);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", rootCategoryId=").append(rootCategoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}