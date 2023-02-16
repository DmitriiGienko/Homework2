import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;


public class Main {
    public static void main(String[] args) {


        DriverB[] driverB = new DriverB[4];
        driverB[0] = new DriverB("Иванов И.В.", 7, "B");
        driverB[1] = new DriverB("Петров В.Е.", 21, "B");
        driverB[2] = new DriverB("Сидоров И.Р.", 14, "B");
        driverB[3] = new DriverB("Ильин П.Т.", 2, "B");

        Car lambo = new Car("LAMBORGHINI", "Countach s", 6.4, driverB[0], Car.TypeOfBody.COUPE);
        Car ferrari = new Car("FERRARI", "Testarossa", 4.9, driverB[1], Car.TypeOfBody.HATCHBACK);
        Car chevi = new Car("CHEVROLET", "Comaro", 5.0, driverB[2], Car.TypeOfBody.HATCHBACK);
        Car lada = new Car("LADA", "2104", 1.3, driverB[3], Car.TypeOfBody.HATCHBACK);
        lada.getType();

        lada.printType();
        System.out.println();
        lambo.showInfo();
        ferrari.showInfo();
        chevi.showInfo();
        lada.showInfo();

        ferrari.passDiagnostics();

        DriverC[] driverC = new DriverC[4];
        driverC[0] = new DriverC("Валенков H.K.", 6, "С");
        driverC[1] = new DriverC("Летунов У.К.", 30, "С");
        driverC[2] = new DriverC("Бобров М.Р.", 15, "С");
        driverC[3] = new DriverC("Пчелкин З.Л.", 8, "С");

        Truck man = new Truck("MAN", "TGX", 10.2, driverC[0], Truck.LoadСapacity.N3);
        Truck gazel = new Truck("Gazel", "Next", 2.4, driverC[0], Truck.LoadСapacity.N1);
        Truck reno = new Truck("Renault", "Major", 9.8, driverC[0], Truck.LoadСapacity.N2);
        Truck kamaz = new Truck("KAMAZ", "5320", 10.8, driverC[0], Truck.LoadСapacity.N3);
        System.out.println(gazel);
        man.getType();
        man.showInfo();
        gazel.showInfo();
        reno.showInfo();
        kamaz.showInfo();
        reno.passDiagnostics();

        DriverD[] driverD = new DriverD[4];
        driverD[0] = new DriverD("Валенков H.K.", 6, "D");
        driverD[1] = new DriverD("Летунов У.К.", 30, "D");
        driverD[2] = new DriverD("Бобров М.Р.", 15, "D");
        driverD[3] = new DriverD("Пчелкин З.Л.", 8, "D");

        Bus gazell = new Bus("GAZELL", "Transfer", 2.4, driverD[0], Bus.Capacity.ESPECIALLY_SMALL);
        Bus neo = new Bus("NEOPLAN", "Turboline", 12.4, driverD[1], Bus.Capacity.ESPECIALLY_LARGE);
        Bus isuzu = new Bus("ISUZU", "Citibus", 5.6, driverD[2], Bus.Capacity.LARGE);
        Bus paz = new Bus("PAZ", "32054", 4.6, driverD[3], Bus.Capacity.SMALL);
        System.out.println(gazell);
        gazell.showInfo();
        neo.showInfo();
        isuzu.showInfo();
        paz.showInfo();
        isuzu.getType();

        neo.passDiagnostics();



    }


}