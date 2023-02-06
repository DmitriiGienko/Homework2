package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус:  " + this.getBrand() + "\n" +
                " * модель:  " + this.getModel() + "\n" +
                " * цвет:  " + this.getColor() + "\n" +
                " * год выпуска:  " + this.getYear() + "\n" +
                " * Максимальная скорость:  " + this.getMaxSpeed() + "\n" +
                " * страна-производитель:  " + this.getCountry() + "\n";
    }
}
