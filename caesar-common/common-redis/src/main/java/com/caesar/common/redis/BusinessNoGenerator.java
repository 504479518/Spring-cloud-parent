package com.caesar.common.redis;

import com.caesar.common.constant.RedisConstants;
import com.caesar.common.enums.BusinessTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author caesar
 * @desc 业务编码生成器
 * @email 504479518@qq.com
 * @date 2021/12/1
 */
@Component
@Slf4j
public class BusinessNoGenerator {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * @param businessType 业务类型枚举
     * @param digit        业务序号位数
     * @return
     */
    public String generate(BusinessTypeEnum businessType, Integer digit) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String date = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
        String key = RedisConstants.BUSINESS_NO_PREFIX + businessType.getCode() + ":" + date;
        Long increment = redisTemplate.opsForValue().increment(key);
        return date + businessType.getValue() + String.format("%0" + digit + "d", increment);
    }


    public String generate(BusinessTypeEnum businessType) {
        Integer defaultDigit = 6;
        return generate(businessType, defaultDigit);
    }

}
