package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.springbootinit.model.entity.Picture;

/**
 * 图片服务
 *
 * @author Rocky
 */
public interface PictureService {

    /**
     * 检索图片
     *
     * @param searchText
     * @param pageSize
     * @param pageNum
     * @return
     */
    Page<Picture> searchPicture(String searchText, long pageSize, long pageNum);
}
