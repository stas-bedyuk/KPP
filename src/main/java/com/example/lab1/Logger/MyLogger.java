package com.example.lab1.Logger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
    private static final Logger logger = LogManager.getLogger(MyLogger.class);

    public static void Log(Level level, Object message) {
        logger.log(level, message);
    }

}
