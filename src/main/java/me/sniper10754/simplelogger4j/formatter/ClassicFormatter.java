package me.sniper10754.simplelogger4j.formatter;

import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.utils.Utils;

/**
 * The type Classic formatter.
 */
public class ClassicFormatter implements Formatter {
    
    /**
     * Format string with an event.
     *
     * @param event the event
     * @return the string
     */
    @Override
    public String format(LogEvent event) {
        StringBuilder buffer = new StringBuilder();
        
        buffer.append("[").append(event.getLogger().getLoggerName()).append("/").append(event.getLevel()).append("]");
        
        buffer.append(" ");
        
        String message;
        if ((message = event.getMessage()) != null) {
            buffer.append(message);
        }
        
        Throwable e;
        if ((e = event.getThrowable()) != null) {
            
            if (message != null) if (! message.isEmpty()) buffer.append(": ");
            
            buffer.append(Utils.throwableToString(e));
        }
        
        return buffer.toString();
    }
}
