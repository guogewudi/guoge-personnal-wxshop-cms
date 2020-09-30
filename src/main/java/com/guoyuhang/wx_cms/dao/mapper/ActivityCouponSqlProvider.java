package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.ActivityCoupon;
import com.guoyuhang.wx_cms.dao.model.ActivityCouponExample;
import com.guoyuhang.wx_cms.dao.model.ActivityCouponExample.Criteria;
import com.guoyuhang.wx_cms.dao.model.ActivityCouponExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class ActivityCouponSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String countByExample(ActivityCouponExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("activity_coupon");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String deleteByExample(ActivityCouponExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("activity_coupon");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String insertSelective(ActivityCoupon record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("activity_coupon");
        
        if (record.getCouponId() != null) {
            sql.VALUES("`coupon_id`", "#{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getActivityId() != null) {
            sql.VALUES("`activity_id`", "#{activityId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String selectByExample(ActivityCouponExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("`id`");
        } else {
            sql.SELECT("`id`");
        }
        sql.SELECT("`coupon_id`");
        sql.SELECT("`activity_id`");
        sql.FROM("activity_coupon");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ActivityCoupon record = (ActivityCoupon) parameter.get("record");
        ActivityCouponExample example = (ActivityCouponExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("activity_coupon");
        
        if (record.getId() != null) {
            sql.SET("`id` = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("`coupon_id` = #{record.couponId,jdbcType=INTEGER}");
        }
        
        if (record.getActivityId() != null) {
            sql.SET("`activity_id` = #{record.activityId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("activity_coupon");
        
        sql.SET("`id` = #{record.id,jdbcType=INTEGER}");
        sql.SET("`coupon_id` = #{record.couponId,jdbcType=INTEGER}");
        sql.SET("`activity_id` = #{record.activityId,jdbcType=INTEGER}");
        
        ActivityCouponExample example = (ActivityCouponExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(ActivityCoupon record) {
        SQL sql = new SQL();
        sql.UPDATE("activity_coupon");
        
        if (record.getCouponId() != null) {
            sql.SET("`coupon_id` = #{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getActivityId() != null) {
            sql.SET("`activity_id` = #{activityId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("`id` = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, ActivityCouponExample example, boolean includeExamplePhrase) {
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