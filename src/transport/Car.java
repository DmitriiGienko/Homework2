package transport;

import java.util.Locale;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int peopleCapacity;
    private boolean TypeOfTires;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, String country, int year, int maxSpeed, String transmission, String bodyType, String registrationNumber,
               int peopleCapacity, boolean TypeOfTires, Key key) {
        super(brand, model, color, year, country, maxSpeed);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.transmission = (transmission == null || transmission.isEmpty() ? "Механика" : transmission);
        this.bodyType = (bodyType == null || bodyType.isEmpty() ? "Седан" : bodyType);
        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty() ? "A000AA" : registrationNumber);
        this.peopleCapacity = (peopleCapacity <= 0 ? 5 : peopleCapacity);
        this.TypeOfTires = selectTires(2);
        this.key = key;

    }

    public static class Key {
        private final String remoteStarting;
        private final String withoutKey;

        public Key(String isRemoteStart, String isWithout) {
            this.remoteStarting = (isRemoteStart == null || isRemoteStart.isEmpty() ?
                    " не установлен" : " установлен");
            this.withoutKey = (isWithout == null || isWithout.isEmpty() ?
                    "не установлен" : " установлен");
        }

        public void isRemoteStarting() {
            System.out.println("Удаленный запуск двигателя " + remoteStarting);
        }

        public void isWithoutKey() {
            System.out.println("Бесключевой доступ " + withoutKey + "\n");
        }

    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setVerifyEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setVerifyTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isEmpty() ? "Механика" : transmission);
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setVerifyRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty() ? "A000AA" : registrationNumber);
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public boolean getChangeTypeOfTires() {
        return TypeOfTires;
    }

    public void setChangeTypeOfTires(boolean TypeOfTires) {
        this.TypeOfTires = selectTires(2);
    }

    // установка шин
    public static boolean selectTires(int month) {
        return (month >= 10 || month < 4 ? false : true);
    }


    //метод проверки ввода строк
    public String verifyInputs(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        } else str = str;
        return str;
    }


    @Override
    public String toString() {
        return super.toString() +
                " * объем двигателя:  " + engineVolume + "\n" +
                " * коробка передач:  " + transmission + "\n" +
                " * тип кузова:  " + bodyType + "\n" +
                " * регистрационный номер:  " + registrationNumber + "\n" +
                " * количество мест:  " + peopleCapacity + "\n" +
                " * установлены на колесах: " + (TypeOfTires ? "летние шины" : "зимние шины");


    }
}


