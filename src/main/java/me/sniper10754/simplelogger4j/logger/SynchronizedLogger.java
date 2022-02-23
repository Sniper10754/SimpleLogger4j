package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.EventListener;
import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.event.LogEvent;

import java.util.List;

public class SynchronizedLogger implements Logger {
    private final Logger parent;
    
    public SynchronizedLogger(Logger logger) {
        this.parent = logger;
    }
    
    @Override
    public synchronized void log(LogEvent event) {parent.log(event);}
    
    @Override
    public synchronized void log(Level level, String message) {parent.log(level, message);}
    
    @Override
    public synchronized void thrown(Throwable e) {parent.thrown(e);}
    
    @Override
    public synchronized void thrown(String prefix, Throwable e) {parent.thrown(prefix, e);}
    
    @Override
    public synchronized void info(String message) {parent.info(message);}
    
    @Override
    public synchronized void warning(String message) {parent.warning(message);}
    
    @Override
    public synchronized void severe(String message) {parent.severe(message);}
    
    @Override
    public synchronized void config(String message) {parent.config(message);}
    
    @Override
    public synchronized void fine(String message) {parent.fine(message);}
    
    @Override
    public synchronized void finer(String message) {parent.finer(message);}
    
    @Override
    public synchronized void finest(String message) {parent.finest(message);}
    
    @Override
    public synchronized void all(String message) {parent.all(message);}
    
    @Override
    public synchronized void info(String message, boolean newline) {parent.info(message, newline);}
    
    @Override
    public synchronized void warning(String message, boolean newline) {parent.warning(message, newline);}
    
    @Override
    public synchronized void severe(String message, boolean newline) {parent.severe(message, newline);}
    
    @Override
    public synchronized void config(String message, boolean newline) {parent.config(message, newline);}
    
    @Override
    public synchronized void fine(String message, boolean newline) {parent.fine(message, newline);}
    
    @Override
    public synchronized void finer(String message, boolean newline) {parent.finer(message, newline);}
    
    @Override
    public synchronized void finest(String message, boolean newline) {parent.finest(message, newline);}
    
    @Override
    public synchronized void all(String message, boolean newline) {parent.all(message, newline);}
    
    @Override
    public synchronized void log(Level level, String message, boolean newline) {parent.log(level, message, newline);}
    
    @Override
    public Formatter getFormatter() {return parent.getFormatter();}
    
    @Override
    public synchronized void setFormatter(Formatter formatter) {parent.setFormatter(formatter);}
    
    @Override
    public String getLoggerName() {return parent.getLoggerName();}
    
    @Override
    public synchronized void addListener(EventListener listener) {parent.addListener(listener);}
    
    @Override
    public boolean removeListener(EventListener listener) {return parent.removeListener(listener);}
    
    @Override
    public List<EventListener> getListeners() {return parent.getListeners();}
}
