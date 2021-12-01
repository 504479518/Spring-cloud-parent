package com.caesar.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caesar.admin.pojo.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author caesar
 * @desc 菜单Dao层
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> listRoute();

}
