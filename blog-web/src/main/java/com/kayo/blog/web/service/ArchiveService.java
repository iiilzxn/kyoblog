package com.kayo.blog.web.service;

import com.kayo.blog.common.utils.Response;
import com.kayo.blog.web.model.vo.archive.FindArchiveArticlePageListReqVO;


public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
