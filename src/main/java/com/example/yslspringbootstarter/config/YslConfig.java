package com.example.yslspringbootstarter.config;

import com.example.yslspringbootstarter.service.YslService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(YslProperties.class)
public class YslConfig {

    @Autowired
    public YslProperties yslProperties;

    /**
     * 将YslService注入IOC容器之中
     * @return
     */
    @Bean
    public YslService getYslService(){
        return new YslService();
    }

}
