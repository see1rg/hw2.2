
public class Bus extends Car implements Competing{
    public Bus(String brand, String model, double engineVolume, Boolean movement,Character category) {
        super(brand, model, engineVolume, movement, category);
    }

    @Override
    public void PitStop() {
        System.out.println("Автобус заехал в пит-стоп.");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучший круг у автобуса - 2 минуты.");
    }

    @Override
    public void MaxSpeed() {
        System.out.println("Максимальная скорость у автобуса 120 км/ч.");
    }

}
