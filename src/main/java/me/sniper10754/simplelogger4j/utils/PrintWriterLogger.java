package me.sniper10754.simplelogger4j.utils;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.Printer;

import java.io.PrintWriter;
import java.io.Writer;

/**
 * The type Print writer adapter.
 */
public class PrintWriterLogger extends PrintWriter implements Printer {
    private Logger logger;
    private Level logLevel = Level.INFO;
    
    /**
     * Instantiates a new Print writer adapter.
     *
     * @param logger the logger
     */
    public PrintWriterLogger(Logger logger) {
        super(new Writer() {
            @Override
            public void write(int b) {}
            
            @Override
            public void write(char[] cbuf, int off, int len) {}
            
            @Override
            public void flush() {}
            
            @Override
            public void close() {}
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
    
    /**
     * Log level level.
     *
     * @return the level
     */
    public Level getLogLevel() {
        return logLevel;
    }
    
    /**
     * Sets log level.
     *
     * @param logLevel the log level
     */
    public void setLogLevel(Level logLevel) {
        this.logLevel = logLevel;
    }
    
    private void log(String s, boolean newline) {
        logger.log(logLevel, s, newline);
    }
    
    @Override
    public void print(Object o) {
        log(String.valueOf(o), false);
    }
    
    @Override
    public void print(String s) {
        log(s, false);
    }
    
    @Override
    public void print(boolean x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void print(char x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void print(int x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void print(long x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void print(float x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void print(double x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void print(char[] x) {
        log(String.valueOf(x), false);
    }
    
    @Override
    public void println(boolean x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(char x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(int x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(long x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(float x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(double x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(char[] x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(String x) {
        log(String.valueOf(x), true);
    }
    
    @Override
    public void println(Object x) {
        log(String.valueOf(x), true);
    }
}
