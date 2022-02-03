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
    default void log(Level level, String message) {
        log(new LogEvent(message, level, null, this));
    }
    
    
    /**
     * Thrown.
     *
     * @param e the e
     */
    default void thrown(Throwable e) {
        thrown("Exception/Error occurred", e);
    }
    
    
    /**
     * Thrown.
     *
     * @param prefix the prefix
     * @param e      the e
     */
    default void thrown(String prefix, Throwable e) {
        log(new LogEvent(prefix, Level.SEVERE, e, this));
    }
    
    
    /**
     * Info.
     *
     * @param message the message
     */
    default void info(String message) {
        info(message, true);
    }
    
    
    /**
     * Warning.
     *
     * @param message the message
     */
    default void warning(String message) {
        warning(message, true);
    }
    
    
    /**
     * Severe.
     *
     * @param message the message
     */
    default void severe(String message) {
        severe(message, true);
    }
    
    
    /**
     * Config.
     *
     * @param message the message
     */
    default void config(String message) {
        config(message, true);
    }
    
    
    /**
     * Fine.
     *
     * @param message the message
     */
    default void fine(String message) {
        fine(message, true);
    }
    
    
    /**
     * Finer.
     *
     * @param message the message
     */
    default void finer(String message) {
        finer(message, true);
    }
    
    
    /**
     * Finest.
     *
     * @param message the message
     */
    default void finest(String message) {
        finest(message, true);
    }
    
    
    /**
     * All.
     *
     * @param message the message
     */
    default void all(String message) {
        all(message, true);
    }
    
    /**
     * Info.
     *
     * @param message the message
     * @param newline the newline
     */
    default void info(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.INFO, message);
    }
    
    /**
     * Warning.
     *
     * @param message the message
     * @param newline the newline
     */
    default void warning(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.WARNING, message);
    }
    
    /**
     * Severe.
     *
     * @param message the message
     * @param newline the newline
     */
    default void severe(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.SEVERE, message);
    }
    
    /**
     * Config.
     *
     * @param message the message
     * @param newline the newline
     */
    default void config(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.CONFIG, message);
    }
    
    /**
     * Fine.
     *
     * @param message the message
     * @param newline the newline
     */
    default void fine(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.FINE, message);
    }
    
    /**
     * Finer.
     *
     * @param message the message
     * @param newline the newline
     */
    default void finer(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.FINER, message);
    }
    
    /**
     * Finest.
     *
     * @param message the message
     * @param newline the newline
     */
    default void finest(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.FINEST, message);
    }
    
    /**
     * All.
     *
     * @param message the message
     * @param newline the newline
     */
    default void all(String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(Level.ALL, message);
    }
    
    /**
     * Log.
     *
     * @param level   the level
     * @param message the message
     * @param newline the newline
     */
    default void log(Level level, String message, boolean newline) {
        if (newline)
            message = message + "\n";
        
        log(new LogEvent(message, level, null, this));
    }
    
    /**
     * Gets formatter.
     *
     * @return the formatter
     */
    Formatter getFormatter();
    
    /**
     * Sets formatter.
     *
     * @param formatter the formatter
     */
    void setFormatter(Formatter formatter);
    
    /**
     * Gets logger name.
     *
     * @return the logger name
     */
    String getLoggerName();
    
    /**
     * Add a event listener.
     *
     * @param listener the listener
     */
    void addListener(EventListener listener);
    
    /**
     * Remove a event listener.
     *
     * @param listener the listener
     * @return the boolean
     */
    boolean removeListener(EventListener listener);
}
