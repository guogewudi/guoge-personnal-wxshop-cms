package com.guoyuhang.wx_cms.service.Impl;

import com.guoyuhang.wx_cms.dao.mapper.BannerImageMapper;
import com.guoyuhang.wx_cms.dao.model.BannerImage;
import com.guoyuhang.wx_cms.dao.model.BannerImageExample;
import com.guoyuhang.wx_cms.service.BannerImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 11:39
 * @description:
 */
@Service
public class BannerImageServiceImpl implements BannerImageService {
    @Autowired
    private BannerImageMapper bannerImageMapper;

    @Override
    public Integer insertBannerImage(BannerImage bannerImage) {
        return bannerImageMapper.insertSelective(bannerImage);

    }

    @Override
    public Integer updateBannerImage(BannerImage bannerImage) {
        return bannerImageMapper.updateByPrimaryKey(bannerImage);
    }

    @Override
    public Integer deleteBannerImage(Integer id) {
        return bannerImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public BannerImage queryImageById(Integer id) {
      return   bannerImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BannerImage> findAll() {
        return bannerImageMapper.findAll();
    }

    @Override
    public Integer insertOne(BannerImage bannerImage) {
        return bannerImageMapper.insertOne(bannerImage);
    }

    @Override
    public List<BannerImage> findByBannerId(Integer id) {
        BannerImageExample bannerImageExample = new BannerImageExample();
        bannerImageExample.createCriteria().andBannerIdEqualTo(id);
        return bannerImageMapper.selectByExample(bannerImageExample);
    }
}
