package CreationalPatterns.AbstractFactory.example;

import CreationalPatterns.AbstractFactory.example.buttons.Button;
import CreationalPatterns.AbstractFactory.example.checkboxes.Checkbox;
import CreationalPatterns.AbstractFactory.example.factories.GUIFactory;
import CreationalPatterns.AbstractFactory.example.factories.MacOSFactory;
import CreationalPatterns.AbstractFactory.example.factories.WindowsFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
         button.paint();
         checkbox.paint();
    }
}
