import me.sniper10754.simplelogger4j.logger.adapters.PrintAdapter;
import me.sniper10754.simplelogger4j.logger.adapters.PrintStreamAdapter;
import me.sniper10754.simplelogger4j.logger.adapters.PrintWriterAdapter;
import org.junit.jupiter.api.Test;

public class PrintAdapterTest extends AbstractTest {
    
    @Test
    void loggerPrintStreamTest() {
        PrintAdapter loggerStream = new PrintStreamAdapter(logger);
        
        loggerStream.print("Test!");
        loggerStream.println("Test 2!");
    }
    
    @Test
    void loggerPrintWriterTest() {
        PrintAdapter writerStream = new PrintWriterAdapter(logger);
        
        writerStream.print("Test!");
        writerStream.println("Test 2!");
    }
}
