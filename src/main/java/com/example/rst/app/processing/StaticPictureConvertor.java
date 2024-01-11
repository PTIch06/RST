package com.example.rst.app.processing;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.*;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class StaticPictureConvertor implements PictureConverter {

    private static final String testData = "src\\main\\resources\\tessdata";
    private static final String language = "eng";

    @Override
    public String getTextFromPicture(File picture) {
        ITesseract instance = new Tesseract();
        instance.setDatapath(testData);
        instance.setLanguage(language);

        StringBuilder result = new StringBuilder();

        try {
            BufferedImage image = ImageIO.read(picture);
            List<Word> words = instance.getWords(image, ITessAPI.TessPageIteratorLevel.RIL_WORD);
            for (Word word : words) {
                Rectangle rect = word.getBoundingBox();
                result.append(String.format("%s [x: %d, y: %d, w: %d, h: %d]\n",
                        word.getText(), rect.x, rect.y, rect.width, rect.height));
            }
        } catch(IOException e){
            log.error("Error when convertng file", e);
            e.printStackTrace();
        }

        return result.toString();
    }
}

