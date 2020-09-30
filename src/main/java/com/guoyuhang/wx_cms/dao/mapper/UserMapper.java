package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.User;
import com.guoyuhang.wx_cms.dao.model.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @SelectProvider(type= UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @DeleteProvider(type= UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from user",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into user (`openid`, `nickname`, ",
        "`unify_uid`, `email`, ",
        "`password`, `mobile`, ",
        "`wx_profile`, `create_time`, ",
        "`update_time`, `delete_time`)",
        "values (#{openid,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{unifyUid,jdbcType=INTEGER}, #{email,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{wxProfile,jdbcType=OTHER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{deleteTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @InsertProvider(type= UserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @SelectProvider(type= UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="unify_uid", property="unifyUid", jdbcType=JdbcType.INTEGER),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="wx_profile", property="wxProfile", jdbcType=JdbcType.OTHER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `openid`, `nickname`, `unify_uid`, `email`, `password`, `mobile`, `wx_profile`, ",
        "`create_time`, `update_time`, `delete_time`",
        "from user",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="unify_uid", property="unifyUid", jdbcType=JdbcType.INTEGER),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="wx_profile", property="wxProfile", jdbcType=JdbcType.OTHER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type= UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type= UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type= UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Update({
        "update user",
        "set `openid` = #{openid,jdbcType=VARCHAR},",
          "`nickname` = #{nickname,jdbcType=VARCHAR},",
          "`unify_uid` = #{unifyUid,jdbcType=INTEGER},",
          "`email` = #{email,jdbcType=VARCHAR},",
          "`password` = #{password,jdbcType=VARCHAR},",
          "`mobile` = #{mobile,jdbcType=VARCHAR},",
          "`wx_profile` = #{wxProfile,jdbcType=OTHER},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}