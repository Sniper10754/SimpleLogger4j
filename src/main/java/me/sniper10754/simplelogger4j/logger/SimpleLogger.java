package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The type Simple logger.
 * <p>
 * A simple implementation for {@link AbstractLogger}
 */
public class SimpleLogger extends AbstractLogger {
    
    /**
     * Gets caller class name.
     *
     * @return the caller class name
     * @throws ClassNotFoundException the class not found exception
     */
    public static Class<?> getCallerClassName() throws ClassNotFoundException {
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        
        return Class.forName(stElements[2].getClassName());
    }
    
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
