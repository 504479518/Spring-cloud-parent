package com.caesar.admin.service.impl;

import com.caesar.admin.mapper.SysPermissionMapper;
import com.caesar.admin.pojo.entity.SysPermission;
import com.caesar.admin.service.ISysPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author caesar
 * @desc 权限测试类
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@SpringBootTest
@Slf4j
class SysPermissionServiceImplTest {

    @Autowired
    SysPermissionMapper sysPermissionMapper;

    ISysPermissionService iSysPermissionService;

    @Test
    void listPermissionRoles() {
        List<SysPermission> sysPermissions = sysPermissionMapper.listPermRoles();
        log.info(sysPermissions.toString());
    }

    @Test
    void refreshPermRolesRules() {

    }
}
