
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

        Trucks maz = new Trucks("Маз", "л-706",2.7 , false,'C');
        Trucks man = new Trucks("Man","fg222",2.9 , false,'C');
        Trucks kamaz = new Trucks("Камаз", "сс04",2.0 , false,'C');
        Trucks tatra = new Trucks("d-091","201",2.5 , false,'C');

        PassengerCars ford = new PassengerCars("ford", "focus", 1.6,
                false,'B');
        PassengerCars bmw = new PassengerCars("bmw", "720",2.0 ,
                false,'B');
        PassengerCars audi = new PassengerCars("audi", "a7",6.0 ,
                false,'B');
        PassengerCars dodge = new PassengerCars("dodge", "viper", 2.2,
                false,'B');

        maz.BestLapTime();
        audi.MaxSpeed();
        ikarus.PitStop();

        Driver valera = new Driver<>("Valera", true, 4, 'C', kamaz);
        Driver fedya = new Driver<>("Fedya", true, 2, 'B', bmw);
        Driver ivan = new Driver<>("Ivan", true, 1, 'D', lviv);

        System.out.println("Водитель " + valera.getFullName() + " управляет автомобилем "
                + kamaz.getBrand() + " и будет участвовать в заезде.");

        ivan.startMovement();
        fedya.stopMovement();
        valera.refill();

}
}