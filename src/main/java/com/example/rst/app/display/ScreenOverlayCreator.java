package com.example.rst.app.display;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ScreenOverlayCreator {
    public JFrame createFrame() {
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Прозрачный оверлей"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
