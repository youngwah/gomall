package com.real.gomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.real.common.utils.PageUtils;
import com.real.gomall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 00:11:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listTree();

    void removeMenusByIds(List<Long> asList);
}

