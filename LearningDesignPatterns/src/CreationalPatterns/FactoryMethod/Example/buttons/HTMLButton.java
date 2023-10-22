package CreationalPatterns.FactoryMethod.Example.buttons;

import CreationalPatterns.FactoryMethod.Example.buttons.Button;
import CreationalPatterns.FactoryMethod.Example.buttons.ButtonFunction;

import static CreationalPatterns.FactoryMethod.Example.buttons.ButtonFunction.TEST_BUTTON;

public class HTMLButton implements Button {
    @Override
    public void render() {
        // do something
        System.out.println("<button>Test HTML Button</button>");
        onClick(TEST_BUTTON);
    }

    @Override
    public void onClick(ButtonFunction function) {
        System.out.println("Testing HTML button...");
    }
}
