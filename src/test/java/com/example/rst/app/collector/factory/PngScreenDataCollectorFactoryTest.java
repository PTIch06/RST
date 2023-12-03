package com.example.rst.app.collector.factory;

import com.example.rst.app.collector.PngScreenDataCollector;
import com.example.rst.app.collector.ScreenDataCollector;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PngScreenDataCollectorFactoryTest {
    @Autowired
    PngScreenDataCollectorFactory pngScreenDataCollectorFactory;

    @Test
    public void JpgScreenDataCollectorFactoryCreatesCorrectObject(){
        ScreenDataCollector actual = pngScreenDataCollectorFactory.createScreenDataCollector();
        assertTrue(actual instanceof PngScreenDataCollector);
    }
}
