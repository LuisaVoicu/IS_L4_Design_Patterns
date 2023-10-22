package CreationalPatterns.AbstractFactory.example;

import CreationalPatterns.AbstractFactory.example.Application;
import CreationalPatterns.AbstractFactory.example.factories.GUIFactory;
import CreationalPatterns.AbstractFactory.example.factories.MacOSFactory;
import CreationalPatterns.AbstractFactory.example.factories.WindowsFactory;

public class Demo {
    private static Application configureApp(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
        }else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;

    }
    public static void main(String[] args){
        Application app = configureApp();
        app.paint();
    }
}
