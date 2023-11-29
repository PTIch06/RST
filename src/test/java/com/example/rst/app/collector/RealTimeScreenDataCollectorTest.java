package com.example.rst.app.collector;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

@SpringBootTest
public class RealTimeScreenDataCollectorTest {
    @Autowired
    RealTimeScreenDataCollector realTimeScreenDataCollector;
    @Test
    public void saveScreenTest(){
        realTimeScreenDataCollector.saveScreen();

        String path = "src/main/resources/ImmageStorage";
        String fileName = "Screen-1.png";

        File expactedFile = new File("src/main/resources/ImmageStorage", "Screen-1.png");
        assertTrue(expactedFile.exists());
    }
}
