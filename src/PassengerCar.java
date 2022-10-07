public class PassengerCar extends Car implements Competing{

    public PassengerCar(String brand, String model, double engineVolume, Boolean movement, Character category) {
        super(brand, model, engineVolume, movement, category);
    }


    @Override
    public void pitStop() {
        System.out.println("Легковая машина заехала в пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг у легковой машины - 4 минуты.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у легковой машины 220 км/ч.");
    }

}
