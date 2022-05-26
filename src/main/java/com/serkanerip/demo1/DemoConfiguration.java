package com.serkanerip.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DemoConfiguration {
    private final DemoProperties demoProperties;

    public DemoConfiguration(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @Bean
    public void init() {
        System.out.println("Demo project created!");
    }

    @Bean
    @Lazy
    public DemoService demoService(){
        System.out.println("Demo service bean created!");
        return new DemoService(new RestTemplate());
    }
}
