package CreationalPatterns.FactoryMethod.Example.factory;

import CreationalPatterns.FactoryMethod.Example.buttons.Button;
import CreationalPatterns.FactoryMethod.Example.buttons.HTMLButton;
import CreationalPatterns.FactoryMethod.Example.factory.Dialog;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
