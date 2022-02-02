package me.sniper10754.simplelogger4j.listeners;

import me.sniper10754.simplelogger4j.event.LogEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * The type File listener.
 */
public class FileListener extends StreamListener {
    
    /**
     * Instantiates a new File listener.
     *
     * @param filename the filename
     * @throws FileNotFoundException the file not found exception
     */
    public FileListener(String filename) throws FileNotFoundException {
        this(new File(filename));
    }
    
    /**
     * Instantiates a new File listener.
     *
     * @param file the file
     * @throws FileNotFoundException the file not found exception
     */
    public FileListener(File file) throws FileNotFoundException {
        super(new FileOutputStream(file));
    }
    
    @Override
    public void log(LogEvent event) {
        super.log(event);
    }
}
