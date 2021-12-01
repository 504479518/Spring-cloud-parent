package com.caesar.admin.api;

import com.caesar.admin.pojo.entity.SysOauthClient;
import com.caesar.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author caesar
 * @desc OAuthClientFeign调用
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@FeignClient(value = "caesar-admin", contextId = "oauth-client")
public interface OAuthClientFeignClient {

    @GetMapping("/api/v1/oauth-clients/{clientId}")
    Result<SysOauthClient> getOAuthClientById(@PathVariable String clientId);
}
