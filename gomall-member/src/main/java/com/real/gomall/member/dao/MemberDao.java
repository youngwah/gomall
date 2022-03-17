package com.real.gomall.member.dao;

import com.real.gomall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Go
 * @email go@qq.com
 * @date 2022-03-17 21:27:38
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
