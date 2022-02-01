import org.junit.jupiter.api.Test;

public class LoggerTest extends AbstractTest {

    @Test
    void anonymousLoggerTest() {
        logger.info("Test message :)");
        logger.warning("Your ice-cream is melting :(");
        logger.severe("Your ice-cream melted :(");
        
        logger.thrown(new IceCreamException("Oh no your ice-cream melted on your hands!"));
    }
    
    @Test
    void onSomeFailureOperation() {
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
