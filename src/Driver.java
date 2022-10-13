public class Driver<T extends Transport> {
    private String fullName;
    private Boolean driverLicence;
    private int experience;
    private Character category;
    private T transport;

    public Driver(String fullName, Boolean driverLicence, int experience, Character category, T transport) {
        if (fullName == null || fullName.isBlank()) {
            this.fullName = "default";
        } else {
            this.fullName = fullName;
        }
        if (driverLicence == false) {
            throw new IllegalArgumentException("У водителя " + getFullName() +
                    " нет прав и он не может быть допущен.");
        } else {
            this.driverLicence = driverLicence;
        }
        if (experience == 0.0) {
            throw new IllegalArgumentException("У водителя " + getFullName() +
                    " нет опыта управления транспортом данной категории и он не может быть допущен.");
        } else {
            this.experience = experience;
        }
        this.category = category;
        this.transport = transport;
    }

//    private void setCar(T transport) {
//        boolean c;
//        switch (getCategory()){
//            case 'B':
//                c = transport instanceof PassengerCar;
//                break;
//            case 'C':
//                c = transport instanceof Truck;
//                break;
//                case 'D':
//                c = transport instanceof Bus;
//                break;
//            default:
//                c = false;
//
//        }
//        if (c) {
//            this.transport = transport;
//        }else {
//            throw new IllegalArgumentException(getFullName() + " нет прав для управления транспортом этой категории.");
//        }
//    }

    public void startMovement(T Car) {
        System.out.println("Водитель " + getFullName() + " начал движение на автомобиле " + Car.getBrand() + ".");
        Car.startMovement();
    }

    public void stopMovement(T Car) {
        System.out.println("Водитель " + getFullName() + " прекратил движение на автомобиле " + Car.getBrand() + ".");
        Car.stopMovement();
    }

    public void refill(T Car) {
        System.out.println("Водитель " + getFullName() + " заправил машину " + Car.getBrand() + ".");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(Boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getExperience() {
        return experience;
    }

    public Character getCategory() {
        return category;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
