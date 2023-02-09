package transport;

public class Truck extends Transport {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.println("Начало движения грузовика " + this.getBrand());
    }

    @Override
    public void stopMovement() {
        System.out.println("Окончание движения грузовика " + this.getBrand());
    }


}
