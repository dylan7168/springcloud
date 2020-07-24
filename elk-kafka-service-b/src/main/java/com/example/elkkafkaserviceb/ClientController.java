package com.example.elkkafkaserviceb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClientFeignAPI api;

    @GetMapping("/server")
    public String getString() {
        logger.info("service-b,接收service-a调用,并调用service-c");
        return api.getString();
    }

}
