package com.example.external;

import com.example.external.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class ExternalProcess implements CommandLineRunner {

    private final Data data;

    @Autowired
    public ExternalProcess(Data data) {
        this.data = data;
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello from MyCommandLineRunner! This is external Process!!");
        System.out.println(data.getData());
    }
}
