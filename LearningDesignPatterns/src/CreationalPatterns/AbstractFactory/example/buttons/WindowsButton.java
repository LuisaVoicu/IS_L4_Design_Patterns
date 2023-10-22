package CreationalPatterns.AbstractFactory.example.buttons;

public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Testing WindowsButton...");
    }
}
