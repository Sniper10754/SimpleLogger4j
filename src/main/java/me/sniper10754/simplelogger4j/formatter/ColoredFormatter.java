package me.sniper10754.simplelogger4j.formatter;

import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.event.LogEvent;
import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.*;

public class ColoredFormatter implements Formatter {
    private Ansi ansi = Ansi.ansi();
    
    public static Ansi.Color corrispondentColor(Level level) {
        switch (level) {
            case SEVERE:
                return RED;
                
            case WARNING:
                return YELLOW;
    
            case INFO:
                return WHITE;
    
            case CONFIG:
                return MAGENTA;
                
            default:
                return BLUE;
        }
    }
    
    @Override
    public String format(LogEvent event) {
        return ansi.fg(corrispondentColor(event.getLevel())).toString() + event.getLevel() + ansi.reset() + " [" + event.getLogger().getLoggerName() + "]: " + event.getMessage();
    }
}
