package com.guoyuhang.wx_cms.dao.model;

import java.io.Serializable;

public class SkuSpec implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_spec.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_spec.spu_id
     *
     * @mbg.generated
     */
    private Integer spuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_spec.sku_id
     *
     * @mbg.generated
     */
    private Integer skuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_spec.key_id
     *
     * @mbg.generated
     */
    private Integer keyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_spec.value_id
     *
     * @mbg.generated
     */
    private Integer valueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sku_spec
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_spec.id
     *
     * @return the value of sku_spec.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_spec.id
     *
     * @param id the value for sku_spec.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_spec.spu_id
     *
     * @return the value of sku_spec.spu_id
     *
     * @mbg.generated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_spec.spu_id
     *
     * @param spuId the value for sku_spec.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_spec.sku_id
     *
     * @return the value of sku_spec.sku_id
     *
     * @mbg.generated
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_spec.sku_id
     *
     * @param skuId the value for sku_spec.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_spec.key_id
     *
     * @return the value of sku_spec.key_id
     *
     * @mbg.generated
     */
    public Integer getKeyId() {
        return keyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_spec.key_id
     *
     * @param keyId the value for sku_spec.key_id
     *
     * @mbg.generated
     */
    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_spec.value_id
     *
     * @return the value of sku_spec.value_id
     *
     * @mbg.generated
     */
    public Integer getValueId() {
        return valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_spec.value_id
     *
     * @param valueId the value for sku_spec.value_id
     *
     * @mbg.generated
     */
    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sku_spec
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
        sb.append(", skuId=").append(skuId);
        sb.append(", keyId=").append(keyId);
        sb.append(", valueId=").append(valueId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}