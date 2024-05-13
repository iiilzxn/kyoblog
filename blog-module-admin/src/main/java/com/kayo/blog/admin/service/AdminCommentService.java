package com.kayo.blog.admin.service;

import com.kayo.blog.admin.model.vo.comment.DeleteCommentReqVO;
import com.kayo.blog.admin.model.vo.comment.ExamineCommentReqVO;
import com.kayo.blog.admin.model.vo.comment.FindCommentPageListReqVO;
import com.kayo.blog.common.utils.Response;

public interface AdminCommentService {

    /**
     * 查询评论分页数据
     * @param findCommentPageListReqVO
     * @return
     */
    Response findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);

    /**
     * 删除评论
     * @param deleteCommentReqVO
     * @return
     */
    Response deleteComment(DeleteCommentReqVO deleteCommentReqVO);

    /**
     * 评论审核
     * @param examineCommentReqVO
     * @return
     */
    Response examine(ExamineCommentReqVO examineCommentReqVO);
}
