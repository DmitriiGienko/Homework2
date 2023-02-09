package transport;

import driver.Driver;
import driver.DriverD;
import java.util.Random;

public class Bus <D extends DriverD>extends Transport implements competing{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Bus(String brand, String model, double engineVolume, Driver driver) {
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
    public Driver getDriver() {
        return super.getDriver();
    }

    public void startMovement() {
        System.out.println("Начало движения автобуса " + this.getBrand());
    }

    @Override
    public void stopMovement() {
        System.out.println("Окончание движения автобуса " + this.getBrand());
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
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
        return ran.nextDouble(80) + 120;
    }

    public void showInfo() {
        System.out.printf("Водитель %s управляет автобусом %s и будет участвовать в заезде\n", getDriver().getFullName(), getBrand());
    }

}
