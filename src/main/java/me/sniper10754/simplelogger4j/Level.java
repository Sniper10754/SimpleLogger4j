package me.sniper10754.simplelogger4j;

import java.util.Comparator;

/**
 * The log Level.
 */
public enum Level {
    /**
     * Info level.
     */
    Info(0),
    /**
     * Warning Level.
     */
    Warning(2),
    /**
     * Severe Level.
     */
    Severe(3),
    /**
     * Config Level.
     */
    Config(1),
    /**
     * Fine Level.
     */
    Fine(1),
    /**
     * Finer Level.
     */
    Finer(1),
    /**
     * Finest Level.
     */
    Finest(1),
    /**
     * All Level.
     */
    All(4);
    
    private final int priority;
    
    Level(int priority) {
        this.priority = priority;
    }
    
    /**
     * Gets priority.
     *
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }
    
    public static int compare(Level l1, Level l2) {
        return Integer.compare(l1.priority, l2.priority);
    }
}
