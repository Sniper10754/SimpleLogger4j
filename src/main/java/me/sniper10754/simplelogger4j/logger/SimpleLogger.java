package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The type Simple logger.
 * <p>
 * A simple implementation for {@link AbstractLogger}
 */
public class SimpleLogger extends AbstractLogger {
    
    /**
     * Instantiates a new Simple logger.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    public SimpleLogger() throws ClassNotFoundException {
        super();
    }
    
    public SimpleLogger(Class<?> boundClass) {
        super(boundClass);
    }
    
    @Override
    public String getLoggerName() {
        return this.boundClass.getSimpleName();
    }
    
    @Override
    public void log(LogEvent event) {
        getListeners().forEach(listener -> listener.log(event));
    }
}
