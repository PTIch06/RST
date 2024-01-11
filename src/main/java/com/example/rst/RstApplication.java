package com.example.rst;

import com.example.rst.app.display.ScreenOverlayCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class RstApplication {

	public static void main(String[] args) {
		SpringApplication.run(RstApplication.class, args);
		System.setProperty("java.awt.headless", "false");
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				System.out.println("Headless mode: " + GraphicsEnvironment.isHeadless());
				ScreenOverlayCreator overlay = new ScreenOverlayCreator();
				JFrame frame = overlay.createFrame();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}
