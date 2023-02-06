package transport;

public class Transport {
    /* Создайте класс Transport, который содержит в себе следующие параметры:
             «Марка»,
             «Модель»,
             «Год выпуска»,
             «Страна производства»,
             «Цвет кузова»,
             «Максимальная скорость передвижения».
     *   Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска», «Страна производства» не могут изменяться.
     Параметры «Цвет» и «Скорость» изменяться могут.    Для изменяемых параметров добавьте проверку данных:
     значение должно быть указано корректно, не должно содержать null и не может быть пустым.
     *Скорректируйте класс  Car  таким образом, чтобы ранее указанные параметры не повторяли те, которые содержатся в классе Transport
     *Класс Car должен наследовать параметры класса Transport
             .*/
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
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String veryfiString(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        } else str = str;
        return str;
    }
}
