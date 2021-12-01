package com.caesar.admin.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * @author caesar
 * @desc 部门视图数据模型
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Data
public class DeptVO {

    private Integer id;

    private String name;

    private Integer parentId;

    private String treePath;

    private Integer sort;

    private Integer status;

    private String leader;

    private String mobile;

    private String email;


    private List<DeptVO> children;

}
