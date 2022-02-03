package me.sniper10754.simplelogger4j.tests;

import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.utils.PrintStreamLogger;
import org.junit.jupiter.api.Test;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UncheckedIOException;

public class LoggerTest extends AbstractTest {
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
        logger.setFormatter(LogEvent::getMessage);
    
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
