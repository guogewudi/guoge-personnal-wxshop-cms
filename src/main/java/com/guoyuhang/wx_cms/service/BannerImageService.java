package com.guoyuhang.wx_cms.service;

import com.guoyuhang.wx_cms.dao.model.Banner;
import com.guoyuhang.wx_cms.dao.model.BannerImage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 11:38
 * @description:
 */
@Service
public interface BannerImageService {
    public Integer insertBannerImage(BannerImage  bannerImage);
    public Integer updateBannerImage(BannerImage  bannerImage);
    public Integer deleteBannerImage(Integer id);
    public BannerImage queryImageById(Integer id);
    List<BannerImage> findAll();

    Integer insertOne(BannerImage bannerImage);

    List<BannerImage> findByBannerId(Integer id);

}
