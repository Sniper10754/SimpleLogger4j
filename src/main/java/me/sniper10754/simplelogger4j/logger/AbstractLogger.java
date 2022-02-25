package me.sniper10754.simplelogger4j.logger;

import me.sniper10754.simplelogger4j.EventListener;
import me.sniper10754.simplelogger4j.Formatter;
import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.event.LogEvent;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLogger implements Logger {
    private final List<EventListener> listeners = new ArrayList<>();
    private Formatter formatter;
    
    private String getNLOnCondition(String msg, boolean nl) {
        if (nl) msg = msg + "\n";
        
        return msg;
    }
    
    @Override
    public void log(Level level, String message) {
        log(new LogEvent(message, level, null, this));

    }
    
    @Override
    public void info(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Info, message);
    }
    
    /**
     * Warning.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void warning(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Warning, message);
    }
    
    /**
     * Severe.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void severe(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Severe, message);
    }
    
    /**
     * Config.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void config(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Config, message);
    }
    
    /**
     * Fine.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void fine(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Fine, message);
    }
    
    /**
     * Finer.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void finer(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Finer, message);
    }
    
    /**
     * Finest.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void finest(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.Finest, message);
    }
    
    /**
     * All.
     *
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void all(String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(Level.All, message);
    }
    
    /**
     * Log.
     *
     * @param level   the level
     * @param message the message
     * @param newline the newline
     */
    @Override
    public void log(Level level, String message, boolean newline) {
        message = getNLOnCondition(message, newline);
        
        log(new LogEvent(message, level, null, this));
    }
    
    @Override
    public Formatter getFormatter() {
        return formatter;
    }
    
    @Override
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }
    
    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }
    
    @Override
    public boolean removeListener(EventListener listener) {
        return listeners.remove(listener);
    }
    
    @Override
    public List<EventListener> getListeners() {
        return listeners;
    }
}
