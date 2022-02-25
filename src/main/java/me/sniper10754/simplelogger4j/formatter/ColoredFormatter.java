package me.sniper10754.simplelogger4j.formatter;

import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.utils.Utils;
import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.*;

public class ColoredFormatter implements Formatter {
    
    public static Ansi.Color corrispondentColor(Level level) {
        switch (level) {
            case Severe:
                return RED;
            
            case Warning:
                return YELLOW;
            
            case Info:
                return WHITE;
            
            case Config:
                return MAGENTA;
            
            default:
                return BLUE;
        }
    }
    
    @Override
    public String format(LogEvent event) {
        Ansi ansi = new Ansi();
        synchronized (ansi) {
            return new StringBuilder().append(ansi.fg(corrispondentColor(event.getLevel()))).append(event.getLevel()).append(ansi.reset()).append(" [").append(event.getLogger().getLoggerName()).append("]: ").append(event.getThrowable() == null ? event.getMessage() : Utils.throwableToString(event.getThrowable())).toString();
        }
    }
}
