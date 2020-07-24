package com.example.elkkafkaservicec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/server")
    public String getString() {
        logger.info("service-c,接收service-b的调用");
        return "I am service-c.";
    }

}
