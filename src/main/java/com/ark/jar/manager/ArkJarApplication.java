package com.ark.jar.manager;

import org.apache.commons.lang3.time.StopWatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version 1.0
 * @Descriptin:
 * @Date: 2019-03-15 下午9:30
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ImportResource(locations = {"classpath:dubbo/dubbo-*.xml"})
@ServletComponentScan(value = {"com.ark"})
public class ArkJarApplication implements WebMvcConfigurer {

    /**
     * @Description:common项目入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ArkJarApplication.class,args);
    }

    /**
     * @Description:拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SpringMonitorInterceptor()).addPathPatterns("/**");
    }




}
