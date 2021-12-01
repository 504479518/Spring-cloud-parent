package com.caesar.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.caesar.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author caesar
 * @desc 字典信息
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysDict extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String code;

    private String name;

    private Integer status;

    private String remark;

}
