package transport;

import java.util.Locale;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int peopleCapacity;
    private boolean TypeOfTires;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, String transmission, String bodyType, String registrationNumber,
               int peopleCapacity, boolean changeTypeOfTires, Key key) {
        this.brand = veryfiString(brand);
        this.model = veryfiString(model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "Белый" : color);
        ;
        this.year = (year <= 0 ? 2010 : year);
        ;
        this.country = veryfiString(country);
        this.transmission = (transmission == null || transmission.isEmpty() ? "Механика" : transmission);
        this.bodyType = (bodyType == null || bodyType.isEmpty() ? "Седан" : bodyType);
        ;
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
                    " не установлен" : " установлен");
        }

        public void isRemoteStarting() {
            System.out.println("Удаленный запуск двигателя " + remoteStarting);
        }

        public void isWithoutKey() {
            System.out.println("Бесключевой доступ " + withoutKey + "\n");
        }

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public boolean getChangeTypeOfTires() {
        return TypeOfTires;
    }

    public void setChangeTypeOfTires(boolean changeTypeOfTires) {
        this.TypeOfTires = changeTypeOfTires;
    }


    // установка шин
    public static boolean selectTires(int month) {
        return (month >= 10 || month < 4 ? false : true);
    }


    //метод проверки ввода строк
    public String veryfiString(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        } else str = str;
        return str;
    }


    @Override
    public String toString() {
        return "Автомобиль:  " + brand + "\n" +
                " * модель:  " + model + "\n" +
                " * объем двигателя:  " + engineVolume + "\n" +
                " * цвет:  " + color + "\n" +
                " * год выпуска:  " + year + "\n" +
                " * страна-производитель:  " + country + "\n" +
                " * коробка передач:  " + transmission + "\n" +
                " * тип кузова:  " + bodyType + "\n" +
                " * регистрационный номер:  " + registrationNumber + "\n" +
                " * количество мест:  " + peopleCapacity + "\n" +
                " * установлены на колесах: " + (TypeOfTires ? "летние шины" : "зимние шины");
    }
}

