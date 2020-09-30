package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.Activity;
import com.guoyuhang.wx_cms.dao.model.ActivityExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @SelectProvider(type=ActivitySqlProvider.class, method="countByExample")
    long countByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ActivitySqlProvider.class, method="deleteByExample")
    int deleteByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @Delete({
        "delete from activity",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @Insert({
        "insert into activity (`title`, `description`, ",
        "`start_time`, `end_time`, ",
        "`create_time`, `update_time`, ",
        "`delete_time`, `remark`, ",
        "`online`, `entrance_img`, ",
        "`internal_top_img`, `name`)",
        "values (#{title,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{deleteTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{online,jdbcType=TINYINT}, #{entranceImg,jdbcType=VARCHAR}, ",
        "#{internalTopImg,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @InsertProvider(type=ActivitySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @SelectProvider(type=ActivitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="online", property="online", jdbcType=JdbcType.TINYINT),
        @Result(column="entrance_img", property="entranceImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="internal_top_img", property="internalTopImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<Activity> selectByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `title`, `description`, `start_time`, `end_time`, `create_time`, `update_time`, ",
        "`delete_time`, `remark`, `online`, `entrance_img`, `internal_top_img`, `name`",
        "from activity",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="online", property="online", jdbcType=JdbcType.TINYINT),
        @Result(column="entrance_img", property="entranceImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="internal_top_img", property="internalTopImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    Activity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ActivitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ActivitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ActivitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated
     */
    @Update({
        "update activity",
        "set `title` = #{title,jdbcType=VARCHAR},",
          "`description` = #{description,jdbcType=VARCHAR},",
          "`start_time` = #{startTime,jdbcType=TIMESTAMP},",
          "`end_time` = #{endTime,jdbcType=TIMESTAMP},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP},",
          "`remark` = #{remark,jdbcType=VARCHAR},",
          "`online` = #{online,jdbcType=TINYINT},",
          "`entrance_img` = #{entranceImg,jdbcType=VARCHAR},",
          "`internal_top_img` = #{internalTopImg,jdbcType=VARCHAR},",
          "`name` = #{name,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Activity record);
}