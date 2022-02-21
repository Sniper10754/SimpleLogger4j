package me.sniper10754.simplelogger4j.tests;

import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.logger.AnonymousLogger;
import org.junit.jupiter.api.Test;

public class AnonymousLoggerTest {
    protected Logger logger = AnonymousLogger.getInstance();
    
    @Test
    public void anonymousLogger() {
        logger.info("Test!");
    }
}
