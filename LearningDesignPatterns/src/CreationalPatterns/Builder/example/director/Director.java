package CreationalPatterns.Builder.example.director;

import CreationalPatterns.Builder.example.builders.Builder;
import CreationalPatterns.Builder.example.cars.CarType;
import CreationalPatterns.Builder.example.components.Engine;
import CreationalPatterns.Builder.example.components.GPSNavigator;
import CreationalPatterns.Builder.example.components.Transmission;
import CreationalPatterns.Builder.example.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator("Cluj Napoca"));
    }
}
