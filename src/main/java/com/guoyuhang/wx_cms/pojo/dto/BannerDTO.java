package com.guoyuhang.wx_cms.pojo.dto;

import com.guoyuhang.wx_cms.dao.model.Banner;
import lombok.Data;

import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 11:30
 * @description:
 */
@Data
public class BannerDTO {
    private Integer id;
    private String name;
    private String description;
    private String img;
    private String title;
    private List<Banner> item;
}
