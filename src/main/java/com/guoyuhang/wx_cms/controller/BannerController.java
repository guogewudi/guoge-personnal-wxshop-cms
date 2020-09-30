package com.guoyuhang.wx_cms.controller;

import com.guoyuhang.wx_cms.common.BannerJsonResult;
import com.guoyuhang.wx_cms.common.JsonResult;
import com.guoyuhang.wx_cms.dao.model.Banner;
import com.guoyuhang.wx_cms.dao.model.BannerItem;
import com.guoyuhang.wx_cms.service.BannerItemService;
import com.guoyuhang.wx_cms.service.BannerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private BannerItemService bannerItemService;
    @Autowired
    private BannerService bannerService;

    @PostMapping("/insertBannerImage")
    public JsonResult newBannerImage(@RequestBody BannerItem bannerItem) {
        bannerItemService.insertOneBannerItem(bannerItem);
        return new JsonResult(200, "ok", bannerItem);
    }

    @GetMapping("/getBannerImage")
    public JsonResult getBannerImage(@RequestParam Integer id) {
        BannerItem bannerItemById = bannerItemService.findBannerItemById(id);
        return new JsonResult(200, "ok", bannerItemById);
    }

    @PostMapping("insertBanner")
    public JsonResult insertBanner(@RequestBody Banner banner) {
        bannerService.insertOneBanner(banner);
        return new JsonResult(200, "ok", banner);
    }

    @GetMapping("/getAllBanner")
    public JsonResult getAllBanner() {
        List<Banner> allBanner = bannerService.findAllBanner();
        return new JsonResult(200, "ok", allBanner);
    }

    @GetMapping("/getBanner/{id}")
    public BannerJsonResult getBanner(@PathVariable Integer id) {
        Banner banner = bannerService.findById(id);
        BannerJsonResult bannerJsonResult = new BannerJsonResult();
        bannerJsonResult.setImg(banner.getImg());
        bannerJsonResult.setId(banner.getId());
        bannerJsonResult.setDescription(banner.getDescription());
        bannerJsonResult.setName(banner.getName());
        List<BannerItem> byBannerId = bannerItemService.findByBannerId(id);
        bannerJsonResult.setItem(byBannerId);
        return bannerJsonResult;
    }
}
