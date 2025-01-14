package lab11.Observer.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class LoggingListeners implements EventListeners{
    private File log;
    private String message;
    public LoggingListeners(String log_filename, String message){
        this.log = new File(log_filename);
        this.message = message;
    }
    @Override
    public void update(String filename){
        try (FileWriter fileWriter = new FileWriter(log, true)) {
            String logMessage = String.format(message, filename);
            fileWriter.write(logMessage + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
