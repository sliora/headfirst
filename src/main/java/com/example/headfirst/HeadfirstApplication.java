package com.example.headfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HeadfirstApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(HeadfirstApplication.class, args);

        ScanForRansomware scanForRansomware = new ScanForRansomware();
        scanForRansomware.registerObserver(new CheckDesktop());
        scanForRansomware.registerObserver(new CheckLaptop());

        scanForRansomware.isRansomwareFile();
    }

}
