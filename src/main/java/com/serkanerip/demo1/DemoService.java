package com.serkanerip.demo1;

import lombok.Data;
import org.springframework.web.client.RestTemplate;

@Data
public class DemoService {
    private final RestTemplate restTemplate;

    public void sayHi() {
        System.out.println("Hi!");
    }
}
