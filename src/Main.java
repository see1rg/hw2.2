
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


        maz.bestLapTime();
        audi.maxSpeed();
        ikarus.pitStop();

        Driver<Truck> valera = new Driver<>("Valera", true, 4, 'C', kamaz);
        Driver<PassengerTransport> fedya = new Driver<>("Fedya", true, 2, 'B', bmw);
        Driver<Bus> ivan = new Driver<>("Ivan", true, 1, 'D', lviv);

        System.out.println("Водитель " + valera.getFullName() + " управляет автомобилем "
                + kamaz.getBrand() + " и будет участвовать в заезде.");

        ivan.startMovement(lviv);
        fedya.stopMovement(bmw);
        valera.refill(kamaz);

        maz.printType();
        dodge.printType();
        liaz.printType();

       passDiagnostics(ikarus, lviv, liaz, sanYong, man, maz, kamaz, tatra, ford, bmw, audi, dodge);

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