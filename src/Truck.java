public class Truck extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand, String model, double engineVolume, boolean movement, Character category, Weight weight) {
        super(brand, model, engineVolume, movement, category);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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

    @Override
    public void printType() {
        if (getBrand() == null || weight.getWeight() == null) {
            System.out.println("Данных не достаточно.");
        } else {
            System.out.println("Грузоподъемность авто " + getBrand() + " " + weight.getWeight());
        }
    }

    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public boolean service() {
       return Math.random() > 0.5;
    }

    @Override
    public void fixCar() {
        System.out.println("Автомобиль " + getBrand() + " починен.");
    }


}
