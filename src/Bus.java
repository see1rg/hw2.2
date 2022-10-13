
public class Bus extends Car implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Boolean movement, Character category,
               Capacity capacity) {
        super(brand, model, engineVolume, movement, category);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус заехал в пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг у автобуса - 2 минуты.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автобуса 120 км/ч.");
    }

    @Override
    public void printType() {
        if (getBrand() == null || getCapacity().getDescription() == null) {
            System.out.println("Данных не достаточно.");
        } else {
            System.out.println("Вместимость пассажиров у автобуса " + getBrand() + " составляет "
                    + getCapacity().getDescription());
        }
    }

    @Override
    public Boolean passDiagnostics() {
        System.out.println("Автобусу " + getBrand() + " диагностика не требуется");
        return true; }


}
