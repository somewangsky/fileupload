package com.zxelec.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.servlet.MultipartConfigElement;
import javax.servlet.annotation.MultipartConfig;

@SpringBootApplication
@EnableScheduling
public class SpringbootStudyApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(SpringbootStudyApplication.class);
        springApplication.run(args);
    }

    @Bean
    public MultipartConfigElement multipartConfig(){

        MultipartConfigFactory multipartConfigFactory = new MultipartConfigFactory();
        multipartConfigFactory.setMaxFileSize("10240kB");
        multipartConfigFactory.setMaxRequestSize("102400KB");

        return multipartConfigFactory.createMultipartConfig();
    }
}
