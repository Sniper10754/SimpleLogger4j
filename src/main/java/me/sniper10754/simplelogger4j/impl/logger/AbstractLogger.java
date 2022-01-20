package me.sniper10754.simplelogger4j.impl.logger;

import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.impl.formatter.ClassicFormatter;
import me.sniper10754.simplelogger4j.Logger;

/**
 * The type Abstract logger.
 *
 * Provides some implementation for {@link Logger}
 */
public abstract class AbstractLogger implements Logger {
    private Formatter formatter;
    
    /**
     * Instantiates a new Abstract logger.
     */
    public AbstractLogger() {
        this(new ClassicFormatter());
    }
    
    /**
     * Instantiates a new Abstract logger.
     *
     * @param formatter the formatter
     */
    public AbstractLogger(Formatter formatter) {
        this.formatter = formatter;
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
    public void log(Level level, String message) {
        log(new LogEvent(message, level, null, this));
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
    public void info(String message) {
        log(Level.INFO, message);
    }
    
    @Override
    public void warning(String message) {
        log(Level.WARNING, message);
    }
    
    @Override
    public void severe(String message) {
        log(Level.SEVERE, message);
    }
    
    @Override
    public void config(String message) {
        log(Level.CONFIG, message);
    }
    
    @Override
    public void fine(String message) {
        log(Level.FINE, message);
    }
    
    @Override
    public void finer(String message) {
        log(Level.FINER, message);
    }
    
    @Override
    public void finest(String message) {
        log(Level.FINEST, message);
    }
    
    @Override
    public void all(String message) {
        log(Level.ALL, message);
    }
    
    @Override
    public String getLoggerName() {
        return getClass().getSimpleName();
    }
}
