package com.dawn.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Dawn on 2020-04-04.
 */
@SpringBootApplication(scanBasePackages = {"com.dawn","com.dawn.facade.**","org.dayatang","com.dawn.handler"})
//@ComponentScan(basePackages = {})
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
    }

}
