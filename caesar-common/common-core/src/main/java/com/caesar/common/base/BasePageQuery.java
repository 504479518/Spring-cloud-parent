package com.caesar.common.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author caesar
 * @desc 基础分页请求对象
 * @email 504479518@qq.com
 * @date 2021/2/28
 */
@Data
public class BasePageQuery {

    @ApiModelProperty(value = "当前页", example = "1")
    private int pageNum = 1;

    @ApiModelProperty(value = "每页记录数", example = "10")
    private int pageSize = 10;
}
