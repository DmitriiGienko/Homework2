import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;
import technicalSupport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // создаю механиков
        Mechanic genri = new Mechanic("Генри Форд", "Ford Motor Company");
        Mechanic ferdi = new Mechanic("Фердинанд Порше", "Daimler-Benz AG");
        Mechanic slava = new Mechanic("Вячеслав Молотов", "ГАЗ-сервис");
        Mechanic soito = new Mechanic("Соитиро Хонда", "Honda Racing Corporation");

        genri.performMaintenance();
        genri.fixCar();
        ferdi.performMaintenance();
        ferdi.fixCar();
        slava.performMaintenance();
        slava.fixCar();

        List<Mechanic> mechanics = new LinkedList<>();
        mechanics.add(genri);
        mechanics.add(ferdi);
        mechanics.add(soito);
        mechanics.add(slava);


        DriverB[] driverB = new DriverB[4];
        driverB[0] = new DriverB("Иванов И.В.", 7, "B");
        driverB[1] = new DriverB("Петров В.Е.", 21, "B");
        driverB[2] = new DriverB("Сидоров И.Р.", 14, "B");
        driverB[3] = new DriverB("Ильин П.Т.", 2, "B");

        Car lambo = new Car("LAMBORGHINI", "Countach s", 6.4, driverB[0], mechanics.subList(3, 4), Car.TypeOfBody.COUPE);
        Car ferrari = new Car("FERRARI", "Testarossa", 4.9, driverB[1], mechanics.subList(1, 3), Car.TypeOfBody.HATCHBACK);
        Car chevi = new Car("CHEVROLET", "Comaro", 5.0, driverB[2], mechanics.subList(1, 3), Car.TypeOfBody.HATCHBACK);
        Car lada = new Car("LADA", "2104", 1.3, driverB[3], mechanics.subList(3, 4), Car.TypeOfBody.WAGON);


        lada.printType();
        System.out.println();
        lambo.showInfo();
        ferrari.showInfo();
        chevi.showInfo();
        lada.showInfo();
        ferrari.passDiagnostics();

        lambo.printDriverAndMechInfo();
        chevi.printDriverAndMechInfo();

        DriverC[] driverC = new DriverC[4];
        driverC[0] = new DriverC("Валенков H.K.", 6, "С");
        driverC[1] = new DriverC("Летунов У.К.", 30, "С");
        driverC[2] = new DriverC("Бобров М.Р.", 15, "С");
        driverC[3] = new DriverC("Пчелкин З.Л.", 8, "С");

        Truck man = new Truck("MAN", "TGX", 10.2, driverC[0], mechanics.subList(0, 2), Truck.LoadСapacity.N3);
        Truck gazel = new Truck("Gazel", "Next", 2.4, driverC[0], mechanics.subList(2, 4), Truck.LoadСapacity.N1);
        Truck reno = new Truck("Renault", "Major", 9.8, driverC[0], mechanics.subList(1, 3), Truck.LoadСapacity.N2);
        Truck kamaz = new Truck("KAMAZ", "5320", 10.8, driverC[0], mechanics.subList(3, 4), Truck.LoadСapacity.N3);

        System.out.println(gazel);
        man.getType();
        man.showInfo();
        gazel.showInfo();
        reno.showInfo();
        kamaz.showInfo();
        reno.passDiagnostics();

        kamaz.printDriverAndMechInfo();

        DriverD[] driverD = new DriverD[4];
        driverD[0] = new DriverD("Валенков H.K.", 6, "D");
        driverD[1] = new DriverD("Летунов У.К.", 30, "D");
        driverD[2] = new DriverD("Бобров М.Р.", 15, "D");
        driverD[3] = new DriverD("Пчелкин З.Л.", 8, "D");

        Bus gazell = new Bus("GAZELL", "Transfer", 2.4, driverD[0], mechanics.subList(2, 4), Bus.Capacity.ESPECIALLY_SMALL);
        Bus neo = new Bus("NEOPLAN", "Turboline", 12.4, driverD[1], mechanics.subList(1, 2), Bus.Capacity.ESPECIALLY_LARGE);
        Bus isuzu = new Bus("ISUZU", "Citibus", 5.6, driverD[2], mechanics.subList(2, 3), Bus.Capacity.LARGE);
        Bus paz = new Bus("PAZ", "32054", 4.6, driverD[3], mechanics.subList(2, 4), Bus.Capacity.SMALL);

        gazell.printDriverAndMechInfo();

        System.out.println(gazell);
        gazell.showInfo();
        neo.showInfo();
        isuzu.showInfo();
        paz.showInfo();
        isuzu.getType();

        try {
            neo.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        // создаю список транспорта участвующих в гонках
        List<Transport> transportList = new ArrayList<>();
        transportList.add(lambo);
        transportList.add(ferrari);
        transportList.add(chevi);
        transportList.add(lada);
        transportList.add(man);
        transportList.add(gazel);
        transportList.add(reno);
        transportList.add(kamaz);
        transportList.add(gazell);
        transportList.add(neo);
        transportList.add(isuzu);
        transportList.add(paz);

// создаю объект ServiceStation c очередью
        Queue<Transport> transportQueue = new LinkedList<>();
        ServiceStation serviceStation = new ServiceStation(transportQueue);

        serviceStation.addToQueue(ferrari);
        serviceStation.addToQueue(lada);
        serviceStation.addToQueue(kamaz);
        serviceStation.addToQueue(neo);
        serviceStation.performTechnicalInspection();
        serviceStation.performTechnicalInspection();
        serviceStation.performTechnicalInspection();

        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(driverB[0]);
        driverSet.add(driverB[0]);
        driverSet.add(driverB[1]);
        driverSet.add(driverB[0]);
        driverSet.add(driverC[3]);
        driverSet.add(driverD[2]);
        driverSet.add(driverB[2]);
        for (Driver driver : driverSet) {
            System.out.println(driver.getFullName());
        }

        Map<Transport<?>, List<Mechanic>> mechanicMap = new HashMap<>();
        mechanicMap.put(lambo, lambo.getMechanicList());
        mechanicMap.put(chevi, chevi.getMechanicList());
        mechanicMap.put(ferrari, ferrari.getMechanicList());
        mechanicMap.put(lada, lada.getMechanicList());
        mechanicMap.put(kamaz, kamaz.getMechanicList());
        mechanicMap.put(man, man.getMechanicList());
        mechanicMap.put(neo, neo.getMechanicList());
        mechanicMap.put(gazell, gazell.getMechanicList());
        mechanicMap.put(paz, paz.getMechanicList());
        for (Map.Entry<Transport<?>, List<Mechanic>> entry : mechanicMap.entrySet()) {
            System.out.printf("%S обслуживает  : ", entry.getKey().getBrand());
            for (int i = 0; i < entry.getKey().getMechanicList().size(); i++) {
                System.out.print(entry.getKey().getMechanicList().get(i).getFullName());
                if (i < entry.getKey().getMechanicList().size() - 1) {
                    System.out.print(" и ");
                }
            }
            System.out.println();
        }


    }


}