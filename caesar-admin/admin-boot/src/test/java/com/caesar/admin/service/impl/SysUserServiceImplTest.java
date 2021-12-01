package com.caesar.admin.service.impl;

import com.caesar.admin.pojo.entity.SysUser;
import com.caesar.admin.service.ISysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author caesar
 * @desc 权限测试类
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@SpringBootTest
class SysUserServiceImplTest {

    @Autowired
    private ISysUserService iSysUserService;

    @Test
    public void saveUser() {
        SysUser user = new SysUser();
        user.setUsername("root");
        user.setNickname("凯撒");
        user.setMobile("504479518");
        user.setEmail("504479518@qq.com");
        iSysUserService.saveUser(user);
    }
}