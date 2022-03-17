package com.real.gomall.order.dao;

import com.real.gomall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:23:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
