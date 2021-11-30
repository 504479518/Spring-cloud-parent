package com.caesar.common.enums;

import lombok.Getter;

/**
 * @author caesar
 * @desc 认证方式枚举
 * @email 504479518@qq.com
 * @date 2021/12/1
 */
public enum AuthenticationMethodEnum {

    USERNAME("username", "用户名"),
    MOBILE("mobile", "手机号"),
    OPENID("openId", "开放式认证系统唯一身份标识");

    @Getter
    private String value;

    @Getter
    private String label;

    AuthenticationMethodEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public static AuthenticationMethodEnum getByValue(String value) {
        AuthenticationMethodEnum authenticationMethodEnum = null;
        for (AuthenticationMethodEnum item : values()) {
            if (item.getValue().equals(value)) {
                authenticationMethodEnum = item;
                continue;
            }
        }
        return authenticationMethodEnum;
    }

}
