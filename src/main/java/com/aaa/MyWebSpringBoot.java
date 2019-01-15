package com.aaa;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author:Mr.An
 * @description:
 * @createTime:10:04 2019/1/14
 */
public class MyWebSpringBoot extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(CrmApplication.class);
    }
}
