package CreationalPatterns.AbstractFactory.example.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Creating MacOSCheckbox...");
    }
}
