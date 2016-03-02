package com.iweb.panda.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(TestSpring.class);
    private ApplicationContext  context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    @Test
    public void getBeanNames() {
        for (String s : context.getBeanDefinitionNames()) {
            logger.info(s);
        }
    }

}