package behavioralPatterns.observer.example.listeners;

import java.io.File;

public interface EventListener {
    public void update(String eventType, File file);
}
