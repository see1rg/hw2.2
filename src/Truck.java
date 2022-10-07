public class Truck extends Car implements Competing{

    public Truck(String brand, String model, double engineVolume, Boolean movement, Character category) {
        super(brand, model, engineVolume, movement, category);
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик заехал в пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг у грузовика - 2 минуты.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика 150 км/ч.");
    }

}
