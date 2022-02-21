package me.sniper10754.simplelogger4j;

/**
 * The interface Class bound logger.
 */
public interface ClassBoundLogger<T> extends Logger {
    /**
     * Gets bound class.
     *
     * @return the bound class
     */
    Class<T> getBoundClass();
}
