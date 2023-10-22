package CreationalPatterns.AbstractFactory.example.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Creating WindowsCheckbox...");
    }
}
