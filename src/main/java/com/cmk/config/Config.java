package com.cmk.config;

import com.cmk.bean.Order;
import com.cmk.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public User user() {
        return new User(1001,"张无忌");
    }

    @Bean
    public Order order() {
        return new Order(10002,"支付订单");
    }
}
