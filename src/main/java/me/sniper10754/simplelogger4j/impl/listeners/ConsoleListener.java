package me.sniper10754.simplelogger4j.impl.listeners;

/**
 * The type Console listener.
 *
 * Prints the event to {@code System.out}
 */
public class ConsoleListener extends StreamListener {
    /**
     * Instantiates a new Console listener.
     */
    public ConsoleListener() {
        super(System.out);
    }
}
