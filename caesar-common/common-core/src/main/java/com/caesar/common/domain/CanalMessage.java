package com.caesar.common.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author caesar
 * @desc 阿里开源同步插件Canal:消息监听
 * @email 504479518@qq.com
 * @date 2021/12/1
 */
@NoArgsConstructor
@Data
public class CanalMessage<T> {
    @JsonProperty("type")
    private String type;
    @JsonProperty("table")
    private String table;
    @JsonProperty("data")
    private List<T> data;
    @JsonProperty("database")
    private String database;
    @JsonProperty("es")
    private Long es;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isDdl")
    private Boolean isDdl;
    @JsonProperty("old")
    private List<T> old;
    @JsonProperty("pkNames")
    private List<String> pkNames;
    @JsonProperty("sql")
    private String sql;
    @JsonProperty("ts")
    private Long ts;
}
