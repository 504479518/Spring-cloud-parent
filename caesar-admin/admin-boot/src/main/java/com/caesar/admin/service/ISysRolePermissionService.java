package com.caesar.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.dto.RolePermissionDTO;
import com.caesar.admin.pojo.entity.SysRolePermission;

import java.util.List;

/**
 * @author caesar
 * @desc 角色权限
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysRolePermissionService extends IService<SysRolePermission> {

    List<Long> listPermissionId(Long moduleId, Long roleId);

    List<Long> listPermissionId(Long roleId);

    boolean update(RolePermissionDTO rolePermission);


}
