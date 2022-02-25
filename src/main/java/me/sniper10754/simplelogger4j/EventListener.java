package me.sniper10754.simplelogger4j;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The type Log event listener.
 */
@FunctionalInterface
public interface EventListener extends java.util.EventListener {
    
    /**
     * On log event.
     *
     * @param event the event
     */
    void log(LogEvent event);
}
