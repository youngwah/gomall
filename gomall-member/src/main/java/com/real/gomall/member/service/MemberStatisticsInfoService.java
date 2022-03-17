package com.real.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.real.common.utils.PageUtils;
import com.real.gomall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:27:38
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

