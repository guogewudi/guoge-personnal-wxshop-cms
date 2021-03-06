package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Theme implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.tpl_name
     *
     * @mbg.generated
     */
    private String tplName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.delete_time
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.entrance_img
     *
     * @mbg.generated
     */
    private String entranceImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.extend
     *
     * @mbg.generated
     */
    private String extend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.internal_top_img
     *
     * @mbg.generated
     */
    private String internalTopImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.title_img
     *
     * @mbg.generated
     */
    private String titleImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.online
     *
     * @mbg.generated
     */
    private Byte online;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table theme
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.id
     *
     * @return the value of theme.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.id
     *
     * @param id the value for theme.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.title
     *
     * @return the value of theme.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.title
     *
     * @param title the value for theme.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.description
     *
     * @return the value of theme.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.description
     *
     * @param description the value for theme.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.name
     *
     * @return the value of theme.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.name
     *
     * @param name the value for theme.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.create_time
     *
     * @return the value of theme.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.create_time
     *
     * @param createTime the value for theme.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.tpl_name
     *
     * @return the value of theme.tpl_name
     *
     * @mbg.generated
     */
    public String getTplName() {
        return tplName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.tpl_name
     *
     * @param tplName the value for theme.tpl_name
     *
     * @mbg.generated
     */
    public void setTplName(String tplName) {
        this.tplName = tplName == null ? null : tplName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.update_time
     *
     * @return the value of theme.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.update_time
     *
     * @param updateTime the value for theme.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.delete_time
     *
     * @return the value of theme.delete_time
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.delete_time
     *
     * @param deleteTime the value for theme.delete_time
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.entrance_img
     *
     * @return the value of theme.entrance_img
     *
     * @mbg.generated
     */
    public String getEntranceImg() {
        return entranceImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.entrance_img
     *
     * @param entranceImg the value for theme.entrance_img
     *
     * @mbg.generated
     */
    public void setEntranceImg(String entranceImg) {
        this.entranceImg = entranceImg == null ? null : entranceImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.extend
     *
     * @return the value of theme.extend
     *
     * @mbg.generated
     */
    public String getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.extend
     *
     * @param extend the value for theme.extend
     *
     * @mbg.generated
     */
    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.internal_top_img
     *
     * @return the value of theme.internal_top_img
     *
     * @mbg.generated
     */
    public String getInternalTopImg() {
        return internalTopImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.internal_top_img
     *
     * @param internalTopImg the value for theme.internal_top_img
     *
     * @mbg.generated
     */
    public void setInternalTopImg(String internalTopImg) {
        this.internalTopImg = internalTopImg == null ? null : internalTopImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.title_img
     *
     * @return the value of theme.title_img
     *
     * @mbg.generated
     */
    public String getTitleImg() {
        return titleImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.title_img
     *
     * @param titleImg the value for theme.title_img
     *
     * @mbg.generated
     */
    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg == null ? null : titleImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.online
     *
     * @return the value of theme.online
     *
     * @mbg.generated
     */
    public Byte getOnline() {
        return online;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.online
     *
     * @param online the value for theme.online
     *
     * @mbg.generated
     */
    public void setOnline(Byte online) {
        this.online = online;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
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
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", tplName=").append(tplName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", entranceImg=").append(entranceImg);
        sb.append(", extend=").append(extend);
        sb.append(", internalTopImg=").append(internalTopImg);
        sb.append(", titleImg=").append(titleImg);
        sb.append(", online=").append(online);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}