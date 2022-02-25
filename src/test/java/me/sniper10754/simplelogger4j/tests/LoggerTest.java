package me.sniper10754.simplelogger4j.tests;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.formatter.ClassicFormatter;
import me.sniper10754.simplelogger4j.loggerfactory.LoggerFactory;
import me.sniper10754.simplelogger4j.utils.PrintStreamLogger;
import org.junit.jupiter.api.Test;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class LoggerTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    
    public LoggerTest() {
        logger.setLogLevel(Level.Info);
    }
    
    @Test
    void simpleLogger() {
        logger.info("Hello!");
    }
    
    @Test
    void ohNoAnExeption() {
        Exception exception = new IceCreamException("Your ice cream melted");
        
        logger.thrown(exception);
    }
    
    @Test
    void modifyFormatter() {
        logger.setFormatter(new ClassicFormatter());
        
        logger.info("Test!", true);
    }
}
