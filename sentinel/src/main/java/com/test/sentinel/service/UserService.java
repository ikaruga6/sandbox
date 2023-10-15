package com.test.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.util.StringUtil;
import com.test.sentinel.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @SentinelResource(value = "UserService#getUser", blockHandler = "getDefaultUser", fallback = "handleUserFallback")
    public User getUser(String name) {
//        sleep(500);
        if (StringUtil.isBlank(name)) {
            throw new RuntimeException("报错了");
        }
        return new User("1", name);
    }

    public User getDefaultUser(String name, BlockException e) {
        log.error("降级", e);
        return new User("2", "degrade");
    }

    public User handleUserFallback(String name, Throwable e) {
        log.error("异常", e);
        return new User("3", "exception");
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
