package com.kayo.blog.web.service;

import com.kayo.blog.common.utils.Response;
import com.kayo.blog.web.model.vo.comment.PublishCommentReqVO;
import com.kayo.blog.web.model.vo.comment.FindCommentListReqVO;
import com.kayo.blog.web.model.vo.comment.FindQQUserInfoReqVO;

public interface CommentService {

    /**
     * 根据 QQ 号获取用户信息
     * @param findQQUserInfoReqVO
     * @return
     */
    Response findQQUserInfo(FindQQUserInfoReqVO findQQUserInfoReqVO);

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response publishComment(PublishCommentReqVO publishCommentReqVO);

    /**
     * 查询页面所有评论
     * @param findCommentListReqVO
     * @return
     */
    Response findCommentList(FindCommentListReqVO findCommentListReqVO);

}
