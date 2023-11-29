package com.example.rst.app.processing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

@SpringBootTest
public class JpgPictureConvertorTest {
    @Autowired
    JpgPictureConvertor jpgPictureConvertor;
    @Test
    public void ReturnTrueIfGetSomeTextFromPicture() {
        File picture = new File("src/test/resources/testpictures/NewsPage.jpg");
        String actual = jpgPictureConvertor.getTextFromPicture(picture);

        System.out.println(actual);
        assertNotNull(actual);
    }

    @Test
    public void ReturnTrueIfFindSomePhrasesFromPicture() {
        File picture = new File("src/test/resources/testpictures/NewsPage.jpg");
        String actual = jpgPictureConvertor.getTextFromPicture(picture);

        System.out.println(actual);
        assertTrue(actual.contains("Choose products confidently with reviews and real-world testing"));
        assertTrue(actual.contains("Unwind with Spelling Bee, Wordle, The Crossword and more"));
        assertTrue(actual.contains("Follow in-depth, personalized coverage of your favorite sports"));
    }
}
