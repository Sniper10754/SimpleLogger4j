package me.sniper10754.simplelogger4j.impl.logger;

import me.sniper10754.simplelogger4j.EventListener;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The type Event logger.
 *
 * Adapts {@link AbstractLogger} for using {@link EventListener}.
 */
public abstract class EventLogger extends AbstractLogger {
    private List<EventListener> listeners;
    
    /**
     * Instantiates a new Abstract logger.
     */
    public EventLogger() {
        this.listeners = new LinkedList<>();
    }
    
    /**
     * Add listener.
     *
     * @param eventListener the event listener
     */
    public void addListener(EventListener eventListener) {listeners.add(eventListener);}
    
    /**
     * Remove listener boolean.
     *
     * @param o the o
     * @return the boolean
     */
    public boolean removeListener(EventListener o) {return listeners.remove(o);}
    
    /**
     * Gets listeners.
     *
     * @return the listeners
     */
    protected List<EventListener> getListeners() {
        return Collections.unmodifiableList(listeners);
    }
}
