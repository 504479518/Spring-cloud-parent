package com.caesar.admin.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * @author caesar
 * @desc 用户视图模型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
public class UserVO {

    private Long id;

    private String nickname;

    private String avatar;

    private List<String> roles;

    private List<String> perms;

}
