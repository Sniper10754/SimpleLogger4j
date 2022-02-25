package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.formatter.ClassicFormatter;
import me.sniper10754.simplelogger4j.formatter.ColoredFormatter;
import me.sniper10754.simplelogger4j.listeners.ConsoleListener;

public class AnonymousLogger extends AbstractLogger {
    private static final AnonymousLogger instance = new AnonymousLogger();
    
    private AnonymousLogger() {
        setFormatter(new ColoredFormatter());
        addListener(new ConsoleListener(ConsoleListener.Kind.OUT));
    }
    
    public static AnonymousLogger getInstance() {
        return instance;
    }
    
    @Override
    public void log(LogEvent event) {
        getListeners().forEach(listener -> listener.log(event));
    }
    
    @Override
    public String getLoggerName() {
        return "Global";
    }
}
