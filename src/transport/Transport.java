package transport;

public class Transport {

    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
        this.brand = verifyInputs(brand);
        this.model = verifyInputs(model);
        this.color = (color == null || color.isEmpty() ? "Белый" : color);
        this.year = (year <= 0 ? 2010 : year);
        this.country = verifyInputs(country);
        this.maxSpeed = (maxSpeed <= 0 ? 100 : maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setVerifyColor(String color) {
        this.color = (color == null || color.isEmpty() ? "Белый" : color);
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setVerifyMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed <= 0 ? 100 : maxSpeed);
    }

    public String verifyInputs(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        } else str = str;
        return str;
    }

    @Override
    public String toString() {
        return "Автобус:  " + brand + "\n" +
                " * модель:  " + model + "\n" +
                " * цвет:  " + color + "\n" +
                " * год выпуска:  " + year + "\n" +
                " * Максимальная скорость:  " + maxSpeed + "\n" +
                " * страна-производитель:  " + country + "\n";
    }
}
