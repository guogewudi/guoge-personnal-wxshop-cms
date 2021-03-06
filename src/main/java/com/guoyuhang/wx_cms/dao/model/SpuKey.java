package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;

public class SpuKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu_key.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu_key.spu_id
     *
     * @mbg.generated
     */
    private Integer spuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spu_key.spec_key_id
     *
     * @mbg.generated
     */
    private Integer specKeyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spu_key
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu_key.id
     *
     * @return the value of spu_key.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu_key.id
     *
     * @param id the value for spu_key.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu_key.spu_id
     *
     * @return the value of spu_key.spu_id
     *
     * @mbg.generated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu_key.spu_id
     *
     * @param spuId the value for spu_key.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spu_key.spec_key_id
     *
     * @return the value of spu_key.spec_key_id
     *
     * @mbg.generated
     */
    public Integer getSpecKeyId() {
        return specKeyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spu_key.spec_key_id
     *
     * @param specKeyId the value for spu_key.spec_key_id
     *
     * @mbg.generated
     */
    public void setSpecKeyId(Integer specKeyId) {
        this.specKeyId = specKeyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spu_key
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
        sb.append(", specKeyId=").append(specKeyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}