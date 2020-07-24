package com.example.serviceconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ConsumerFeignApi api;

    @GetMapping("/client")
    public String getString() {
        logger.info("service-consumer调用服务");
        return api.getString();
    }

}
