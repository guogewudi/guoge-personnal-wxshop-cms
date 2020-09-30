package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.Theme;
import com.guoyuhang.wx_cms.dao.model.ThemeExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ThemeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @SelectProvider(type=ThemeSqlProvider.class, method="countByExample")
    long countByExample(ThemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ThemeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ThemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @Delete({
        "delete from theme",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @Insert({
        "insert into theme (`title`, `description`, ",
        "`name`, `create_time`, ",
        "`tpl_name`, `update_time`, ",
        "`delete_time`, `entrance_img`, ",
        "`extend`, `internal_top_img`, ",
        "`title_img`, `online`)",
        "values (#{title,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{tplName,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{deleteTime,jdbcType=TIMESTAMP}, #{entranceImg,jdbcType=VARCHAR}, ",
        "#{extend,jdbcType=VARCHAR}, #{internalTopImg,jdbcType=VARCHAR}, ",
        "#{titleImg,jdbcType=VARCHAR}, #{online,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Theme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @InsertProvider(type=ThemeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Theme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @SelectProvider(type=ThemeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tpl_name", property="tplName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="entrance_img", property="entranceImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="extend", property="extend", jdbcType=JdbcType.VARCHAR),
        @Result(column="internal_top_img", property="internalTopImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="title_img", property="titleImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="online", property="online", jdbcType=JdbcType.TINYINT)
    })
    List<Theme> selectByExample(ThemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `title`, `description`, `name`, `create_time`, `tpl_name`, `update_time`, ",
        "`delete_time`, `entrance_img`, `extend`, `internal_top_img`, `title_img`, `online`",
        "from theme",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tpl_name", property="tplName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="entrance_img", property="entranceImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="extend", property="extend", jdbcType=JdbcType.VARCHAR),
        @Result(column="internal_top_img", property="internalTopImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="title_img", property="titleImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="online", property="online", jdbcType=JdbcType.TINYINT)
    })
    Theme selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ThemeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Theme record, @Param("example") ThemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ThemeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Theme record, @Param("example") ThemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ThemeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Theme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    @Update({
        "update theme",
        "set `title` = #{title,jdbcType=VARCHAR},",
          "`description` = #{description,jdbcType=VARCHAR},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`tpl_name` = #{tplName,jdbcType=VARCHAR},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP},",
          "`entrance_img` = #{entranceImg,jdbcType=VARCHAR},",
          "`extend` = #{extend,jdbcType=VARCHAR},",
          "`internal_top_img` = #{internalTopImg,jdbcType=VARCHAR},",
          "`title_img` = #{titleImg,jdbcType=VARCHAR},",
          "`online` = #{online,jdbcType=TINYINT}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Theme record);
}