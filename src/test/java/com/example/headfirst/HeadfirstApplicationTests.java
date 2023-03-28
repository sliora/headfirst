package com.example.headfirst;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class HeadfirstApplicationTests {

    @Test
    void ransomwareCheck() throws IOException, InterruptedException {
        ScanForRansomware scanForRansomware = new ScanForRansomware();
        scanForRansomware.registerObserver(new CheckDesktop());
        scanForRansomware.registerObserver(new CheckLaptop());

        scanForRansomware.isRansomwareFile();
    }

}
