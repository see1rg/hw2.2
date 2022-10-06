public class Driver<T extends Car> {
    private String fullName;
    private Boolean driverLicence;
    private int experience;
    private Character category;
    private Driver driver;
    private T transport;

    public Driver(String fullName, Boolean driverLicence, int experience, Character category, T transport) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "default";
        } else {
            this.fullName = fullName;
        }
        if (driverLicence == false) {
            throw new IllegalArgumentException("У водителя " + getFullName() + " нет прав и он не может быть допущен.");
        } else {
            this.driverLicence = driverLicence;
        }
        if (experience == 0.0) {
            throw new IllegalArgumentException ("У водителя " + getFullName() +  " нет опыта управления транспортом данной категории и он не может быть допущен.");
        } else {
        this.experience = experience;}
        this.category = category;
        setCar(transport);
    }

    private void setCar(T transport) {
        boolean c;
        switch (getCategory()){
            case 'B':
                c = transport instanceof PassengerCars;
                break;
            case 'C':
                c = transport instanceof Trucks;
                break;
                case 'D':
                c = transport instanceof Bus;
                break;
            default:
                c = false;

        }
        if (c) {
            this.transport = transport;
        }else {
            throw new IllegalArgumentException(getFullName() + " нет прав для управления транспортом этой категории.");
        }
    }

    public void startMovement() {
        System.out.println("Водитель " + getFullName() + " начал движение.");
    }

    public void stopMovement() {
        System.out.println("Водитель " + getFullName() + " прекратил движение.");
    }

    public void refill() {
        System.out.println("Водитель " + getFullName() + " заправил машину.");
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

//    public Driver getDriver() {
//        return driver;
//    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
