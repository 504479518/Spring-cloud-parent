package com.caesar.admin.pojo.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author caesar
 * @desc 树形下拉视图对象
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
@NoArgsConstructor
public class TreeSelectVO {

    public TreeSelectVO(Long id, String label) {
        this.id = id;
        this.label = label;
    }

    private Long id;

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<TreeSelectVO> children;

}
