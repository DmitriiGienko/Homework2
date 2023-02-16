package transport;

import driver.DriverC;

import java.util.Random;

public class Truck extends Transport<DriverC> implements competing {

    private LoadСapacity loadСapacity;


    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadСapacity loadСapacity) {
        super(brand, model, engineVolume, driver);
        this.loadСapacity = loadСapacity;
    }

    public enum LoadСapacity {
        N1(0f, 3.5f),
        N2(3.6f, 12f),
        N3(12.1f, 30f);

        private final float minLoadCapacity;
        private final float maxLoadCapacity;

        LoadСapacity(float minLoadCapacity, float maxLoadCapacity) {
            this.minLoadCapacity = minLoadCapacity;
            this.maxLoadCapacity = maxLoadCapacity;
        }

        public float getMinLoadCapacity() {
            return minLoadCapacity;
        }

        public float getMaxLoadCapacity() {
            return maxLoadCapacity;
        }

        @Override
        public String toString() {
            return " * грузоподъемность от " +
                    minLoadCapacity +
                    " до " + maxLoadCapacity + " т.";
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
    public DriverC getDriver() {
        return super.getDriver();
    }

    public void setDriver(DriverC driver) {
        super.setDriver(driver);
    }

    @Override
    public void startMovement() {
        System.out.println("Начало движения грузовика " + this.getBrand());
    }

    @Override
    public void stopMovement() {
        System.out.println("Окончание движения грузовика " + this.getBrand());
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString() + loadСapacity.toString();
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
        return ran.nextDouble(100) + 120;
    }

    public void showInfo() {
        System.out.printf("Водитель %s управляет грузовиком %s и будет участвовать в заезде\n", getDriver().getFullName(), getBrand());
    }


    @Override
    public void getType() {

        System.out.println("Грузовик " + getBrand() + " грузоподьемностью от  " + loadСapacity.getMinLoadCapacity() +
                " до " + loadСapacity.getMaxLoadCapacity());
    }



    @Override
    public void printType() {
        System.out.println("Грузовик " + getBrand() + " грузоподьемностью от  " +
                ((loadСapacity.minLoadCapacity <= 0 && loadСapacity.maxLoadCapacity <= 0) ?
                        "Данных по транспортному средству недостаточно" :
                        loadСapacity.getMinLoadCapacity() + " до " + loadСapacity.getMaxLoadCapacity()));
    }
}
