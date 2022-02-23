package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;

public class AnonymousLogger extends AbstractLogger {
    private static final AnonymousLogger instance = new AnonymousLogger();
    
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
