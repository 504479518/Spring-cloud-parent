package com.caesar.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.caesar.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author caesar
 * @desc 字典
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysDictItem extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String value;

    private String dictCode;

    private String sort;

    private Integer status;

    private Integer defaulted;

    private String remark;

}
