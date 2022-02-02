package me.sniper10754.simplelogger4j.tests;

public class IceCreamException extends Exception {
    public IceCreamException(String message) {
        super(message);
    }
    
    public IceCreamException(String message, Throwable cause) {
        super(message, cause);
    }
}
