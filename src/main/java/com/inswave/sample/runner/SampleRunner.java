package com.inswave.sample.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements CommandLineRunner {

    @Value("${sample.configmap.type}")
    private String type;

    @Override
    public void run(String... args) {
        System.out.println(String.format("Type is %s", type));
    }
}
