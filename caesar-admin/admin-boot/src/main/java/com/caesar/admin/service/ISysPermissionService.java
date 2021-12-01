package com.caesar.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.entity.SysPermission;
import com.caesar.admin.pojo.vo.PermissionVO;

import java.util.List;

/**
 * @author caesar
 * @desc 权限
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysPermissionService extends IService<SysPermission> {

    List<SysPermission> listPermRoles();


    List<String> listBtnPermByRoles(List<String> roles);

    /**
     * 刷新Redis缓存中角色菜单的权限规则，角色和菜单信息变更调用
     */
    boolean refreshPermRolesRules();

    IPage<PermissionVO> list(Page<PermissionVO> page, String name, Long menuId);
}
