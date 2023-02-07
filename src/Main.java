import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("_____ Задача 1 _____");

        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "Желтый",
                "Россия",
                2015,
                185,
                "Робот",
                "Хэчбек",
                "R555YT",
                4,
                true,
                new Car.Key(null, null));
        Car.Key ladaKey = new Car.Key(null, null);
        System.out.println(lada);
        ladaKey.isRemoteStarting();
        ladaKey.isWithoutKey();

        Car audi = new Car("Audi",
                "A8",
                3.0,
                "Белый",
                null,
                2020,
                240,
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
                3.0,
                null,
                "Германия",
                2022,
                260,
                null,
                "Купе",
                "С777СХ",
                2,
                Car.selectTires(6),
                new Car.Key("+", ""));

        Car kia = new Car("KIA",
                "Sportage",
                0,
                "Красный",
                "Южная Корея",
                2018,
                180,
                "Механика",
                null,
                "А023НН",
                0,
                Car.selectTires(6),
                new Car.Key("+", null));

        Car honda = new Car("Hyundai",
                null,
                1.6,
                null,
                "Южная Корея",
                2000,
                0,
                "Автомат",
                "Седан",
                "Т473YT",
                5,
                Car.selectTires(9),
                new Car.Key("", "+"));


    }

    public static void task2() {
        System.out.println("_____ Задача 2 _____");

        Bus volgabus = new Bus("Volgabus","Сити-ритм","Синий",2021,"Россия",0);
        Bus mercedes = new Bus("Mercedes","D-830",null,0,"Германия",135);
        Bus honda = new Bus("Honda",null,"Красный",2022,"Япония",140);

        System.out.println(volgabus);
        System.out.println(mercedes);
        System.out.println(honda);


    }


}