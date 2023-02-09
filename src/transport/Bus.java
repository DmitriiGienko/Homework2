package transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void startMovement() {
        System.out.println("Начало движения автобуса " + this.getBrand());
    }

    @Override
    public void stopMovement() {
        System.out.println("Окончание движения автобуса " + this.getBrand());
    }



}
