package com.example.java_web_ss11_b3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class HospitalConfig {
    @Value("${hospital.name}")
    private String hospitalName;
    @Value("${hospital.hotline}")
    @PostConstruct
    public void init() {
        System.out.println("Chào mừng đến với " + hospitalName);
        System.out.println("Hotline: " + hospitalHotline);
    }
}
