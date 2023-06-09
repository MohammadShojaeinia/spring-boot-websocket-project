package com.shojaeinia.ws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WebSocketProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSocketProjectApplication.class);
        log.info("hello world");
    }
}
