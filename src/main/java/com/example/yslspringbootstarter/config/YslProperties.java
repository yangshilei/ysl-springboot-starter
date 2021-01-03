package com.example.yslspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** 
 * @Description: 配置信息实体 
 * @Author: yangshilei
 */
@ConfigurationProperties(prefix = "ysl")
public class YslProperties {
    
    private String name;
    
    private String age;
    
    private String play;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }
}
