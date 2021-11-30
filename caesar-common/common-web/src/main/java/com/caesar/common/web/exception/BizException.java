package com.caesar.common.web.exception;

import com.caesar.common.result.IResultCode;
import lombok.Getter;

/**
 * @author caesar
 * @desc Feign相关配置类
 * @email 504479518@qq.com
 * @date 2021/12/1
 */
@Getter
public class BizException extends RuntimeException {

    public IResultCode resultCode;

    public BizException(IResultCode errorCode) {
        super(errorCode.getMsg());
        this.resultCode = errorCode;
    }

    public BizException(String message){
        super(message);
    }

    public BizException(String message, Throwable cause){
        super(message, cause);
    }

    public BizException(Throwable cause){
        super(cause);
    }
}
