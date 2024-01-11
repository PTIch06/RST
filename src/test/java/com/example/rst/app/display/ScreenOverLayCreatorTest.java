package com.example.rst.app.display;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ScreenOverLayCreatorTest {
    @Autowired
    ScreenOverlayCreator screenOverlayCreator;

    @Test
    public void createFrameCreatesFrameTest() {
        JFrame actual = screenOverlayCreator.createFrame();

        assertNotNull(actual);
    }
}
