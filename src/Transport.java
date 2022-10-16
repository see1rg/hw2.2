import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private boolean movement;
    private Character category;

    private final List<Driver> drivers = new ArrayList<>();
    private final List<Mechanic> mechanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsors = new ArrayList<>();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public Transport(String brand, String model, double engineVolume, Boolean movement, Character category) {
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

    public void addDriver(Driver driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
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

    public abstract boolean passDiagnostics();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", movement=" + movement +
                ", category=" + category +
                ", drivers=" + drivers +
                ", mechanics=" + mechanics +
                ", sponsors=" + sponsors +
                '}';
    }

    public abstract boolean service();

    public abstract void fixCar();
}

