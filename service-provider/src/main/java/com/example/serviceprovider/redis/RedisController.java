package com.example.serviceprovider.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
public class RedisController {

    public static final Logger log = LoggerFactory.getLogger(RedisController.class);

    @Resource
    private RedisUtils redisUtils;

    @RequestMapping(value = "/hello/{id}")
    public String hello(@PathVariable(value = "id") String id) {
        //查询缓存中是否存在
        boolean hasKey = redisUtils.exists(id);
        String str = "";
        if (hasKey) {
            //获取缓存
            Object object = redisUtils.get(id);
            log.info("从缓存获取的数据" + object);
            str = object.toString();
        } else {
            //从数据库中获取信息
            log.info("从数据库中获取数据");
            str = "mysql";
            //数据插入缓存（set中的参数含义：key值，user对象，缓存存在时间10（long类型），时间单位）
            redisUtils.set(id, str, 10L, TimeUnit.MINUTES);
            log.info("数据插入缓存" + str);
        }
        return str;
    }

}
