package me.sniper10754.simplelogger4j;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The Logger interface.
 */
public interface Logger {
    /**
     * Log.
     *
     * @param event the event
     */
    void log(LogEvent event);
    
    /**
     * Log.
     *
     * @param level   the level
     * @param message the message
     */
    void log(Level level, String message);
    
    /**
     * Thrown.
     *
     * @param e the e
     */
    void thrown(Throwable e);
    
    
    /**
     * Thrown.
     *
     * @param prefix the prefix
     * @param e      the throwable
     */
    void thrown(String prefix, Throwable e);
    
    /**
     * Info.
     *
     * @param message the message
     */
    void info(String message);
    
    /**
     * Warning.
     *
     * @param message the message
     */
    void warning(String message);
    
    /**
     * Severe.
     *
     * @param message the message
     */
    void severe(String message);
    
    /**
     * Config.
     *
     * @param message the message
     */
    void config(String message);
    
    /**
     * Fine.
     *
     * @param message the message
     */
    void fine(String message);
    
    /**
     * Finer.
     *
     * @param message the message
     */
    void finer(String message);
    
    /**
     * Finest.
     *
     * @param message the message
     */
    void finest(String message);
    
    /**
     * All.
     *
     * @param message the message
     */
    void all(String message);
    
    /**
     * Gets formatter.
     *
     * @return the formatter
     */
    Formatter getFormatter();
    
    /**
     * Gets logger name.
     *
     * @return the logger name
     */
    String getLoggerName();
}
