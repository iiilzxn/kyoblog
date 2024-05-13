package com.kayo.blog.admin.service;

import com.kayo.blog.common.utils.Response;

/**
 * @author: kyo
 * @url: kyoblog.top
 * @date: 2024-02-15 14:03
 * @description: 仪表盘
 **/
public interface AdminDashboardService {

    /**
     * 获取仪表盘基础统计信息
     * @return
     */
    Response findDashboardStatistics();

    /**
     * 获取文章发布热点统计信息
     * @return
     */
    Response findDashboardPublishArticleStatistics();

    /**
     * 获取文章最近一周 PV 访问量统计信息
     * @return
     */
    Response findDashboardPVStatistics();
}
