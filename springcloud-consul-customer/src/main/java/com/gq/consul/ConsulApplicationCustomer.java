package com.gq.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConsulApplicationCustomer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulApplicationCustomer.class).web(true).run(args);
    }
}
