import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
    }

    public static void task1() {
        System.out.println("_____ Задача 1 _____");

        Car chevi = new Car("CHEVROLET", "Comaro iroc-z", 5.0);
        Car lambo = new Car("LAMBORGHINI", "Countach s", 6.4);
        Car ferrari = new Car("FERRARI", "Testarossa", 4.9);
        Car lada = new Car("LADA", "2101", 1.3);
        System.out.println(chevi);
        System.out.println(lambo);
        System.out.println(ferrari);
        System.out.println(lada);
        chevi.startMovement();

        Truck man = new Truck("MAN", "TGX", 10.2);
        Truck mercedes = new Truck("MERCEDES", "Arox", 10.7);
        Truck reno = new Truck("Renault", "Major", 9.8);
        Truck kamaz = new Truck("KAMAZ", "5320", 10.8);
        System.out.println(man);
        man.stopMovement();

        Bus baw = new Bus("BAW", "Ankai", 6.5);
        Bus neo = new Bus("NEOPLAN", "Turboline", 12.4);
        Bus isuzu = new Bus("ISUZU", "Citibus", 5.6);
        Bus paz = new Bus("PAZ", "32054", 4.6);

    }


}