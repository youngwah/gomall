package com.real.gomall.product.dao;

import com.real.gomall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 00:11:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
