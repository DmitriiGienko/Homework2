package transport;

import driver.DriverB;

import java.sql.SQLOutput;
import java.util.Random;

public class Car extends Transport<DriverB> implements competing {

    private TypeOfBody typeOfBody;


    public Car(String brand, String model, double engineVolume, DriverB driver, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume, driver);
        this.typeOfBody = typeOfBody;
    }
// добавляю перечисления по типу кузова

    public enum TypeOfBody {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String typeOFBody;

        TypeOfBody(String typeOFBody) {
            this.typeOFBody = typeOFBody;
        }

        public String getTypeOFBody() {
            return typeOFBody;
        }


        @Override
        public String toString() {
            return " * тип кузова: " + typeOFBody;
        }

        public void setTypeOFBody(String typeOFBody) {
            this.typeOFBody = typeOFBody;
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
        return "Автомобиль " + super.toString() + typeOfBody.toString();
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
        System.out.printf("Максимальная скорость %s %.1f км/ч\n",
                this.getBrand(), speed());
    }

    public double speed() {
        Random ran = new Random();
        return ran.nextDouble(100) + 200;
    }

    @Override
    public void getType() {
        System.out.println("Автомобиль " + getBrand() + " в кузове " + typeOfBody.getTypeOFBody());
    }

    @Override
    public void printType() {
        System.out.println("Автомобиль " + getBrand() + " в кузове " +
                (typeOfBody.getTypeOFBody() == null || typeOfBody.getTypeOFBody().isEmpty() ?
                        "Данных по транспортному средству недостаточно" : typeOfBody.getTypeOFBody()));
    }

    public void showInfo() {
        System.out.printf("Водитель %s управляет автомобилем %s и будет участвовать в заезде\n",
                getDriver().getFullName(), getBrand());
    }

    @Override
    public void passDiagnostics() {
        System.out.printf("Автомобиль %S прошел диагностику. Всё ОК!\n", getBrand());
    }
}


