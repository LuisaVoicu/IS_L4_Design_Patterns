package structuralPatterns.decorator.example.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
