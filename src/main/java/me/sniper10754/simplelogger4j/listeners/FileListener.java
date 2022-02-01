package me.sniper10754.simplelogger4j.listeners;

import me.sniper10754.simplelogger4j.event.LogEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileListener extends StreamListener {
    
    public FileListener(String filename) throws FileNotFoundException {
        this(new File(filename));
    }
    
    /**
     * Instantiates a new File listener.
     *
     * @param file the file
     */
    public FileListener(File file) throws FileNotFoundException {
        super(new FileOutputStream(file));
    }
    
    @Override
    public void log(LogEvent event) {
        super.log(event);
    }
}
