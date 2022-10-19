import java.util.*;

public class Main {
    public static void main(String[] args) {

        Bus ikarus = new Bus("ikarus", "f112", 1.9,
                false, 'D', Capacity.BIG);
        Bus lviv = new Bus("Львiв", "З12", 2.4,
                false, 'D', Capacity.SMALL);
        Bus liaz = new Bus("Лиаз", "л22", 2.8,
                false, 'D', Capacity.BIGGEST);
        Bus sanYong = new Bus("SanYong", "d321", 2.8,
                false, 'D', Capacity.BIG);

        Truck maz = new Truck("Маз", "л-706", 2.7,
                false, 'C', Weight.N1);
        Truck man = new Truck("Man", "fg222", 2.9,
                false, 'C', Weight.N2);
        Truck kamaz = new Truck("Камаз", "сс04", 2.0,
                false, 'C', Weight.N1);
        Truck tatra = new Truck("d-091", "201", 2.5,
                false, 'C', Weight.N3);

        PassengerTransport ford = new PassengerTransport("ford", "focus", 1.6,
                false, 'B', TypeOfBody.HATCHBACK);
        PassengerTransport bmw = new PassengerTransport("bmw", "720", 2.0,
                false, 'B', TypeOfBody.COUPE);
        PassengerTransport audi = new PassengerTransport("audi", "a7", 6.0,
                false, 'B', TypeOfBody.COUPE);
        PassengerTransport dodge = new PassengerTransport("dodge", "viper", 2.2,
                false, 'B', TypeOfBody.VAN);


        Transport[] transportsArray = {
                bmw, ford, audi, dodge,
                tatra, kamaz, man, maz,
                ikarus, lviv, liaz, sanYong
        };

        Set<Transport> transportList = new HashSet<>(Arrays.asList(transportsArray));

        maz.bestLapTime();
        audi.maxSpeed();
        ikarus.pitStop();

        Driver<Truck> valera = new Driver<>("Valera", true, 4, 'C', kamaz);
        Driver<PassengerTransport> fedya = new Driver<>("Fedya", true, 2, 'B', bmw);
        Driver<Bus> ivan = new Driver<>("Ivan", true, 1, 'D', lviv);

        Mechanic<Truck> lesha = new Mechanic<>("Lesha", "ВТБ");
        Mechanic<Bus> zhenya = new Mechanic<>("Zhenya", "Яндекс");
        Mechanic<PassengerTransport> max = new Mechanic<>("Max", "Мечел");

        Sponsor<Bus> vtb = new Sponsor<>("ВТБ", 230000);
        Sponsor<PassengerTransport> yandex = new Sponsor<>("Яндекс", 3400000);
        Sponsor<Truck> mechell = new Sponsor<>("Мечел", 29000);

        System.out.println("Водитель " + valera.getFullName() + " управляет автомобилем "
                + kamaz.getBrand() + " и будет участвовать в заезде.");

        ivan.startMovement(lviv);
        fedya.stopMovement(bmw);
        valera.refill(kamaz);

        maz.printType();
        dodge.printType();
        liaz.printType();

        passDiagnostics(
                ikarus, lviv, liaz, sanYong,
                man, maz, kamaz, tatra, ford,
                bmw, audi, dodge);

        maz.addSponsor(vtb);
        maz.addSponsor(yandex);
        maz.addSponsor(mechell);

        kamaz.addMechanic(lesha);
        kamaz.addMechanic(zhenya);
        kamaz.addMechanic(max);

        sanYong.addDriver(valera);

        System.out.println(maz.getSponsors());
        System.out.println(kamaz.getMechanics());
        System.out.println(sanYong.getDrivers());

        ServiceStation serviceStation= new ServiceStation();
        serviceStation.addTransportsToStation(maz);
        serviceStation.service();

        Queue <String> queue1 = new LinkedList<>();
        Queue <String> queue2 = new LinkedList<>();
        for (int i = 0; i < Math.floor(Math.random()*5 + 2); i++) {
            queue1.offer("Mike " + i);}
        for (int i = 0; i < Math.floor(Math.random()*5 + 2); i++) {
            queue2.offer("John " + i);
        }
        addStringToQueue("Fred", queue1, queue2);

        System.out.println(queue1);
        System.out.println(queue2);

    }
static void addStringToQueue( String name, Queue<String> q1, Queue<String> q2){
      if (q1.size()== q2.size() && q1.size() == 5){
          System.out.println("Галяяяяя");
      }
    if (q1.size() < q2.size()) {
        q1.add(name);
        return; }
    if (q2.size() < q1.size()) {
        q2.add(name);
        return;}
    if (q2.size() == q1.size()) {
        q1.add(name);
    }

}

    public static boolean passDiagnostics(Transport... transports) throws RuntimeException {
        for (Transport transport : transports) {
            checkDiagnostics(transport);
        }
        return true;
    }

    public static void checkDiagnostics(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + "  " + " не прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}