package me.sniper10754.simplelogger4j.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {
    public static String throwableToString(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        
        return sw.toString();
    }
}
