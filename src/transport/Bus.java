package transport;

import driver.DriverD;

import java.util.Random;

public class Bus extends Transport<DriverD> implements competing {

    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public enum Capacity {
        ESPECIALLY_SMALL(0, 10),
        SMALL(11, 25),
        AVERAGE(26, 50),
        LARGE(51, 80),
        ESPECIALLY_LARGE(80, 120);

        private final int minCapacity;
        private final int maxCapacity;

        Capacity(int minCapacity, int maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        public int getMinCapacity() {
            return minCapacity;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }

        @Override
        public String toString() {
            return " * вместимость:  " + minCapacity + " - " + maxCapacity + " мест.";
        }
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
    public DriverD getDriver() {
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
        return "Автобус " + super.toString() + capacity.toString();
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
