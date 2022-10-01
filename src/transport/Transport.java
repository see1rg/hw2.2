package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private String productionYear;
    private String productionCountry;
    private String color;
    public int maxSpeed;

    public abstract void refill();

    public Transport(String brand, String model, String productionYear,
                     String productionCountry, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (maxSpeed == 0) {
            this.maxSpeed = 90;
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == null || productionYear.isEmpty() || productionYear.isBlank()) {
            this.productionYear = "default";
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "default";
        } else {
            this.color = color;
        }
    }


    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "default";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
