import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.listeners.ConsoleListener;
import me.sniper10754.simplelogger4j.logger.SimpleLogger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTest {
    protected Logger logger;
    
    
    
    @BeforeEach
    void beforeEach() {
        logger = new SimpleLogger("Tests");
        
        logger.addListener(new ConsoleListener());
    }
    
    @AfterEach
    void afterEach() {
        logger = null;
    }
}