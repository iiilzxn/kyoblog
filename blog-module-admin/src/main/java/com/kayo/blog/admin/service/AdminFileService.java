package com.kayo.blog.admin.service;

import com.kayo.blog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: kyo
 * @url: kyoblog.top
 * @date: 2024-02-15 14:03
 * @description: TODO
 **/
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
