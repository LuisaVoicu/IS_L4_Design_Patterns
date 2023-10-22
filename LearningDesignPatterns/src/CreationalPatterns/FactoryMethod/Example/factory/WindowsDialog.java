package CreationalPatterns.FactoryMethod.Example.factory;

import CreationalPatterns.FactoryMethod.Example.buttons.Button;
import CreationalPatterns.FactoryMethod.Example.buttons.WindowsButton;
import CreationalPatterns.FactoryMethod.Example.factory.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
