package com.example.rst.app.collector.factory;

import com.example.rst.app.collector.JpgScreenDataCollector;
import com.example.rst.app.collector.ScreenDataCollector;
import org.springframework.stereotype.Component;

@Component
public class JpgScreenDataCollectorFactory implements ScreenDataCollectorFactory{

    @Override
    public ScreenDataCollector createScreenDataCollector() {
        return new JpgScreenDataCollector();
    }
}
