package com.caesar.common.sms.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author caesar
 * @desc 阿里云短信模板
 * @email 504479518@qq.com
 * @date 2021/12/1
 */
@ConfigurationProperties(prefix = "aliyun.sms")
@Configuration
@Data
public class AliyunSmsProperties {

    private String accessKeyId;

    private String accessKeySecret;

    private String domain;

    private String regionId;

    private String templateCode;

    private String signName;

}
