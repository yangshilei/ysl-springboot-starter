package com.example.yslspringbootstarter.service;

import com.example.yslspringbootstarter.config.YslProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 随便定义一个业务处理的service
 */
public class YslService {

    @Autowired
    YslProperties properties;

    public String yslSay(){
        return properties.getName() +"说" + properties.getAge() + "岁，他喜欢玩" + properties.getPlay();
    }

}
