public class Trucks extends Car implements Competing{

    public Trucks(String brand, String model, double engineVolume, Boolean movement,Character category) {
        super(brand, model, engineVolume, movement, category);
    }

    @Override
    public void PitStop() {
        System.out.println("Грузовик заехал в пит-стоп.");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучший круг у грузовика - 2 минуты.");
    }

    @Override
    public void MaxSpeed() {
        System.out.println("Максимальная скорость у грузовика 150 км/ч.");
    }

}
