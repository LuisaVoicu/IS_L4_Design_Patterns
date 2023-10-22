package CreationalPatterns.Builder.example.builders;

import CreationalPatterns.Builder.example.cars.CarType;
import CreationalPatterns.Builder.example.components.Engine;
import CreationalPatterns.Builder.example.components.GPSNavigator;
import CreationalPatterns.Builder.example.components.Transmission;
import CreationalPatterns.Builder.example.components.TripComputer;

public interface Builder {
    public void setCarType(CarType type);
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
