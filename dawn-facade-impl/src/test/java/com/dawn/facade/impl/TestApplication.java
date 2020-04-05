package com.dawn.facade.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Dawn on 2020-04-05.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dawn","org.dayatang"})
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }
}
