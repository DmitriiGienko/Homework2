package transport;

public class Transport {

    private String brand;
    private String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
        this.brand = veryfiString(brand);
        this.model = veryfiString(model);
        this.color = (color == null || color.isEmpty() ? "Белый" : color);
        this.year = (year <= 0 ? 2010 : year);
        this.country = veryfiString(country);
        this.maxSpeed = (maxSpeed <= 0 ? 100 : maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setVerifyBrand(String brand) {
        this.brand = veryfiString(brand);
    }

    public String getModel() {
        return model;
    }

    public void setVerifyModel(String model) {
        this.model = veryfiString(model);
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

    public String veryfiString(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        } else str = str;
        return str;
    }
}
