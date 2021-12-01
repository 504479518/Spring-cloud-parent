package com.caesar.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.entity.SysRole;

import java.util.List;

/**
 * @author caesar
 * @desc 角色
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysRoleService extends IService<SysRole> {

    boolean delete(List<Long> ids);
}
