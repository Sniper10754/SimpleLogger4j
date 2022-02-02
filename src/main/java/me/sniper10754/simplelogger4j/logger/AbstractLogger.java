package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.formatter.ClassicFormatter;
import me.sniper10754.simplelogger4j.Logger;

/**
 * The type Abstract logger.
 * <p>
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
