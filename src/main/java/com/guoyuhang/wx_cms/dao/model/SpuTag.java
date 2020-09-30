package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;

public class SpuTag implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu_tag.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu_tag.spu_id
     *
     * @mbg.generated
     */
    private Integer spuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu_tag.tag_id
     *
     * @mbg.generated
     */
    private Integer tagId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spu_tag
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu_tag.id
     *
     * @return the value of spu_tag.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu_tag.id
     *
     * @param id the value for spu_tag.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu_tag.spu_id
     *
     * @return the value of spu_tag.spu_id
     *
     * @mbg.generated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu_tag.spu_id
     *
     * @param spuId the value for spu_tag.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu_tag.tag_id
     *
     * @return the value of spu_tag.tag_id
     *
     * @mbg.generated
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu_tag.tag_id
     *
     * @param tagId the value for spu_tag.tag_id
     *
     * @mbg.generated
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spu_tag
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
        sb.append(", spuId=").append(spuId);
        sb.append(", tagId=").append(tagId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}