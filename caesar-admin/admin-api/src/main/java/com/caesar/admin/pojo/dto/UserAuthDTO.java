package com.caesar.admin.pojo.dto;

import lombok.Data;

import java.util.List;

/**
 * @author caesar
 * @desc 系统用户认证信息
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
public class UserAuthDTO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态：1-有效；0-禁用
     */
    private Integer status;

    /**
     * 用户角色编码集合 ["ROOT","ADMIN"]
     */
    private List<String> roles;


}
