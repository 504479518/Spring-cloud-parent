package com.caesar.admin.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.caesar.admin.pojo.vo.UserVO;
import com.caesar.common.result.Result;
import lombok.extern.slf4j.Slf4j;

/**
 * @author caesar
 * @desc 用户接口降级逻辑
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Slf4j
public class UserBlockHandler {

    /**
     * 获取当前登录用户信息的熔断降级处理
     *
     * @param blockException
     * @return
     */
    public static Result<UserVO> handleGetCurrentUserBlock(BlockException blockException) {
        return Result.success(new UserVO());
    }


    public static Result handleGetUserByUsernameBlock(String username, BlockException blockException) {
        log.info("降级了：{}", username);
        return Result.failed("降级 了");
    }
}
