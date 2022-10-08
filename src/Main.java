
public class Main {
    public static void main(String[] args) {

        Bus ikarus = new Bus("ikarus", "f112", 1.9,
                        false,'D');
        Bus lviv = new Bus("Львiв", "З12", 2.4,
                false,'D');
        Bus liaz = new Bus("Лиаз", "л22", 2.8,
                false,'D');
        Bus sanYong = new Bus("SanYong", "d321", 2.8,
                false,'D');

        Truck maz = new Truck("Маз", "л-706",2.7 , false,'C');
        Truck man = new Truck("Man","fg222",2.9 , false,'C');
        Truck kamaz = new Truck("Камаз", "сс04",2.0 , false,'C');
        Truck tatra = new Truck("d-091","201",2.5 , false,'C');

        PassengerCar ford = new PassengerCar("ford", "focus", 1.6,
                false,'B');
        PassengerCar bmw = new PassengerCar("bmw", "720",2.0 ,
                false,'B');
        PassengerCar audi = new PassengerCar("audi", "a7",6.0 ,
                false,'B');
        PassengerCar dodge = new PassengerCar("dodge", "viper", 2.2,
                false,'B');

        maz.bestLapTime();
        audi.maxSpeed();
        ikarus.pitStop();

        Driver<Truck> valera = new Driver<>("Valera", true, 4, 'C', kamaz);
        Driver<PassengerCar> fedya = new Driver<>("Fedya", true, 2, 'B', bmw);
        Driver<Bus> ivan = new Driver<>("Ivan", true, 1, 'D', lviv);

        System.out.println("Водитель " + valera.getFullName() + " управляет автомобилем "
                + kamaz.getBrand() + " и будет участвовать в заезде.");

        ivan.startMovement(lviv);
        fedya.stopMovement(bmw);
        valera.refill(kamaz);


}
}