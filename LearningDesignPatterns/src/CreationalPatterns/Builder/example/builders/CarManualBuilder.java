package CreationalPatterns.Builder.example.builders;

import CreationalPatterns.Builder.example.cars.CarType;
import CreationalPatterns.Builder.example.cars.Manual;
import CreationalPatterns.Builder.example.components.Engine;
import CreationalPatterns.Builder.example.components.GPSNavigator;
import CreationalPatterns.Builder.example.components.Transmission;
import CreationalPatterns.Builder.example.components.TripComputer;

public class CarManualBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavitagor;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavitagor = gpsNavitagor;
    }

    public Manual getResult(){
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavitagor);
    }
}
