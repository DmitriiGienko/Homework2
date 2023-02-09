package transport;


public class Car extends Transport {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getEngineCapacity() {
        return super.getEngineCapacity();
    }

    @Override
    public void startMovement() {
        System.out.println("Начало движения автомобиля " + this.getBrand());
    }

    @Override
    public void stopMovement() {
        System.out.println("Окончание движения автомобиля " + this.getBrand());

    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }


}


