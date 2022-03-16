package com.real.gomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.real.common.utils.PageUtils;
import com.real.gomall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 00:11:46
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

