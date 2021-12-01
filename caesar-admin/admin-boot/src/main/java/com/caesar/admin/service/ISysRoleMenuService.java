package com.caesar.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.entity.SysRoleMenu;

import java.util.List;

/**
 * @author caesar
 * @desc 角色菜单
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysRoleMenuService extends IService<SysRoleMenu> {

    List<Long> listMenuIds(Long roleId);

    /**
     * 修改角色菜单
     *
     * @param roleId
     * @param menuIds
     * @return
     */
    boolean update(Long roleId, List<Long> menuIds);
}
