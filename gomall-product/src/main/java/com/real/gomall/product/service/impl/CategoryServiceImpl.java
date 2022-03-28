package com.real.gomall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.real.common.utils.PageUtils;
import com.real.common.utils.Query;

import com.real.gomall.product.dao.CategoryDao;
import com.real.gomall.product.entity.CategoryEntity;
import com.real.gomall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 按树形结构返回所有分类
     * @return
     */
    @Override
    public List<CategoryEntity> listTree() {
        List<CategoryEntity> categoryEntities = this.list();
        List<CategoryEntity> listCategory = categoryEntities.stream().filter(entity -> entity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildren(menu,categoryEntities));
                    return menu;
                })
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());

        return listCategory;
    }

    /**
     * 根据分类ID批量删除
     * @param asList
     */
    @Override
    public void removeMenusByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 获取当前目录的子目录
     * @param menu
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity menu, List<CategoryEntity> all) {
        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid() == menu.getCatId())
                .map(entity -> {
                    entity.setChildren(getChildren(entity,all));
                    return entity;
                })
                .sorted(Comparator.comparingInt(menu2 -> (menu2.getSort() == null ? 0 : menu2.getSort())))
                .collect(Collectors.toList());
    }

}