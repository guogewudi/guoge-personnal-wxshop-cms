package com.guoyuhang.wx_cms.service.Impl;

import com.guoyuhang.wx_cms.dao.mapper.BannerMapper;
import com.guoyuhang.wx_cms.dao.model.Banner;
import com.guoyuhang.wx_cms.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 23:18
 * @description:
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper  bannerMapper;
    @Override
    public List<Banner> findAllBanner() {
        return bannerMapper.findAllBanner();
    }

    @Override
    public Integer insertOneBanner(Banner banner) {
        return bannerMapper.insertOneBanner(banner);
    }

    @Override
    public Banner findById(Integer id) {
        return bannerMapper.selectByPrimaryKey(id);
    }
}
