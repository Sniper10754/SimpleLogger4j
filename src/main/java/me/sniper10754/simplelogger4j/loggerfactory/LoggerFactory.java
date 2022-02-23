package me.sniper10754.simplelogger4j.loggerfactory;

import me.sniper10754.simplelogger4j.Logger;

import java.util.Hashtable;
import java.util.Map;

/**
 * The type Logger factory.
 */
public class LoggerFactory {
    private static final Map<Class<?>, Logger> instances = new Hashtable<>();
    private static LoggerCreator creator = new DefaultLoggerCreator();
    
    /**
     * Gets creator.
     *
     * @return the creator
     */
    public static LoggerCreator getCreator() {
        return creator;
    }
    
    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public static void setCreator(LoggerCreator creator) {
        LoggerFactory.creator = creator;
    }
    
    /**
     * Gets logger.
     *
     * @param <T>   the type parameter
     * @param clazz the clazz
     * @return the logger
     */
    public static <T> Logger getLogger(Class<T> clazz) {
        return creator.getLogger(clazz);
    }
    
    /**
     * Gets logger.
     *
     * @param name the name
     * @return the logger
     */
    public static Logger getLogger(String name) {
        return creator.getLogger(name);
    }
    
    
    /**
     * The interface Logger creator.
     */
    public interface LoggerCreator {
        /**
         * Gets logger.
         *
         * @param clazz the clazz
         * @return the logger
         */
        <T> Logger getLogger(Class<T> clazz);
        
        
        /**
         * Gets logger.
         *
         * @param name the name
         * @return the logger
         */
        Logger getLogger(String name);
    }
    
    private LoggerFactory() {}
}
