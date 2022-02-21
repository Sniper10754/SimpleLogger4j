package me.sniper10754.simplelogger4j.tests;

import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.formatter.ColoredFormatter;
import me.sniper10754.simplelogger4j.listeners.ConsoleListener;
import me.sniper10754.simplelogger4j.loggerfactory.LoggerFactory;
import me.sniper10754.simplelogger4j.utils.PrintStreamLogger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class LoggerTest {
    protected Logger logger;
    
    @BeforeEach
    void beforeEach() {
        logger = LoggerFactory.getLogger(getClass());
        
        logger.addListener(new ConsoleListener(ConsoleListener.Kind.OUT));
    }
    
    @AfterEach
    void afterEach() {
        logger = null;
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
        logger.setFormatter(new ColoredFormatter());
    
        logger.info("Test!");
    }
    
    @Test
    void controlSystemOut() {
        PrintStreamLogger psLogger = new PrintStreamLogger(logger);
        
        System.setOut(psLogger);
    
        System.out.println("Hi!");
        
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
}
