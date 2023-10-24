package behavioralPatterns.observer.example;

import behavioralPatterns.observer.example.editor.Editor;
import behavioralPatterns.observer.example.listeners.EmailNotificationListener;
import behavioralPatterns.observer.example.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("D:\\an3sem1\\IS\\lab3\\IS_L4_Design_Patterns\\LearningDesignPatterns\\src\\behavioralPatterns\\observer\\example\\file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("luisa@example.com"));

        try {
            editor.openFile("D:\\an3sem1\\IS\\lab3\\IS_L4_Design_Patterns\\LearningDesignPatterns\\src\\behavioralPatterns\\observer\\example\\test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
