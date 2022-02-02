package me.sniper10754.simplelogger4j.tests;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.utils.PrintStreamLogger;
import me.sniper10754.simplelogger4j.utils.PrintWriterLogger;
import org.junit.jupiter.api.Test;

public class PrinterTest extends AbstractTest {
    
    @Test
    void loggerPrintStreamTest() {
        PrintStreamLogger loggerStream = new PrintStreamLogger(logger);
        
        loggerStream.setLogLevel(Level.INFO);
    
        loggerStream.println("Test 2!");
        loggerStream.print("Test!");
        loggerStream.println();
    }
    
    @Test
    void loggerPrintWriterTest() {
        PrintWriterLogger loggerWriter = new PrintWriterLogger(logger);
        
        loggerWriter.setLogLevel(Level.INFO);
    
        loggerWriter.println("Test 2!");
        loggerWriter.print("Test!");
        loggerWriter.println();
    }
}
