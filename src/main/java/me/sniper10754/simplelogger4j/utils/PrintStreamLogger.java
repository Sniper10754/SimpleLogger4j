package me.sniper10754.simplelogger4j.utils;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.Printer;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The type Print stream adapter.
 */
public class PrintStreamLogger extends PrintStream implements Printer {
    private Logger logger;
    private Level logLevel = Level.Info;
    
    /**
     * Instantiates a new Print stream adapter.
     *
     * @param logger the logger
     */
    public PrintStreamLogger(Logger logger) {
        super(new OutputStream() {
            @Override
            public void write(int b) {}
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
     * Gets log level.
     *
     * @return the log level
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
    
    /**
     * Log.
     *
     * @param s the s
     */
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
