package com.caesar.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.entity.SysMenu;
import com.caesar.admin.pojo.vo.MenuVO;
import com.caesar.admin.pojo.vo.RouteVO;
import com.caesar.admin.pojo.vo.SelectVO;
import com.caesar.admin.pojo.vo.TreeSelectVO;

import java.util.List;

/**
 * @author caesar
 * @desc 菜单
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysMenuService extends IService<SysMenu> {


    /**
     * 菜单表格（Table）层级列表
     *
     * @param name 菜单名称
     * @return
     */
    List<MenuVO> listTable(String name);


    /**
     * 菜单下拉（Select）层级列表
     *
     * @return
     */
    List<SelectVO> listSelect();


    /**
     * 菜单路由（Route）层级列表
     *
     * @return
     */
    List<RouteVO> listRoute();

    /**
     * 菜单下拉(TreeSelect)层级列表
     *
     * @return
     */
    List<TreeSelectVO> listTreeSelect();

    /**
     * 新增菜单
     *
     * @param menu
     * @return
     */
    boolean saveMenu(SysMenu menu);


    /**
     * 修改菜单
     *
     * @param menu
     * @return
     */
    boolean updateMenu(SysMenu menu);

    /**
     * 清理路由缓存
     */
    void cleanCache();
}
