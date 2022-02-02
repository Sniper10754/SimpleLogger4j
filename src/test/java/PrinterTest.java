import me.sniper10754.simplelogger4j.utils.Printer;
import me.sniper10754.simplelogger4j.utils.PrintStreamLogger;
import me.sniper10754.simplelogger4j.utils.PrintWriterLogger;
import org.junit.jupiter.api.Test;

public class PrinterTest extends AbstractTest {
    
    @Test
    void loggerPrintStreamTest() {
        Printer loggerStream = new PrintStreamLogger(logger);
        
        loggerStream.print("Test!");
        loggerStream.println("Test 2!");
    }
    
    @Test
    void loggerPrintWriterTest() {
        Printer writerStream = new PrintWriterLogger(logger);
        
        writerStream.print("Test!");
        writerStream.println("Test 2!");
    }
}
