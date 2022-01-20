import me.sniper10754.simplelogger4j.impl.listeners.ConsoleListener;
import me.sniper10754.simplelogger4j.impl.logger.EventLogger;
import me.sniper10754.simplelogger4j.impl.logger.SimpleLogger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerTest {
    private EventLogger logger;
    
    class IceCreamException extends Exception {
        public IceCreamException() {
            super();
        }
    
        public IceCreamException(String message) {
            super(message);
        }
    
        public IceCreamException(String message, Throwable cause) {
            super(message, cause);
        }
    
        public IceCreamException(Throwable cause) {
            super(cause);
        }
    }
    
    @BeforeEach
    public void beforeEach() {
        logger = new SimpleLogger("Tests");
    
        logger.addListener(new ConsoleListener());
    }
    
    @AfterEach
    public void afterEach() {
        logger = null;
    }
    
    @Test
    public void anonymousLoggerTest() {
        logger.info("Test message :)");
        logger.warning("Your ice-cream is melting :(");
        logger.severe("Your ice-cream melted :(");
        
        logger.thrown(new IceCreamException("Oh no your ice-cream melted on your hands!"));
    }
    
    @Test
    public void onSomeFailureOperation() {
        logger.info("Doing some operations...");
        
        try {
            int result;
            
            logger.info("Trying to divide 4 with 2...");
            result = 4 / 2;
            logger.info("Done! result: " + result);
            
            logger.info("Trying to divide 2 with 0...");
            result = 2 / 0;
            logger.info("Done! result: " + result + " wait why this statement did get executed?");
            
        } catch (ArithmeticException e) {
            logger.thrown("Oh no", e);
        }
    }
}
