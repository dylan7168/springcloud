package org.example.serviceprovider3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/service")
    public String getString() {
        logger.info("service-provider-3接收调用");
        return "I'm service-provider-3.";
    }

}
