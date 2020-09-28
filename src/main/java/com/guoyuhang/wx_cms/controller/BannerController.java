package com.guoyuhang.wx_cms.controller;

import com.guoyuhang.wx_cms.common.BannerJsonResult;
import com.guoyuhang.wx_cms.common.JsonResult;
import com.guoyuhang.wx_cms.dao.model.Banner;
import com.guoyuhang.wx_cms.dao.model.BannerImage;
import com.guoyuhang.wx_cms.service.BannerImageService;
import com.guoyuhang.wx_cms.service.BannerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Action;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 11:29
 * @description:
 */
@RestController
@RequestMapping("/banner")
@Slf4j
public class BannerController {

    @Autowired
    private BannerImageService bannerImageService;
    @Autowired
    private BannerService bannerService;
    @PostMapping("/insertBannerImage")
    public JsonResult newBannerImage(@RequestBody BannerImage bannerImage){
        bannerImageService.insertOne(bannerImage);
        return new JsonResult(200,"ok",bannerImage);
    }

    @GetMapping("/getBannerImage")
    public JsonResult getBannerImage(@RequestParam Integer id){
        BannerImage bannerImage = bannerImageService.queryImageById(id);
        return new JsonResult(200,"ok",bannerImage);
    }

    @PostMapping("insertBanner")
    public JsonResult insertBanner(@RequestBody Banner banner){
        bannerService.insertOneBanner(banner);
        return new JsonResult(200,"ok",banner);
    }

    @GetMapping("/getAllBanner")
    public JsonResult getAllBanner(){
        List<Banner> allBanner= bannerService.findAllBanner();
        return new JsonResult(200,"ok",allBanner);
    }

    @GetMapping("/getBanner/{id}")
    public BannerJsonResult getBanner(@PathVariable Integer id){
        Banner banner = bannerService.findById(id);
        BannerJsonResult bannerJsonResult = new BannerJsonResult();
        bannerJsonResult.setImg(banner.getImg());
        bannerJsonResult.setId(banner.getId());
        bannerJsonResult.setDescription(banner.getDescription());
        bannerJsonResult.setName(banner.getName());
        List<BannerImage> byBannerId = bannerImageService.findByBannerId(id);
        bannerJsonResult.setItem(byBannerId);
        return bannerJsonResult;
    }
}
