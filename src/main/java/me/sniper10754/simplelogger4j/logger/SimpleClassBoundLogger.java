package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The type Simple logger.
 * <p>
 * A simple implementation for {@link AbstractClassBoundLogger}
 */
public class SimpleClassBoundLogger<T> extends AbstractClassBoundLogger<T> {
    
    public SimpleClassBoundLogger(Class<T> boundClass) {
        super(boundClass);
    }
    
    @Override
    public void log(LogEvent event) {
        getListeners().forEach(listener -> listener.log(event));
    }
}
