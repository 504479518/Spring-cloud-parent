package com.caesar.admin.api.fallback;

import com.caesar.admin.api.UserFeignClient;
import com.caesar.common.result.Result;
import com.caesar.common.result.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author caesar
 * @desc 用户feign远程调用
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Component
@Slf4j
public class UserFeignFallbackClient implements UserFeignClient {

    @Override
    public Result getUserByUsername(String username) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return Result.failed(ResultCode.DEGRADATION);
    }
}
