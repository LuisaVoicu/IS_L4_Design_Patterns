package CreationalPatterns.AbstractFactory.example.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Testing MacOSButton...");
    }
}
