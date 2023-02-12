package transport;

import driver.Driver;
import driver.DriverB;
import java.util.Random;

public class Car extends Transport <DriverB> implements competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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
    public double getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public DriverB getDriver() {
        return super.getDriver();
    }

    @Override
    public void setDriver(DriverB driver) {
        super.setDriver(driver);
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

    @Override
    public void pitStop() {
        System.out.println(this.getBrand() + " заехал на ПитСтоп");

    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время круга %s %.1f мин\n", this.getBrand(), (S / speed()) * 60);

    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость %s %.1f км/ч\n", this.getBrand(), speed());
    }

    public double speed() {
        Random ran = new Random();
        return ran.nextDouble(100) + 200;
    }

    public void showInfo() {
        System.out.printf("Водитель %s управляет автомобилем %s и будет участвовать в заезде\n", getDriver().getFullName(), getBrand());
    }

}


