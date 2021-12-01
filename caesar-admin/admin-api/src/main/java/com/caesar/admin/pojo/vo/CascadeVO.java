package com.caesar.admin.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author caesar
 * @desc 级联视图对象
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@Accessors(chain = true)
public class CascadeVO {

    private Long value;

    private String label;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<CascadeVO> children;
}
