package com.guoyuhang.wx_cms.common;

import com.guoyuhang.wx_cms.dao.model.BannerItem;
import lombok.Data;

import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 19:48
 * @description:
 */
@Data
public class BannerJsonResult {
    private Integer id;
    private String name;
    private String description;
    private String img;
    private String title;
    private List<BannerItem> item;
}
