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
    }
    
    @Test
    void loggerPrintWriterTest() {
        PrintWriterLogger writerStream = new PrintWriterLogger(logger);
        
        writerStream.setLogLevel(Level.INFO);
    
        writerStream.println("Test 2!");
        writerStream.print("Test!");
    }
}
