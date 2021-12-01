package com.caesar.admin.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.entity.SysDictItem;

/**
 * @author caesar
 * @desc 字典项
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysDictItemService extends IService<SysDictItem> {

    IPage<SysDictItem> list(Page<SysDictItem> page, SysDictItem dict);


}
