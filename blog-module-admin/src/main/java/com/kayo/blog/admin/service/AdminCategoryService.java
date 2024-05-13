package com.kayo.blog.admin.service;

import com.kayo.blog.admin.model.vo.category.AddCategoryReqVO;
import com.kayo.blog.admin.model.vo.category.DeleteCategoryReqVO;
import com.kayo.blog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.kayo.blog.common.utils.PageResponse;
import com.kayo.blog.common.utils.Response;

/**
 * @author: kyo
 * @url: kyoblog.top
 * @date: 2024-02-15 14:03
 * @description: TODO
 **/
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryPageList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}
