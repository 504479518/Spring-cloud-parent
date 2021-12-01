package com.caesar.auth.common.enums;

import lombok.Getter;

/**
 * @author caesar
 * @desc 密码加密类型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public enum PasswordEncoderTypeEnum {

    BCRYPT("{bcrypt}", "BCRYPT加密"),
    NOOP("{noop}", "无加密明文");

    @Getter
    private String prefix;

    PasswordEncoderTypeEnum(String prefix, String desc) {
        this.prefix = prefix;
    }

}
