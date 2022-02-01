package me.sniper10754.simplelogger4j.listeners;

import me.sniper10754.simplelogger4j.event.LogEvent;

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
    
    @Override
    public void log(LogEvent event) {
        super.log(event);
    }
}
