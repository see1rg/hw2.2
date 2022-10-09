public class PassengerCar extends Car implements Competing {

    private TypeOfBody typeOfBody;

    public PassengerCar(String brand, String model, double engineVolume, Boolean movement, Character category, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume, movement, category);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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

    public void printType() {
        if (getBrand() == null || typeOfBody.getTypeOfBody() == null) {
            System.out.println("Данных не достаточно.");
        } else {
            System.out.println("Тип кузова авто " + getBrand() + " это " + typeOfBody.getTypeOfBody());
        }
    }
}
