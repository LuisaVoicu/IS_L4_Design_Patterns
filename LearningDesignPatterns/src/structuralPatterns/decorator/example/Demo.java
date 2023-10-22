package structuralPatterns.decorator.example;

import structuralPatterns.decorator.example.decorators.*;

public class Demo {
    public static void main(String[] args){
        String salaryRecords = "Name,Salary\nIon Pop,1000000\nIonel Popescu 1000000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("D:\\an3sem1\\IS\\lab3\\IS_L4_Design_Patterns\\LearningDesignPatterns\\src\\structuralPatterns\\decorator\\OutputDemo.txt")));

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("D:\\an3sem1\\IS\\lab3\\IS_L4_Design_Patterns\\LearningDesignPatterns\\src\\structuralPatterns\\decorator\\OutputDemo.txt");

        System.out.println("- Input --- ");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --- ");
        System.out.println(plain.readData());
        System.out.println(" - Decoded ---");
        System.out.println(encoded.readData());
    }
}
