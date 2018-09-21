package com.learn.ribbonlearn;

import com.learn.ribbonlearn.http.HttpCustomHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
public class RibbonLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonLearnApplication.class, args);
    }

    @Bean
    public RestTemplate newInstance() {
        RestTemplate template = new RestTemplate();
        template.setInterceptors(Collections.singletonList(new HttpCustomHandler()));
        return template;
    }
}
