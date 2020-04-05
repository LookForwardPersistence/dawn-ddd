package com.dawn.facade.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.PlatformTransactionManager;

import javax.transaction.Transactional;

/**
 * Created by Dawn on 2020-04-05.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@Transactional
@Rollback(value = true)
public abstract class BaseTest {

    @Before
    public void before(){

    }

    @After
    public void after(){

    }
}
