package me.sniper10754.simplelogger4j.utils;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.Printer;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The type Print stream adapter.
 */
public class PrintStreamLogger extends PrintStream
        implements Printer {
    private Logger logger;
    private Level logLevel = Level.INFO;
    
    /**
     * Instantiates a new Print stream adapter.
     *
     * @param logger the logger
     */
    public PrintStreamLogger(Logger logger) {
        super(new OutputStream() {
            @Override
            public void write(int b) { }
        });
        this.logger = logger;
    }
    
    /**
     * Logger logger.
     *
     * @return the logger
     */
    public Logger getLogger() {
        return logger;
    }
    
    /**
     * Sets logger.
     *
     * @param logger the logger
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    
    public Level getLogLevel() {
        return logLevel;
    }
    
    public void setLogLevel(Level logLevel) {
        this.logLevel = logLevel;
    }
    
    public void log(String s) {
        logger.log(logLevel, s);
    }
    
    @Override
    public void print(Object o) {
        log(String.valueOf(o));
    }
    
    @Override
    public void print(String s) {
        log(s);
    }
    
    @Override
    public void print(boolean x) {
        log(String.valueOf(x));
    }
    
    @Override
    public void print(char x) {
        log(String.valueOf(x));
    }
    
    @Override
    public void print(int x) {
        log(String.valueOf(x));
    }
    
    @Override
    public void print(long x) {
        log(String.valueOf(x));
    }
    
    @Override
    public void print(float x) {
        log(String.valueOf(x));
    }
    
    @Override
    public void print(double x) {
        log(String.valueOf(x));
    }
    
    @Override
    public void print(char[] x) {
        log(String.valueOf(x));
    }
}
