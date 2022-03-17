package com.real.gomall.coupon.dao;

import com.real.gomall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:25:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
