package com.dawn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Dawn on 2020-04-04.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dawn","com.dawn.facade.**","org.dayatang"})
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
    }

}
