package behavioralPatterns.observer.example.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("\nEmail to " + this.email + " : someone has performed : " +
                            eventType + " operation with following file: " + file.getName());
    }
}
