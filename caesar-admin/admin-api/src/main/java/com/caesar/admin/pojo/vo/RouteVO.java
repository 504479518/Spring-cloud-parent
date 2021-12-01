package com.caesar.admin.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author caesar
 * @desc 路由视图模型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RouteVO {

    private String path;

    private String component;

    private String redirect;

    private Boolean alwaysShow;

    private String name;

    private Boolean hidden;

    private Meta meta;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Meta {
        private String title;
        private String icon;
        private List<String> roles;
    }

    private List<RouteVO> children;
}
