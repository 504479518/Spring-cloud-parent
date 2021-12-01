package com.caesar.auth.security.extension.wechat;

import lombok.Data;

/**
 * @author caesar
 * @desc 微信用户信息
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
public class WechatUserInfo {
    private String avatarUrl;

    private String city;

    private String country;

    private Integer gender;

    private String language;

    private String nickName;

    private String province;

}
