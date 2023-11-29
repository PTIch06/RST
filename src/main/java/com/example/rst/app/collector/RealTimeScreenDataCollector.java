package com.example.rst.app.collector;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Slf4j
@Service
public class RealTimeScreenDataCollector {

    public void saveScreen(){
        String pathToStorage = "src/main/resources/ImmageStorage";

        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenImage = robot.createScreenCapture(screenRect);
            int imageCounter = 1;

            File generatedFile = new File(pathToStorage, ("Screen-" + imageCounter++ + ".png"));

            ImageIO.write(screenImage, "png", generatedFile);
        } catch(AWTException e){
            log.error("Error when extraction text from picture", e);
            e.printStackTrace();
        } catch (IOException e){
            log.error("Error during saving text from picture", e);
            e.printStackTrace();
        }
    }
}
