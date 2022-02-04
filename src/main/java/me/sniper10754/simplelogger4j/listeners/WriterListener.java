package me.sniper10754.simplelogger4j.listeners;

import me.sniper10754.simplelogger4j.EventListener;
import me.sniper10754.simplelogger4j.event.LogEvent;

import java.io.PrintWriter;
import java.io.Writer;

public class WriterListener implements EventListener {
    private PrintWriter writer;
    
    public WriterListener(Writer writer) {
        this.writer = new PrintWriter(writer);
    }
    
    public PrintWriter getWriter() {
        return writer;
    }
    
    @Override
    public void log(LogEvent event) {
        writer.write(event.toString());
    }
}
