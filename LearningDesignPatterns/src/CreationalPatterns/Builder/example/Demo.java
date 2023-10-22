package CreationalPatterns.Builder.example;

import CreationalPatterns.Builder.example.builders.CarBuilder;
import CreationalPatterns.Builder.example.builders.CarManualBuilder;
import CreationalPatterns.Builder.example.cars.Car;
import CreationalPatterns.Builder.example.cars.Manual;
import CreationalPatterns.Builder.example.director.Director;

public class Demo {
    public static void main(String[] args){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car build:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual build:\n" + carManual.print());

    }
}
