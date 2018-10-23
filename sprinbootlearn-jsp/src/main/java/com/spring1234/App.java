package com.spring1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ProjectName: sprinbootlearn
 * @Package: com.spring1234.controller
 * @ClassName: App
 * @Author: zhanghenglei
 * @Description: main
 * @Date: 22/10/2018 18:19
 * @Version: 1.0
 */
@ComponentScan(basePackages = { "com.spring1234.controller" })
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}