package me.sniper10754.simplelogger4j.utils;

import me.sniper10754.simplelogger4j.Level;
import me.sniper10754.simplelogger4j.Logger;
import me.sniper10754.simplelogger4j.Printer;

import java.io.PrintWriter;
import java.io.Writer;

/**
 * The type Print writer adapter.
 */
public class PrintWriterLogger extends PrintWriter
        implements Printer {
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
    
    public Level logLevel() {
        return logLevel;
    }
    
    public void setLogLevel(Level logLevel) {
        this.logLevel = logLevel;
    }
    
    private void log(String s) {
        logger.log(logLevel, s);
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
     * Logger logger.
     *
     * @return the logger
     */
    public Logger logger() {
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
    
    @Override
    public void print(Object o) {
        logger.info(String.valueOf(o));
    }
    
    @Override
    public void print(String s) {
        logger.info(s);
    }
    
    @Override
    public void print(boolean x) {
        logger.info(String.valueOf(x));
    }
    
    @Override
    public void print(char x) {
        logger.info(String.valueOf(x));
    }
    
    @Override
    public void print(int x) {
        logger.info(String.valueOf(x));
    }
    
    @Override
    public void print(long x) {
        logger.info(String.valueOf(x));
    }
    
    @Override
    public void print(float x) {
        logger.info(String.valueOf(x));
    }
    
    @Override
    public void print(double x) {
        logger.info(String.valueOf(x));
    }
    
    @Override
    public void print(char[] x) {
        logger.info(String.valueOf(x));
    }
}
