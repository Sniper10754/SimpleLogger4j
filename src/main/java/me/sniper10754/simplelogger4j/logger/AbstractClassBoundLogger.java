package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.*;
import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.formatter.ClassicFormatter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The type Abstract logger.
 * <p>
 * Provides some implementation for {@link Logger}
 */
public abstract class AbstractClassBoundLogger<T> extends AbstractLogger implements ClassBoundLogger<T> {
    private final List<EventListener> listeners = new LinkedList<>();
    private Formatter formatter;
    protected Class<T> boundClass;
    
    /**
     * Instantiates a new Abstract logger.
     *
     * @param boundClass the bound class
     */
    public AbstractClassBoundLogger(Class<T> boundClass) {
        this(new ClassicFormatter(), boundClass);
    }
    
    /**
     * Instantiates a new Abstract logger.
     *
     * @param formatter  the formatter
     * @param boundClass the bound class
     */
    public AbstractClassBoundLogger(Formatter formatter, Class<T> boundClass) {
        this.formatter = formatter;
        this.boundClass = boundClass;
    }
    
    @Override
    public void info(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.INFO, message);
    }
    
    /**
     * Warning.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void warning(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.WARNING, message);
    }
    
    /**
     * Severe.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void severe(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.SEVERE, message);
    }
    
    /**
     * Config.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void config(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.CONFIG, message);
    }
    
    /**
     * Fine.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void fine(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.FINE, message);
    }
    
    /**
     * Finer.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void finer(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.FINER, message);
    }
    
    /**
     * Finest.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void finest(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.FINEST, message);
    }
    
    /**
     * All.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void all(String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(Level.ALL, message);
    }
    
    /**
     * Log.
     *
     * @param level   the level
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void log(Level level, String message, boolean newline) {
        if (newline) message = message + "\n";
        
        log(new LogEvent(message, level, null, this));
    }
    
    /**
     * Gets formatter.
     *
     * @return the formatter
     */
    public Formatter getFormatter() {
        return formatter;
    }
    
    /**
     * Sets formatter.
     *
     * @param formatter the formatter
     */
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }
    
    @Override
    public Class<T> getBoundClass() {
        return boundClass;
    }
    
    @Override
    public void thrown(Throwable e) {
        thrown("Exception/Error occurred", e);
    }
    
    @Override
    public void thrown(String prefix, Throwable e) {
        log(new LogEvent(prefix, Level.SEVERE, e, this));
    }
    
    @Override
    public String getLoggerName() {
        return getClass().getSimpleName();
    }
}
