package com.bo.zhao.maven.inaction.test;

import com.bo.zhao.maven.inaction.helloworld.ResourceFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 文件描述：
 *
 * @author Bo.Zhao
 * @version 3.0
 * @since 17/9/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-core.xml")
public class SpringTest {

    @Resource
    private ResourceFilter resourceFilter;

    @Test
    public void test() {
        System.out.println(resourceFilter.getDebug());
    }
}
