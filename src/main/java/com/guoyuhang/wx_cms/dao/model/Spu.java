package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Spu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.subtitle
     *
     * @mbg.generated
     */
    private String subtitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.root_category_id
     *
     * @mbg.generated
     */
    private Integer rootCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.online
     *
     * @mbg.generated
     */
    private Byte online;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.delete_time
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.price
     *
     * @mbg.generated
     */
    private String price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.sketch_spec_id
     *
     * @mbg.generated
     */
    private Integer sketchSpecId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.default_sku_id
     *
     * @mbg.generated
     */
    private Integer defaultSkuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.discount_price
     *
     * @mbg.generated
     */
    private String discountPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.tags
     *
     * @mbg.generated
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.is_test
     *
     * @mbg.generated
     */
    private Byte isTest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.spu_theme_img
     *
     * @mbg.generated
     */
    private Object spuThemeImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu.for_theme_img
     *
     * @mbg.generated
     */
    private String forThemeImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.id
     *
     * @return the value of spu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.id
     *
     * @param id the value for spu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.title
     *
     * @return the value of spu.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.title
     *
     * @param title the value for spu.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.subtitle
     *
     * @return the value of spu.subtitle
     *
     * @mbg.generated
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.subtitle
     *
     * @param subtitle the value for spu.subtitle
     *
     * @mbg.generated
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.category_id
     *
     * @return the value of spu.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.category_id
     *
     * @param categoryId the value for spu.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.root_category_id
     *
     * @return the value of spu.root_category_id
     *
     * @mbg.generated
     */
    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.root_category_id
     *
     * @param rootCategoryId the value for spu.root_category_id
     *
     * @mbg.generated
     */
    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.online
     *
     * @return the value of spu.online
     *
     * @mbg.generated
     */
    public Byte getOnline() {
        return online;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.online
     *
     * @param online the value for spu.online
     *
     * @mbg.generated
     */
    public void setOnline(Byte online) {
        this.online = online;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.create_time
     *
     * @return the value of spu.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.create_time
     *
     * @param createTime the value for spu.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.update_time
     *
     * @return the value of spu.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.update_time
     *
     * @param updateTime the value for spu.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.delete_time
     *
     * @return the value of spu.delete_time
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.delete_time
     *
     * @param deleteTime the value for spu.delete_time
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.price
     *
     * @return the value of spu.price
     *
     * @mbg.generated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.price
     *
     * @param price the value for spu.price
     *
     * @mbg.generated
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.sketch_spec_id
     *
     * @return the value of spu.sketch_spec_id
     *
     * @mbg.generated
     */
    public Integer getSketchSpecId() {
        return sketchSpecId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.sketch_spec_id
     *
     * @param sketchSpecId the value for spu.sketch_spec_id
     *
     * @mbg.generated
     */
    public void setSketchSpecId(Integer sketchSpecId) {
        this.sketchSpecId = sketchSpecId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.default_sku_id
     *
     * @return the value of spu.default_sku_id
     *
     * @mbg.generated
     */
    public Integer getDefaultSkuId() {
        return defaultSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.default_sku_id
     *
     * @param defaultSkuId the value for spu.default_sku_id
     *
     * @mbg.generated
     */
    public void setDefaultSkuId(Integer defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.img
     *
     * @return the value of spu.img
     *
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.img
     *
     * @param img the value for spu.img
     *
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.discount_price
     *
     * @return the value of spu.discount_price
     *
     * @mbg.generated
     */
    public String getDiscountPrice() {
        return discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.discount_price
     *
     * @param discountPrice the value for spu.discount_price
     *
     * @mbg.generated
     */
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice == null ? null : discountPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.description
     *
     * @return the value of spu.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.description
     *
     * @param description the value for spu.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.tags
     *
     * @return the value of spu.tags
     *
     * @mbg.generated
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.tags
     *
     * @param tags the value for spu.tags
     *
     * @mbg.generated
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.is_test
     *
     * @return the value of spu.is_test
     *
     * @mbg.generated
     */
    public Byte getIsTest() {
        return isTest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.is_test
     *
     * @param isTest the value for spu.is_test
     *
     * @mbg.generated
     */
    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.spu_theme_img
     *
     * @return the value of spu.spu_theme_img
     *
     * @mbg.generated
     */
    public Object getSpuThemeImg() {
        return spuThemeImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.spu_theme_img
     *
     * @param spuThemeImg the value for spu.spu_theme_img
     *
     * @mbg.generated
     */
    public void setSpuThemeImg(Object spuThemeImg) {
        this.spuThemeImg = spuThemeImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu.for_theme_img
     *
     * @return the value of spu.for_theme_img
     *
     * @mbg.generated
     */
    public String getForThemeImg() {
        return forThemeImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu.for_theme_img
     *
     * @param forThemeImg the value for spu.for_theme_img
     *
     * @mbg.generated
     */
    public void setForThemeImg(String forThemeImg) {
        this.forThemeImg = forThemeImg == null ? null : forThemeImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spu
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
        sb.append(", subtitle=").append(subtitle);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", rootCategoryId=").append(rootCategoryId);
        sb.append(", online=").append(online);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", price=").append(price);
        sb.append(", sketchSpecId=").append(sketchSpecId);
        sb.append(", defaultSkuId=").append(defaultSkuId);
        sb.append(", img=").append(img);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", description=").append(description);
        sb.append(", tags=").append(tags);
        sb.append(", isTest=").append(isTest);
        sb.append(", spuThemeImg=").append(spuThemeImg);
        sb.append(", forThemeImg=").append(forThemeImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}