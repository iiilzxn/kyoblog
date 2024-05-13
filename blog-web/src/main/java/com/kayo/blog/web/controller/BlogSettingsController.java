package com.kayo.blog.web.controller;

import com.kayo.blog.common.utils.Response;
import com.kayo.blog.web.service.BlogSettingsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kyo
 * @url: kyoblog.top
 * @date: 2024-02-15 14:01
 * @description: 博客设置
 **/
@RestController
@RequestMapping("/blog/settings")
@Api(tags = "博客设置")
public class BlogSettingsController {

    @Autowired
    private BlogSettingsService blogSettingsService;

    @PostMapping("/detail")
    @ApiOperation(value = "前台获取博客详情")
    public Response findDetail() {
        return blogSettingsService.findDetail();
    }

}
