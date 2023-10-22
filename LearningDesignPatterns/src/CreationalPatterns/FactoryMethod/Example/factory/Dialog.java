package CreationalPatterns.FactoryMethod.Example.factory;

import CreationalPatterns.FactoryMethod.Example.buttons.Button;

import static CreationalPatterns.FactoryMethod.Example.buttons.ButtonFunction.CLOSE_DIALOG;

public abstract class Dialog {
    public abstract Button createButton();
    public void render()
    {
        Button okButton = createButton();
        okButton.onClick(CLOSE_DIALOG);
        okButton.render();
    }
}
