import me.sniper10754.simplelogger4j.EventListener;
import me.sniper10754.simplelogger4j.listeners.FileListener;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class LIstenerTest extends AbstractTest {
    @Test
    void fileListenerTest() throws FileNotFoundException {
        EventListener listener = new FileListener("test.txt");
        
        logger.addListener(listener);
        
        logger.info("Hi! how are you?");
    }
}
