package com.example.external.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Data {
    @Value("${data.value}")
    private String data;

    public String getData() {
        return data;
    }
}
