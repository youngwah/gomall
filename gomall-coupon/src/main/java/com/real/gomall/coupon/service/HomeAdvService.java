package com.real.gomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.real.common.utils.PageUtils;
import com.real.gomall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:25:28
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

