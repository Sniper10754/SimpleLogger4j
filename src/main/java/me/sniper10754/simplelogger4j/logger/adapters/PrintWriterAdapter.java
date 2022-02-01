package me.sniper10754.simplelogger4j.logger.adapters;

import me.sniper10754.simplelogger4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * The type Print writer adapter.
 */
public class PrintWriterAdapter extends PrintWriter
        implements PrintAdapter {
    private Logger logger;
    
    /**
     * Instantiates a new Print writer adapter.
     *
     * @param logger the logger
     */
    public PrintWriterAdapter(Logger logger) {
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
