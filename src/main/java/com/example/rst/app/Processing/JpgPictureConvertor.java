package com.example.rst.app.Processing;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

// TODO: put in the factory
@Slf4j
public class JpgPictureConvertor implements PictureConverter {

    private static final String testData = "";
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
        }
        return result;
    }
}
