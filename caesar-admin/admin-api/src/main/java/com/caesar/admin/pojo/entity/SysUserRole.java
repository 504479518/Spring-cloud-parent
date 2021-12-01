package com.caesar.admin.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author caesar
 * @desc 用户角色
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@Accessors(chain = true)
public class SysUserRole {

    private Long userId;

    private Long roleId;

}
