package com.example.rst.app.collector.factory;

import com.example.rst.app.collector.PngScreenDataCollector;
import com.example.rst.app.collector.ScreenDataCollector;
import org.springframework.stereotype.Component;

@Component
public class PngScreenDataCollectorFactory implements ScreenDataCollectorFactory{

    @Override
    public ScreenDataCollector createScreenDataCollector() {
        return new PngScreenDataCollector();
    }
}
