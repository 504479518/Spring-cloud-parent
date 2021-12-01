package com.caesar.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caesar.admin.mapper.SysDictItemMapper;
import com.caesar.admin.pojo.entity.SysDictItem;
import com.caesar.admin.service.ISysDictItemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caesar
 * @desc 字典项
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Service
public class SysDictItemServiceImpl extends ServiceImpl<SysDictItemMapper, SysDictItem> implements ISysDictItemService {

    @Override
    public IPage<SysDictItem> list(Page<SysDictItem> page, SysDictItem dict) {
        List<SysDictItem> list = this.baseMapper.list(page, dict);
        page.setRecords(list);
        return page;
    }

}
