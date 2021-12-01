package com.caesar.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caesar.admin.pojo.entity.SysOauthClient;

/**
 * @author caesar
 * @desc Oauth客户端
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public interface ISysOauthClientService extends IService<SysOauthClient> {
    void cleanCache();
}
