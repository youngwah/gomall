package com.real.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.real.common.utils.PageUtils;
import com.real.gomall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:27:38
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

