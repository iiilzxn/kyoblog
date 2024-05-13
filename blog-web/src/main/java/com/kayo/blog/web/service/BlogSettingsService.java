package com.kayo.blog.web.service;

import com.kayo.blog.common.utils.Response;


public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
