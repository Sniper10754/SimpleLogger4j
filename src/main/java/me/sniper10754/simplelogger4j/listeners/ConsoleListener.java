package me.sniper10754.simplelogger4j.listeners;

import me.sniper10754.simplelogger4j.event.LogEvent;

import java.io.OutputStream;

/**
 * The type Console listener.
 * <p>
 * Prints the event to {@code System.out}
 */
public class ConsoleListener extends StreamListener {
    
    /**
     * Instantiates a new Console listener.
     */
    enum Kind {
        /**
         * Err kind.
         */
        ERR,
        /**
         * Out kind.
         */
        OUT
    }
    
    /**
     * Instantiates a new Console listener.
     */
    public ConsoleListener() {
        this(Kind.OUT);
    }
    
    /**
     * Instantiates a new Console listener.
     *
     * @param kind the kind
     */
    public ConsoleListener(Kind kind) {
        this((kind == Kind.OUT) ? System.out :
             (kind == Kind.ERR) ? System.err : null);
    }

    private ConsoleListener(OutputStream stream) {
        super(stream);
    }
    
    @Override
    public void log(LogEvent event) {
        super.log(event);
    }
}
