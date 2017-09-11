package com.bo.zhao.maven.inaction.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ?????????
 *
 * @author Bo.Zhao
 * @version 3.0
 * @since 17/9/4
 */
public class HelloWorld {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        ResourceFilter resourceFilter = context.getBean("resourceFilter", ResourceFilter.class);
        System.out.println(resourceFilter.getDebug());
    }
}
