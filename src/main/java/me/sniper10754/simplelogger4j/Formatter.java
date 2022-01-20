package me.sniper10754.simplelogger4j;

import me.sniper10754.simplelogger4j.event.LogEvent;

/**
 * The interface Formatter.
 */
public interface Formatter {
    /**
     * Format string with an event.
     *
     * @param event the event
     * @return the string
     */
    String format(LogEvent event);
}
