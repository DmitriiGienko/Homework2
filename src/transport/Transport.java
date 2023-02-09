package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = verifyInputs(brand);
        this.model = verifyInputs(model);
        this.engineVolume = (engineVolume == 0 ? 3.0 : engineVolume);
    }

    public abstract void startMovement();

    public abstract void stopMovement();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineVolume;
    }


    public String verifyInputs(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        } else str = str;
        return str;
    }

    @Override
    public String toString() {
        return brand + "\n" +
                " * модель:  " + model + "\n" +
                " * объем двигателя:  " + engineVolume + "\n";

    }
}
