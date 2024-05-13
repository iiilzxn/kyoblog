package com.kayo.blog.admin.convert;

import com.kayo.blog.admin.model.vo.comment.FindCommentPageListRspVO;
import com.kayo.blog.common.domain.dos.CommentDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentConvert {
    /**
     * 初始化 convert
     */
    CommentConvert INSTANCE = Mappers.getMapper(CommentConvert.class);

    /**
     * DO 转化为 VO
     */
    FindCommentPageListRspVO convertDO2VO(CommentDO bean);

}