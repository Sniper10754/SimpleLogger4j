package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.ClassBoundLogger;
import me.sniper10754.simplelogger4j.EventListener;
import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.formatter.ClassicFormatter;

import java.util.LinkedList;
import java.util.List;

/**
 * The type Abstract logger.
 * <p>
 * Provides some implementation for {@link Logger}
 */
public abstract class AbstractClassBoundLogger<T> extends AbstractLogger implements ClassBoundLogger<T> {
    private final List<EventListener> listeners = new LinkedList<>();
    private final Formatter formatter;
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
    public Class<T> getBoundClass() {
        return boundClass;
    }
    
    @Override
    public String getLoggerName() {
        return boundClass.getName();
    }
}
