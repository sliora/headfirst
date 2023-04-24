package com.example.headfirst;

import com.example.headfirst.observer.CheckDesktop;
import com.example.headfirst.observer.CheckLaptop;
import com.example.headfirst.observer.ScanForRansomware;
import com.example.headfirst.singleton.FirstPage;
import com.example.headfirst.singleton.SecondPage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HeadfirstApplication {

    public static void main(String[] args){
        SpringApplication.run(HeadfirstApplication.class, args);
    }
}
