package com.real.gomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.real.common.utils.PageUtils;
import com.real.gomall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:25:28
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

