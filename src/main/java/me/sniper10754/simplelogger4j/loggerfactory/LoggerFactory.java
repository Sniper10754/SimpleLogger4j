package me.sniper10754.simplelogger4j.loggerfactory;

import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.logger.SimpleClassBoundLogger;

import java.util.Hashtable;
import java.util.Map;

/**
 * The type Logger factory.
 */
public class LoggerFactory {
    private static final Map<Class<?>, Logger> instances = new Hashtable<>();
    
    /**
     * Gets logger.
     *
     * @param clazz the clazz
     * @return the logger
     */
    public static <T> Logger getLogger(Class<T> clazz) {
        return instances.computeIfAbsent(clazz, k -> new SimpleClassBoundLogger<>(clazz));
    }
    
    private LoggerFactory() {}
}
