package com.example.elkkafkaclient.web;

import com.example.elkkafkaclient.service.CilentFeignApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CilentFeignApi api;

    @GetMapping("/client")
    public String getString() {
        logger.info("开始调用服务端Server");
        return api.getString();
    }

}
