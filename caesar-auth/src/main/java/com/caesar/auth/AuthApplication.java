package com.caesar.auth;

import com.caesar.admin.api.UserFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author caesar
 * @desc 权限认证服务
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@EnableFeignClients(basePackageClasses = {UserFeignClient.class})
@SpringBootApplication
@EnableDiscoveryClient
public class AuthApplication {
    public static void main(String[] args) {

        SpringApplication.run(AuthApplication.class, args);

    }
}
