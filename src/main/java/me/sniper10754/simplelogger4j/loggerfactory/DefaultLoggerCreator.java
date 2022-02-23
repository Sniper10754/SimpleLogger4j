package me.sniper10754.simplelogger4j.loggerfactory;

import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.formatter.ColoredFormatter;
import me.sniper10754.simplelogger4j.listeners.ConsoleListener;
import me.sniper10754.simplelogger4j.logger.NamedLogger;
import me.sniper10754.simplelogger4j.logger.SimpleClassBoundLogger;
import me.sniper10754.simplelogger4j.logger.SynchronizedLogger;

public class DefaultLoggerCreator implements LoggerFactory.LoggerCreator {
    private Logger setupLogger(Logger logger) {
        logger.setFormatter(new ColoredFormatter());
        logger.addListener(new ConsoleListener());
        
        return new SynchronizedLogger(logger);
    }
    
    @Override
    public <T> Logger getLogger(Class<T> clazz) {
        return setupLogger(new SimpleClassBoundLogger<>(clazz));
    }
    
    @Override
    public Logger getLogger(String name) {
        return setupLogger(new NamedLogger(name));
    }
}
