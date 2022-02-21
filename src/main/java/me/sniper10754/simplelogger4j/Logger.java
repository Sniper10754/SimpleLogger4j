package me.sniper10754.simplelogger4j;

import me.sniper10754.simplelogger4j.event.LogEvent;

import java.util.List;

/**
 * The Logger interface.
 */
public interface Logger {
    /**
     * Log.
     * <p>
     * this method shouldn't worry about log level
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
    void info(String message, boolean newline);
    
    /**
     * Warning.
     *
     * @param message the message
     * @param newline the newline
     */
    void warning(String message, boolean newline);
    
    /**
     * Severe.
     *
     * @param message the message
     * @param newline the newline
     */
    void severe(String message, boolean newline);
    
    /**
     * Config.
     *
     * @param message the message
     * @param newline the newline
     */
    void config(String message, boolean newline);
    
    /**
     * Fine.
     *
     * @param message the message
     * @param newline the newline
     */
    void fine(String message, boolean newline);
    
    /**
     * Finer.
     *
     * @param message the message
     * @param newline the newline
     */
    void finer(String message, boolean newline);
    
    /**
     * Finest.
     *
     * @param message the message
     * @param newline the newline
     */
    void finest(String message, boolean newline);
    
    /**
     * All.
     *
     * @param message the message
     * @param newline the newline
     */
    void all(String message, boolean newline);
    
    /**
     * Log.
     *
     * @param level   the level
     * @param message the message
     * @param newline the newline
     */
    void log(Level level, String message, boolean newline);
    
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
    
    
    /**
     * Gets listeners.
     *
     * @return the listeners
     */
    List<EventListener> getListeners();
}
