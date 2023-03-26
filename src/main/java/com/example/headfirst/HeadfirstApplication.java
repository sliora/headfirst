package com.example.headfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HeadfirstApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(HeadfirstApplication.class, args);

        ScanForRansomware scanForRansomware = new ScanForRansomware();
        scanForRansomware.registerObserver(new CheckComputers("김영회 랩탑"));
        scanForRansomware.registerObserver(new CheckComputers("김영회 맥북"));
        scanForRansomware.registerObserver(new CheckComputers("김영회 노트북"));

        scanForRansomware.isRansomwareFile();
    }

}
