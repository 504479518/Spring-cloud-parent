package com.caesar.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caesar.admin.pojo.entity.SysDictItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author caesar
 * @desc 字典dao层
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Mapper
public interface SysDictItemMapper extends BaseMapper<SysDictItem> {

    List<SysDictItem> list(Page<SysDictItem> page, SysDictItem dictItem);
}
