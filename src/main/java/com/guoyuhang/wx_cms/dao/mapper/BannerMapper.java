package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.Banner;
import com.guoyuhang.wx_cms.dao.model.BannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @SelectProvider(type=BannerSqlProvider.class, method="countByExample")
    long countByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @DeleteProvider(type=BannerSqlProvider.class, method="deleteByExample")
    int deleteByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @Delete({
        "delete from banner",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @Insert({
        "insert into banner (`name`, `description`, ",
        "`img`, `title`)",
        "values (#{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @InsertProvider(type=BannerSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @SelectProvider(type=BannerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR)
    })
    List<Banner> selectByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `name`, `description`, `img`, `title`",
        "from banner",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR)
    })
    Banner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BannerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BannerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BannerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @Update({
        "update banner",
        "set `name` = #{name,jdbcType=VARCHAR},",
          "`description` = #{description,jdbcType=VARCHAR},",
          "`img` = #{img,jdbcType=VARCHAR},",
          "`title` = #{title,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Banner record);


    public List<Banner> findAllBanner();
    public Integer insertOneBanner(Banner banner);
}