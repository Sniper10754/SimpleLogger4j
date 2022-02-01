package me.sniper10754.simplelogger4j.logger.adapters;

/**
 * The type Print adapter.
 */
public interface PrintAdapter {
    /**
     * Print.
     *
     * @param o the o
     */
     void print(Object o);
    
    /**
     * Print.
     *
     * @param s the s
     */
     void print(String s);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(boolean x);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(char x);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(int x);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(long x);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(float x);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(double x);
    
    /**
     * Print.
     *
     * @param x the x
     */
     void print(char[] x);
}
