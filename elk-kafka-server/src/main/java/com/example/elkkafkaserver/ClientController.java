package com.example.elkkafkaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FeignClientAPI api;

    @GetMapping("/server")
    public String getString() {
        logger.info("接收客户端调用并调用服务端Server1");
        return api.getString();
    }

}
