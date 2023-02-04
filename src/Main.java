import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "Желтый",
                2015,
                "Россия",
                "Робот",
                "Хэчбек",
                "R555YT",
                4,
                false,
                new Car.Key(null, null));
        Car.Key ladaKey = new Car.Key(null, null);
        System.out.println(lada);
        ladaKey.isRemoteStarting();
        ladaKey.isWithoutKey();

        Car audi = new Car("Audi",
                "A8",
                3.5,
                "Белый",
                2020,
                null,
                "Атомат",
                "Универсал",
                "D125DD",
                5,
                Car.selectTires(2),
                new Car.Key("", null));
        Car.Key audiKey = new Car.Key(null, "+");
        System.out.println(audi);
        audiKey.isRemoteStarting();
        audiKey.isWithoutKey();
        audi.setChangeTypeOfTires(true);
        System.out.println(audi);

        Car bmw = new Car("BMW",
                "Z8",
                4,
                null,
                2022,
                "Германия",
                null,
                "Купе",
                "С777СХ",
                2,
                Car.selectTires(6),
                new Car.Key("+", ""));

        Car kia = new Car("KIA",
                "Spectra",
                0,
                "Синий",
                2008,
                "Южная Корея",
                "Механика",
                null,
                "А023НН",
                0,
                Car.selectTires(6),
                new Car.Key("+", null));

        Car honda = new Car("Honda",
                null,
                1.8,
                null,
                2018,
                "Япония",
                "Автомат",
                "Седан",
                "Т473YT",
                5,
                Car.selectTires(9),
                new Car.Key("", "+"));


    }


}