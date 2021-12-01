package com.caesar.admin.pojo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author caesar
 * @desc 角色权限数据模型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@Accessors(chain = true)
public class RolePermissionDTO {
    private Long roleId;
    private List<Long> permissionIds;
    private Long menuId;
}
