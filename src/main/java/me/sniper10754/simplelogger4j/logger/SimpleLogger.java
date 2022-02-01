package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The type Simple logger.
 *
 * A simple implementation for {@link EventLogger}
 */
public class SimpleLogger extends EventLogger {
    /**
     * Log.
     *
     * @param event the event
     */
    private String name;
    
    /**
     * Instantiates a new Named logger.
     *
     * @param name the name
     */
    public SimpleLogger(String name) {
        this.name = name;
    }
    
    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getLoggerName() {
        return name;
    }
    
    @Override
    public void log(LogEvent event) {
        getListeners().forEach(listener -> listener.log(event));
    }
}
