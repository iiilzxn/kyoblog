package com.kayo.blog.web.service.impl;

import com.kayo.blog.common.domain.dos.BlogSettingsDO;
import com.kayo.blog.common.domain.mapper.BlogSettingsMapper;
import com.kayo.blog.common.utils.Response;
import com.kayo.blog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import com.kayo.blog.web.service.BlogSettingsService;
import com.kayo.blog.web.convert.BlogSettingsConvert;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
