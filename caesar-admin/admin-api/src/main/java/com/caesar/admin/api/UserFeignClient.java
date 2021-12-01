package com.caesar.admin.api;

import com.caesar.admin.api.fallback.UserFeignFallbackClient;
import com.caesar.admin.pojo.dto.UserAuthDTO;
import com.caesar.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author caesar
 * @desc UserFeign调用
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@FeignClient(value = "caesar-admin", fallback = UserFeignFallbackClient.class)
public interface UserFeignClient {

    @GetMapping("/api/v1/users/username/{username}")
    Result<UserAuthDTO> getUserByUsername(@PathVariable String username);
}
