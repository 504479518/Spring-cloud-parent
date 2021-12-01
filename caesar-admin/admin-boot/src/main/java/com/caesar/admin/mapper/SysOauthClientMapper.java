package com.caesar.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caesar.admin.pojo.entity.SysOauthClient;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author caesar
 * @desc Oauth认证dao层
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Mapper
public interface SysOauthClientMapper extends BaseMapper<SysOauthClient> {
}
