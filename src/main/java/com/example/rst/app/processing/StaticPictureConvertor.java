package com.example.rst.app.processing;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.File;

@Slf4j
@Service
public class StaticPictureConvertor implements PictureConverter {

    private static final String testData = "src\\main\\resources\\tessdata";
    private static final String language = "eng";

    @Override
    public String getTextFromPicture(File picture) {
        ITesseract instance = new Tesseract();
        String result = null;

        try {
            instance.setDatapath(testData);
            instance.setLanguage(language);

            result = instance.doOCR(picture);
        } catch (TesseractException e){
            log.error("Error when extraction text from picture", e);
            e.printStackTrace();
        }
        return result;
    }
}
