package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.UserCoupon;
import com.guoyuhang.wx_cms.dao.model.UserCouponExample;
import com.guoyuhang.wx_cms.dao.model.UserCouponExample.Criteria;
import com.guoyuhang.wx_cms.dao.model.UserCouponExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class UserCouponSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String countByExample(UserCouponExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_coupon");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String deleteByExample(UserCouponExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_coupon");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String insertSelective(UserCoupon record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_coupon");
        
        if (record.getUserId() != null) {
            sql.VALUES("`user_id`", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.VALUES("`coupon_id`", "#{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("`create_time`", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("`order_id`", "#{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("`update_time`", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String selectByExample(UserCouponExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("`id`");
        } else {
            sql.SELECT("`id`");
        }
        sql.SELECT("`user_id`");
        sql.SELECT("`coupon_id`");
        sql.SELECT("`status`");
        sql.SELECT("`create_time`");
        sql.SELECT("`order_id`");
        sql.SELECT("`update_time`");
        sql.FROM("user_coupon");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserCoupon record = (UserCoupon) parameter.get("record");
        UserCouponExample example = (UserCouponExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_coupon");
        
        if (record.getId() != null) {
            sql.SET("`id` = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("`user_id` = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("`coupon_id` = #{record.couponId,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("`create_time` = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("`order_id` = #{record.orderId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("`update_time` = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_coupon");
        
        sql.SET("`id` = #{record.id,jdbcType=INTEGER}");
        sql.SET("`user_id` = #{record.userId,jdbcType=INTEGER}");
        sql.SET("`coupon_id` = #{record.couponId,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=TINYINT}");
        sql.SET("`create_time` = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("`order_id` = #{record.orderId,jdbcType=INTEGER}");
        sql.SET("`update_time` = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        UserCouponExample example = (UserCouponExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(UserCoupon record) {
        SQL sql = new SQL();
        sql.UPDATE("user_coupon");
        
        if (record.getUserId() != null) {
            sql.SET("`user_id` = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("`coupon_id` = #{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("`create_time` = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("`order_id` = #{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("`update_time` = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("`id` = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_coupon
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, UserCouponExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}