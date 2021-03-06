package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.SpecValue;
import com.guoyuhang.wx_cms.dao.model.SpecValueExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface SpecValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=SpecValueSqlProvider.class, method="countByExample")
    long countByExample(SpecValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @DeleteProvider(type=SpecValueSqlProvider.class, method="deleteByExample")
    int deleteByExample(SpecValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @Delete({
        "delete from spec_value",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @Insert({
        "insert into spec_value (`value`, `spec_id`, ",
        "`create_time`, `update_time`, ",
        "`delete_time`, `extend`)",
        "values (#{value,jdbcType=VARCHAR}, #{specId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{deleteTime,jdbcType=TIMESTAMP}, #{extend,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SpecValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @InsertProvider(type=SpecValueSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(SpecValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=SpecValueSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_id", property="specId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="extend", property="extend", jdbcType=JdbcType.VARCHAR)
    })
    List<SpecValue> selectByExample(SpecValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `value`, `spec_id`, `create_time`, `update_time`, `delete_time`, `extend`",
        "from spec_value",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_id", property="specId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="extend", property="extend", jdbcType=JdbcType.VARCHAR)
    })
    SpecValue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SpecValueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SpecValueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SpecValueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SpecValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_value
     *
     * @mbg.generated
     */
    @Update({
        "update spec_value",
        "set `value` = #{value,jdbcType=VARCHAR},",
          "`spec_id` = #{specId,jdbcType=INTEGER},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP},",
          "`extend` = #{extend,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SpecValue record);
}