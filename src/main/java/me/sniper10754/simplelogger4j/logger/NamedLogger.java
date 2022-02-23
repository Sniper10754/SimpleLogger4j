package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.event.LogEvent;

public class NamedLogger extends AbstractLogger {
    private final String name;
    
    public NamedLogger(String name) {
        this.name = name;
    }
    
    @Override
    public void log(LogEvent event) {
        getListeners().forEach(h -> h.log(event));
    }
    
    @Override
    public String getLoggerName() {
        return name;
    }
}
