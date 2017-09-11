package com.bo.zhao.maven.inaction.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 文件描述：
 *
 * @author Bo.Zhao
 * @version 3.0
 * @since 17/9/11
 */
@Component
public class ResourceFilter {

    @Value("${debug}")
    private String debug;


    public String getDebug() {
        return debug;
    }
}
