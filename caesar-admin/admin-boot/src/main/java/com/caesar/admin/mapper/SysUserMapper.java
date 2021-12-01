package com.caesar.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caesar.admin.pojo.dto.UserAuthDTO;
import com.caesar.admin.pojo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author caesar
 * @desc 用户Dao层
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> list(Page<SysUser> page, SysUser user);

    UserAuthDTO getByUsername(String username);
}
