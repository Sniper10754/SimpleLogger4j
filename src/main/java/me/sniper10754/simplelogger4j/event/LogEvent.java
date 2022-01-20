package me.sniper10754.simplelogger4j.event;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;

/**
 * The type Log event.
 */
public class LogEvent {
    private String message;
    private Level level;
    private Throwable throwable;
    private Logger logger;
    
    /**
     * Instantiates a new Log event.
     *
     * @param message   the message
     * @param level     the level
     * @param throwable the throwable
     * @param logger    the logger
     */
    public LogEvent(String message, Level level, Throwable throwable, Logger logger) {
        this.message = message;
        this.level = level;
        this.throwable = throwable;
        this.logger = logger;
    }
    
    /**
     * Gets throwable.
     *
     * @return the throwable
     */
    public Throwable getThrowable() {
        return throwable;
    }
    
    /**
     * Sets throwable.
     *
     * @param throwable the throwable
     */
    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
    
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Gets level.
     *
     * @return the level
     */
    public Level getLevel() {
        return level;
    }
    
    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(Level level) {
        this.level = level;
    }
    
    /**
     * Gets logger.
     *
     * @return the logger
     */
    public Logger getLogger() {
        return logger;
    }
    
    /**
     * Sets logger.
     *
     * @param logger the logger
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    
    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return getLogger().getFormatter().format(this);
    }
}
