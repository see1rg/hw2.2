public class PassengerCars extends Car implements Competing{

    public PassengerCars(String brand, String model, double engineVolume, Boolean movement, Character category) {
        super(brand, model, engineVolume, movement, category);
    }



    @Override
    public void PitStop() {
        System.out.println("Легковая машина заехала в пит-стоп.");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучший круг у легковой машины - 4 минуты.");
    }

    @Override
    public void MaxSpeed() {
        System.out.println("Максимальная скорость у легковой машины 220 км/ч.");
    }

}
