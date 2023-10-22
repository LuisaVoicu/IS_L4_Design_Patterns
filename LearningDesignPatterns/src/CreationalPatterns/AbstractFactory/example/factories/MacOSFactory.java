package CreationalPatterns.AbstractFactory.example.factories;

import CreationalPatterns.AbstractFactory.example.buttons.Button;
import CreationalPatterns.AbstractFactory.example.buttons.MacOSButton;
import CreationalPatterns.AbstractFactory.example.checkboxes.Checkbox;
import CreationalPatterns.AbstractFactory.example.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
