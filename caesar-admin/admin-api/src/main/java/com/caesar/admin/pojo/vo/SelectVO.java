package com.caesar.admin.pojo.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author caesar
 * @desc 查询视图模型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@NoArgsConstructor
public class SelectVO {

    public SelectVO(Long value, String label) {
        this.value = value;
        this.label = label;
    }

    private Long value;

    private String label;

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private List<SelectVO> children;

}
