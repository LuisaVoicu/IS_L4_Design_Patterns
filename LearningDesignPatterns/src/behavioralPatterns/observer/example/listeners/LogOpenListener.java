package behavioralPatterns.observer.example.listeners;

import java.io.File;

public class LogOpenListener implements EventListener{
    private File log;

    public LogOpenListener(String fileName){
        this.log = new File(fileName);
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("\nSave log to " + this.log + " : someone has performed : " +
                eventType + " operation with following file: " + file.getName());
    }
}
