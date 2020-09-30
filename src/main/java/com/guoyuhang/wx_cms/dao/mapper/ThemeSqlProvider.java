package com.guoyuhang.wx_cms.dao.mapper;

import com.guoyuhang.wx_cms.dao.model.Theme;
import com.guoyuhang.wx_cms.dao.model.ThemeExample;
import com.guoyuhang.wx_cms.dao.model.ThemeExample.Criteria;
import com.guoyuhang.wx_cms.dao.model.ThemeExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class ThemeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String countByExample(ThemeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("theme");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String deleteByExample(ThemeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("theme");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String insertSelective(Theme record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("theme");
        
        if (record.getTitle() != null) {
            sql.VALUES("`title`", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("`description`", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("`name`", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("`create_time`", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTplName() != null) {
            sql.VALUES("`tpl_name`", "#{tplName,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("`update_time`", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeleteTime() != null) {
            sql.VALUES("`delete_time`", "#{deleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEntranceImg() != null) {
            sql.VALUES("`entrance_img`", "#{entranceImg,jdbcType=VARCHAR}");
        }
        
        if (record.getExtend() != null) {
            sql.VALUES("`extend`", "#{extend,jdbcType=VARCHAR}");
        }
        
        if (record.getInternalTopImg() != null) {
            sql.VALUES("`internal_top_img`", "#{internalTopImg,jdbcType=VARCHAR}");
        }
        
        if (record.getTitleImg() != null) {
            sql.VALUES("`title_img`", "#{titleImg,jdbcType=VARCHAR}");
        }
        
        if (record.getOnline() != null) {
            sql.VALUES("`online`", "#{online,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String selectByExample(ThemeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("`id`");
        } else {
            sql.SELECT("`id`");
        }
        sql.SELECT("`title`");
        sql.SELECT("`description`");
        sql.SELECT("`name`");
        sql.SELECT("`create_time`");
        sql.SELECT("`tpl_name`");
        sql.SELECT("`update_time`");
        sql.SELECT("`delete_time`");
        sql.SELECT("`entrance_img`");
        sql.SELECT("`extend`");
        sql.SELECT("`internal_top_img`");
        sql.SELECT("`title_img`");
        sql.SELECT("`online`");
        sql.FROM("theme");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Theme record = (Theme) parameter.get("record");
        ThemeExample example = (ThemeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("theme");
        
        if (record.getId() != null) {
            sql.SET("`id` = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("`title` = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("`description` = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("`create_time` = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTplName() != null) {
            sql.SET("`tpl_name` = #{record.tplName,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("`update_time` = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeleteTime() != null) {
            sql.SET("`delete_time` = #{record.deleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEntranceImg() != null) {
            sql.SET("`entrance_img` = #{record.entranceImg,jdbcType=VARCHAR}");
        }
        
        if (record.getExtend() != null) {
            sql.SET("`extend` = #{record.extend,jdbcType=VARCHAR}");
        }
        
        if (record.getInternalTopImg() != null) {
            sql.SET("`internal_top_img` = #{record.internalTopImg,jdbcType=VARCHAR}");
        }
        
        if (record.getTitleImg() != null) {
            sql.SET("`title_img` = #{record.titleImg,jdbcType=VARCHAR}");
        }
        
        if (record.getOnline() != null) {
            sql.SET("`online` = #{record.online,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("theme");
        
        sql.SET("`id` = #{record.id,jdbcType=INTEGER}");
        sql.SET("`title` = #{record.title,jdbcType=VARCHAR}");
        sql.SET("`description` = #{record.description,jdbcType=VARCHAR}");
        sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        sql.SET("`create_time` = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("`tpl_name` = #{record.tplName,jdbcType=VARCHAR}");
        sql.SET("`update_time` = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("`delete_time` = #{record.deleteTime,jdbcType=TIMESTAMP}");
        sql.SET("`entrance_img` = #{record.entranceImg,jdbcType=VARCHAR}");
        sql.SET("`extend` = #{record.extend,jdbcType=VARCHAR}");
        sql.SET("`internal_top_img` = #{record.internalTopImg,jdbcType=VARCHAR}");
        sql.SET("`title_img` = #{record.titleImg,jdbcType=VARCHAR}");
        sql.SET("`online` = #{record.online,jdbcType=TINYINT}");
        
        ThemeExample example = (ThemeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(Theme record) {
        SQL sql = new SQL();
        sql.UPDATE("theme");
        
        if (record.getTitle() != null) {
            sql.SET("`title` = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("`description` = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("`name` = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("`create_time` = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTplName() != null) {
            sql.SET("`tpl_name` = #{tplName,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("`update_time` = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeleteTime() != null) {
            sql.SET("`delete_time` = #{deleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEntranceImg() != null) {
            sql.SET("`entrance_img` = #{entranceImg,jdbcType=VARCHAR}");
        }
        
        if (record.getExtend() != null) {
            sql.SET("`extend` = #{extend,jdbcType=VARCHAR}");
        }
        
        if (record.getInternalTopImg() != null) {
            sql.SET("`internal_top_img` = #{internalTopImg,jdbcType=VARCHAR}");
        }
        
        if (record.getTitleImg() != null) {
            sql.SET("`title_img` = #{titleImg,jdbcType=VARCHAR}");
        }
        
        if (record.getOnline() != null) {
            sql.SET("`online` = #{online,jdbcType=TINYINT}");
        }
        
        sql.WHERE("`id` = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, ThemeExample example, boolean includeExamplePhrase) {
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