package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.CouponTemplate;
import com.guoyuhang.wx_cms.dao.model.CouponTemplateExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CouponTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @SelectProvider(type=CouponTemplateSqlProvider.class, method="countByExample")
    long countByExample(CouponTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @DeleteProvider(type=CouponTemplateSqlProvider.class, method="deleteByExample")
    int deleteByExample(CouponTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Delete({
        "delete from coupon_template",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Insert({
        "insert into coupon_template (`title`, `description`, ",
        "`full_money`, `minus`, ",
        "`discount`, `type`, ",
        "`create_time`, `update_time`, ",
        "`delete_time`)",
        "values (#{title,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{fullMoney,jdbcType=DECIMAL}, #{minus,jdbcType=DECIMAL}, ",
        "#{discount,jdbcType=DECIMAL}, #{type,jdbcType=SMALLINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{deleteTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CouponTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @InsertProvider(type=CouponTemplateSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(CouponTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @SelectProvider(type=CouponTemplateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_money", property="fullMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="minus", property="minus", jdbcType=JdbcType.DECIMAL),
        @Result(column="discount", property="discount", jdbcType=JdbcType.DECIMAL),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CouponTemplate> selectByExample(CouponTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `title`, `description`, `full_money`, `minus`, `discount`, `type`, `create_time`, ",
        "`update_time`, `delete_time`",
        "from coupon_template",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_money", property="fullMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="minus", property="minus", jdbcType=JdbcType.DECIMAL),
        @Result(column="discount", property="discount", jdbcType=JdbcType.DECIMAL),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CouponTemplate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CouponTemplateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CouponTemplate record, @Param("example") CouponTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CouponTemplateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CouponTemplate record, @Param("example") CouponTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CouponTemplateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CouponTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Update({
        "update coupon_template",
        "set `title` = #{title,jdbcType=VARCHAR},",
          "`description` = #{description,jdbcType=VARCHAR},",
          "`full_money` = #{fullMoney,jdbcType=DECIMAL},",
          "`minus` = #{minus,jdbcType=DECIMAL},",
          "`discount` = #{discount,jdbcType=DECIMAL},",
          "`type` = #{type,jdbcType=SMALLINT},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CouponTemplate record);
}