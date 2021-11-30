package com.caesar.common.constraint;

import lombok.Data;

/**
 * @author caesar
 * @desc 城市实体类
 * @email 504479518@qq.com
 * @date 2021/12/1
 */
@Data
public class CityEntity {
    private String value;
    private String name;
    private String parent;
}
