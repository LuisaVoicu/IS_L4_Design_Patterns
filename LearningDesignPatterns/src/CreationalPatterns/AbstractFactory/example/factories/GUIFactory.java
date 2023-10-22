package CreationalPatterns.AbstractFactory.example.factories;

import CreationalPatterns.AbstractFactory.example.buttons.Button;
import CreationalPatterns.AbstractFactory.example.checkboxes.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
