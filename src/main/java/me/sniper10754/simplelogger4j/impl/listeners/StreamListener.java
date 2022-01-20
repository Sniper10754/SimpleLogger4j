package me.sniper10754.simplelogger4j.impl.listeners;

import me.sniper10754.simplelogger4j.event.LogEvent;
import me.sniper10754.simplelogger4j.EventListener;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The type Stream listener.
 *
 * logs the event to a {@link java.io.OutputStream}
 */
public class StreamListener implements EventListener {
    private final PrintStream stream;
    
    /**
     * Instantiates a new Stream listener.
     *
     * @param stream the stream
     */
    public StreamListener(OutputStream stream) {
        this.stream = new PrintStream(stream);
    }
    
    @Override
    public void onLogEvent(LogEvent event) {
        stream.println(event.toString());
    }
}
