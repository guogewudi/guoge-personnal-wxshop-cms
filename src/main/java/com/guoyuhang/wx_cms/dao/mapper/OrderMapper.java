package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.Order;
import com.guoyuhang.wx_cms.dao.model.OrderExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @SelectProvider(type=OrderSqlProvider.class, method="countByExample")
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @DeleteProvider(type=OrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Delete({
        "delete from order",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Insert({
        "insert into order (`order_no`, `user_id`, ",
        "`total_price`, `total_count`, ",
        "`create_time`, `delete_time`, ",
        "`update_time`, `expired_time`, ",
        "`placed_time`, `snap_img`, ",
        "`snap_title`, `snap_items`, ",
        "`snap_address`, `prepay_id`, ",
        "`final_total_price`, `status`)",
        "values (#{orderNo,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{totalPrice,jdbcType=DECIMAL}, #{totalCount,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{deleteTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{expiredTime,jdbcType=TIMESTAMP}, ",
        "#{placedTime,jdbcType=TIMESTAMP}, #{snapImg,jdbcType=VARCHAR}, ",
        "#{snapTitle,jdbcType=VARCHAR}, #{snapItems,jdbcType=OTHER}, ",
        "#{snapAddress,jdbcType=OTHER}, #{prepayId,jdbcType=VARCHAR}, ",
        "#{finalTotalPrice,jdbcType=DECIMAL}, #{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @SelectProvider(type=OrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="total_price", property="totalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_count", property="totalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_time", property="expiredTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="placed_time", property="placedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="snap_img", property="snapImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="snap_title", property="snapTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="snap_items", property="snapItems", jdbcType=JdbcType.OTHER),
        @Result(column="snap_address", property="snapAddress", jdbcType=JdbcType.OTHER),
        @Result(column="prepay_id", property="prepayId", jdbcType=JdbcType.VARCHAR),
        @Result(column="final_total_price", property="finalTotalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `order_no`, `user_id`, `total_price`, `total_count`, `create_time`, `delete_time`, ",
        "`update_time`, `expired_time`, `placed_time`, `snap_img`, `snap_title`, `snap_items`, ",
        "`snap_address`, `prepay_id`, `final_total_price`, `status`",
        "from order",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="total_price", property="totalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_count", property="totalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_time", property="expiredTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="placed_time", property="placedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="snap_img", property="snapImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="snap_title", property="snapTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="snap_items", property="snapItems", jdbcType=JdbcType.OTHER),
        @Result(column="snap_address", property="snapAddress", jdbcType=JdbcType.OTHER),
        @Result(column="prepay_id", property="prepayId", jdbcType=JdbcType.VARCHAR),
        @Result(column="final_total_price", property="finalTotalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Update({
        "update order",
        "set `order_no` = #{orderNo,jdbcType=VARCHAR},",
          "`user_id` = #{userId,jdbcType=INTEGER},",
          "`total_price` = #{totalPrice,jdbcType=DECIMAL},",
          "`total_count` = #{totalCount,jdbcType=INTEGER},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`delete_time` = #{deleteTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`expired_time` = #{expiredTime,jdbcType=TIMESTAMP},",
          "`placed_time` = #{placedTime,jdbcType=TIMESTAMP},",
          "`snap_img` = #{snapImg,jdbcType=VARCHAR},",
          "`snap_title` = #{snapTitle,jdbcType=VARCHAR},",
          "`snap_items` = #{snapItems,jdbcType=OTHER},",
          "`snap_address` = #{snapAddress,jdbcType=OTHER},",
          "`prepay_id` = #{prepayId,jdbcType=VARCHAR},",
          "`final_total_price` = #{finalTotalPrice,jdbcType=DECIMAL},",
          "`status` = #{status,jdbcType=TINYINT}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Order record);
}