package com.caesar.admin.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author caesar
 * @desc 权限类型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
public enum PermTypeEnum {

    ROUTE(1, "接口权限"),
    BUTTON(2, "按钮权限");

    @Getter
    @Setter
    private Integer value;

    PermTypeEnum(Integer value, String desc) {
        this.value = value;
    }
}
