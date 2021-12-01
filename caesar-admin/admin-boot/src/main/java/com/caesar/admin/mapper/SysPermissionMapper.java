package com.caesar.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caesar.admin.pojo.entity.SysPermission;
import com.caesar.admin.pojo.vo.PermissionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author caesar
 * @desc 权限dao层
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {


    List<SysPermission> listPermRoles();

    List<String> listBtnPermByRoles(List<String> roles);

    List<PermissionVO> list(Page<PermissionVO> page, String name, Long menuId);
}
