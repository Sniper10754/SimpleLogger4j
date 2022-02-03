package me.sniper10754.simplelogger4j;

/**
 * The log Level.
 */
public enum Level implements Comparable<Level> {
    /**
     * Info level.
     */
    INFO(0),
    /**
     * Warning level.
     */
    WARNING(2),
    /**
     * Severe level.
     */
    SEVERE(3),
    /**
     * Config level.
     */
    CONFIG(1),
    /**
     * Fine level.
     */
    FINE(1),
    /**
     * Finer level.
     */
    FINER(1),
    /**
     * Finest level.
     */
    FINEST(1),
    /**
     * All level.
     */
    ALL(1);
    
    private int priority;
    
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
}
