package com.kayo.blog.web.model.vo.article;

import com.kayo.blog.web.model.vo.tag.FindTagListRspVO;
import com.kayo.blog.web.model.vo.category.FindCategoryListRspVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindIndexArticlePageListRspVO {
    private Long id;
    private String cover;
    private String title;
    private LocalDate createDate;
    private String summary;
    /**
     * 文章分类
     */
    private FindCategoryListRspVO category;

    /**
     * 文章标签
     */
    private List<FindTagListRspVO> tags;

    /**
     * 是否置顶
     */
    private Boolean isTop;
}
