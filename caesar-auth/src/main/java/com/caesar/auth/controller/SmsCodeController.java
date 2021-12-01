package com.caesar.auth.controller;

import com.caesar.common.result.Result;
import com.caesar.common.sms.service.AliyunSmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caesar
 * @desc 短信验证码
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Api(tags = "短信验证码")
@RestController
@RequestMapping("/sms-code")
@RequiredArgsConstructor
public class SmsCodeController {

    private final AliyunSmsService aliyunSmsService;

    @ApiOperation(value = "发送短信验证码")
    @ApiImplicitParam(name = "phoneNumber", example = "17621590365", value = "手机号", required = true)
    @PostMapping
    public Result sendSmsCode(String phoneNumber) {
        boolean result = aliyunSmsService.sendSmsCode(phoneNumber);
        return Result.judge(result);
    }
}
