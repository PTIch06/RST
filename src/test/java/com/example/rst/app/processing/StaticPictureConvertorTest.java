package com.example.rst.app.processing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

@SpringBootTest
public class StaticPictureConvertorTest {
    @Autowired
    StaticPictureConvertor staticPictureConvertor;
    @Test
    public void ReturnTrueIfGetSomeTextFromJpgPicture() {
        File picture = new File("src/test/resources/testpictures/NewsPage.jpg");
        String actual = staticPictureConvertor.getTextFromPicture(picture);

        assertNotNull(actual);
    }

    @Test
    public void ReturnTrueIfFindSomePhrasesFromJpgPicture() {
        File picture = new File("src/test/resources/testpictures/NewsPage.jpg");
        String actual = staticPictureConvertor.getTextFromPicture(picture);

        assertTrue(actual.contains("Subscribers"));
        assertTrue(actual.contains("enjoy"));
        assertTrue(actual.contains("more"));
        assertTrue(actual.contains("with"));
        assertTrue(actual.contains("New"));
        assertTrue(actual.contains("York"));
        assertTrue(actual.contains("Times"));
        assertTrue(actual.contains("All"));
        assertTrue(actual.contains("Access."));
    }

    @Test
    public void ReturnTrueIfGetSomeTextFromPngPicture() {
        File picture = new File("src/test/resources/testpictures/NewsPage2.png");
        String actual = staticPictureConvertor.getTextFromPicture(picture);

        assertNotNull(actual);
    }

    @Test
    public void ReturnTrueIfFindSomePhrasesFromPngPicture() {
        File picture = new File("src/test/resources/testpictures/NewsPage2.png");
        String actual = staticPictureConvertor.getTextFromPicture(picture);

        assertTrue(actual.contains("Subscribers"));
        assertTrue(actual.contains("enjoy"));
        assertTrue(actual.contains("more"));
        assertTrue(actual.contains("with"));
        assertTrue(actual.contains("New"));
        assertTrue(actual.contains("York"));
        assertTrue(actual.contains("Times"));
        assertTrue(actual.contains("All"));
        assertTrue(actual.contains("Access."));
    }
}

