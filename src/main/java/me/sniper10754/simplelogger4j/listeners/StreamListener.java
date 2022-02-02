package me.sniper10754.simplelogger4j.listeners;

import me.sniper10754.simplelogger4j.EventListener;
import me.sniper10754.simplelogger4j.event.LogEvent;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The type Stream listener.
 * <p>
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
    public void log(LogEvent event) {
        stream.print(event.toString());
    }
}
