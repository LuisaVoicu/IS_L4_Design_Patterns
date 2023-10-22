package CreationalPatterns.Builder.example.cars;

import CreationalPatterns.Builder.example.components.Engine;
import CreationalPatterns.Builder.example.components.GPSNavigator;
import CreationalPatterns.Builder.example.components.Transmission;
import CreationalPatterns.Builder.example.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Car Type: " + carType;
        info += "\nSeats: " + seats;
        info += "\nEngine: volume - " + engine.getVolume() + " ; mileage - " + engine.getMileage();
        info += "\nTransmission: " + transmission;
        info += "\nTrip Computer: ";
        if(this.tripComputer != null){
            info+= "Functional";
        }else {
            info+= "N/A";
        }
        info += "\nGPS Navigator: ";
        if(this.gpsNavigator != null){
            info += "Functional";
        }else{
            info += "N/A";
        }
        info+="\n";
        return info;
    }
}
