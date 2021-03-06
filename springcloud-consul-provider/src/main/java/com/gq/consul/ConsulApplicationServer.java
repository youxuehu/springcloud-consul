package com.gq.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplicationServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulApplicationServer.class).web(true).properties("server.port=8888").run(args);
    }
}
