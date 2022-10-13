
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private Boolean movement;
    private Character category;

    public Car(String brand, String model, double engineVolume, Boolean movement, Character category) {
        this.category = category;
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.movement = movement;
    }

    public void startMovement() {
        if (!movement) {
            this.movement = true;
        }
    }

    public void stopMovement() {
        if (movement) {
            this.movement = false;
        }
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getMovement() {
        return movement;
    }

    public void setMovement(Boolean movement) {
        this.movement = movement;
    }

    public Character getCategory() {
        return category;
    }

    public void setCategory(Character category) {
        this.category = category;
    }

    public static boolean passDiagnostics(Car... cars) throws RuntimeException {
        for (Car car : cars) {
            checkDiagnostics(car);
        }
        return true;
    }

    public static void checkDiagnostics(Car car) {
        try {
            if (!car.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() + "  " + " не прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

