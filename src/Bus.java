import transport.Transport;

public class Bus extends Transport {
    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }

    public Bus(String brand, String model, String productionYear,
               String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry,
                color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + " цвет " + getColor() +
                " изготовлен в " + getProductionCountry() + " в " + getProductionYear() +
                ", скорость " + getMaxSpeed() +
                " км/ч ";
    }
}
