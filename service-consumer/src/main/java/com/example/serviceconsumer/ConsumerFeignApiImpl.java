package com.example.serviceconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsumerFeignApiImpl implements ConsumerFeignApi {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getString() {
        logger.info("熔断，默认回调函数");
        return "请求异常，返回熔断";
    }

}
