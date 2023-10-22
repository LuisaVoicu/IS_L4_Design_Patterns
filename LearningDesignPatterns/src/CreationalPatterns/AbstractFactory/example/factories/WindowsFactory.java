package CreationalPatterns.AbstractFactory.example.factories;

import CreationalPatterns.AbstractFactory.example.buttons.Button;
import CreationalPatterns.AbstractFactory.example.buttons.WindowsButton;
import CreationalPatterns.AbstractFactory.example.checkboxes.Checkbox;
import CreationalPatterns.AbstractFactory.example.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
