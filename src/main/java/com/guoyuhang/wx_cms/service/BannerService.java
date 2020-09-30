package com.guoyuhang.wx_cms.service;

import com.guoyuhang.wx_cms.dao.model.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 23:17
 * @description:
 */

public interface BannerService {

    public List<Banner> findAllBanner();

    public Integer insertOneBanner(Banner banner);

    public Banner findById(Integer id);
}
