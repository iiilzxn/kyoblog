package com.kayo.blog.web.service;

import com.kayo.blog.common.utils.Response;
import com.kayo.blog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.kayo.blog.web.model.vo.category.FindCategoryListReqVO;


public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
