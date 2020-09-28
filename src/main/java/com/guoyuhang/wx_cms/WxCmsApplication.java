package com.guoyuhang.wx_cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guoyuhang.wx_cms.dao.mapper")
public class WxCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxCmsApplication.class, args);
    }

}
