package com.kayo.blog.web.convert;

import com.kayo.blog.common.domain.dos.CommentDO;
import com.kayo.blog.web.model.vo.comment.FindCommentItemRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentConvert {
    /**
     * 初始化 convert 实例
     */
    CommentConvert INSTANCE = Mappers.getMapper(CommentConvert.class);

    /**
     * CommentDO -> FindCommentItemRspVO
     */
    FindCommentItemRspVO convertDO2VO(CommentDO bean);

}