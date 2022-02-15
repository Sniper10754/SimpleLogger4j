package me.sniper10754.simplelogger4j;

import me.sniper10754.simplelogger4j.logger.SimpleLogger;

import java.util.Hashtable;
import java.util.Map;

public class LoggerFactory {
    private static final Map<Class<?>, Logger> instances = new Hashtable<>();
    
    public static Logger getLogger(Class<?> clazz) {
        return instances.computeIfAbsent(clazz, k -> new SimpleLogger(clazz));
    }
    
    private LoggerFactory() {}
}
