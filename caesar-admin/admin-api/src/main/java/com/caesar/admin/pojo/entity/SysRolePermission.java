package com.caesar.admin.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author caesar
 * @desc 角色权限
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@Accessors(chain = true)
public class SysRolePermission {
    private Long roleId;
    private Long permissionId;
}
