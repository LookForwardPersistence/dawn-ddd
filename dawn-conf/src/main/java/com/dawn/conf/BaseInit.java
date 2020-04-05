package com.dawn.conf;

import org.dayatang.domain.InstanceFactory;
import org.dayatang.ioc.spring.factory.SpringInstanceProvider;
import org.dayatang.querychannel.QueryChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by Dawn on 2020-04-04.
 */
@Configuration
public class BaseInit {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    QueryChannelService queryChannelService;


    @PostConstruct
    public void init(){
        SpringInstanceProvider springInstanceProvider = new SpringInstanceProvider(applicationContext);
        InstanceFactory.setInstanceProvider(springInstanceProvider);
        QueryChannelHolder.setQueryChannelService(queryChannelService);
    }
}
