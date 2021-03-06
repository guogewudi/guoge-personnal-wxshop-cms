package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.Coupon;
import com.guoyuhang.wx_cms.dao.model.CouponExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @SelectProvider(type=CouponSqlProvider.class, method="countByExample")
    long countByExample(CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @DeleteProvider(type=CouponSqlProvider.class, method="deleteByExample")
    int deleteByExample(CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @Delete({
        "delete from coupon",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @Insert({
        "insert into coupon (`title`, `start_time`, ",
        "`end_time`, `description`, ",
        "`full_money`, `minus`, ",
        "`rate`, `type`, `create_time`, ",
        "`update_time`, `delete_time`, ",
        "`activity_id`, `remark`, ",
        "`whole_store`)",
        "values (#{title,jdbcType=VARCHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{description,jdbcType=VARCHAR}, ",
        "#{fullMoney,jdbcType=DECIMAL}, #{minus,jdbcType=DECIMAL}, ",
        "#{rate,jdbcType=DECIMAL}, #{type,jdbcType=SMALLINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{deleteTime,jdbcType=TIMESTAMP}, ",
        "#{activityId,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{wholeStore,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Coupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @InsertProvider(type=CouponSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Coupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @SelectProvider(type=CouponSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_money", property="fullMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="minus", property="minus", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate", property="rate", jdbcType=JdbcType.DECIMAL),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="activity_id", property="activityId", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="whole_store", property="wholeStore", jdbcType=JdbcType.TINYINT)
    })
    List<Coupon> selectByExample(CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `title`, `start_time`, `end_time`, `description`, `full_money`, `minus`, ",
        "`rate`, `type`, `create_time`, `update_time`, `delete_time`, `activity_id`, ",
        "`remark`, `whole_store`",
        "from coupon",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_money", property="fullMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="minus", property="minus", jdbcType=JdbcType.DECIMAL),
        @Result(column="rate", property="rate", jdbcType=JdbcType.DECIMAL),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="activity_id", property="activityId", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="whole_store", property="wholeStore", jdbcType=JdbcType.TINYINT)
    })
    Coupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CouponSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CouponSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CouponSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Coupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated
     */
    @Update({
        "update coupon",
        "set `title` = #{title,jdbcType=VARCHAR},",
          "`start_time` = #{startTime,jdbcType=TIMESTAMP},",
          "`end_time` = #{endTime,jdbcType=TIMESTAMP},",
          "`description` = #{description,jdbcType=VARCHAR},",
          "`full_money` = #{fullMoney,jdbcType=DECIMAL},",
          "`minus` = #{minus,jdbcType=DECIMAL},",
          "`rate` = #{rate,jdbcType=DECIMAL},",
          "`type` = #{type,jdbcType=SMALLINT},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP},",
          "`activity_id` = #{activityId,jdbcType=INTEGER},",
          "`remark` = #{remark,jdbcType=VARCHAR},",
          "`whole_store` = #{wholeStore,jdbcType=TINYINT}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Coupon record);
}