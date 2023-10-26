package com.example.demo.common;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class CommonProcess implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Hello from MyCommandLineRunner!");
        System.out.println("Arguments passed to the application:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
