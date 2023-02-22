package transport;

import technicalSupport.Mechanic;
import java.util.List;

public abstract class Transport<T> {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private T driver;
    private List<Mechanic> mechanicList;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mechanicList = mechanicList;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void getType();

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    public abstract void printDriverAndMechInfo();

    public abstract boolean isNeedDiagnostic();

    @Override
    public String toString() {
        return brand + "\n" +
                " * модель:  " + model + "\n" +
                " * объем двигателя:  " + engineVolume + "\n";

    }
}
