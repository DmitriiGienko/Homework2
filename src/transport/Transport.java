package transport;

import technicalSupport.Mechanic;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanicList, transport.mechanicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanicList);
    }

    @Override
    public String toString() {
        return brand + "\n" +
                " * модель:  " + model + "\n" +
                " * объем двигателя:  " + engineVolume + "\n";

    }
}
