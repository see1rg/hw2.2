import transport.Transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    private double engineVolume;
    private String registrationNumber;
    private String transmission;
    private final String bodyType;
    private boolean typeTires;
    private final int numberOfSeats;
    private Key key;
    private Isurance isurance;


    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать" + "\n" +
                " на специальных электропарковках, если это электрокар.");
    }

    public static class Isurance {
        private final double cost;
        private final String number;
        private final LocalDate dateExpired;

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public LocalDate getDateExpired() {
            return dateExpired;
        }

        public Isurance(double cost, String number, LocalDate dateExpired) {
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
            if (dateExpired == null) {
                this.dateExpired = LocalDate.now().plusDays(365);
            } else {
                this.dateExpired = dateExpired;
            }
        }

        public Isurance() {
            this(10_000D, "123456789", null);
        }

        public void checkIncuranceDate() {
            if (dateExpired.isBefore(LocalDate.now()) || dateExpired.isEqual(LocalDate.now())) {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    public static class Key {
        private final boolean distanceStartEngine;
        private final boolean freeKeyAccess;

        public Key(boolean distanceStartEngine, boolean freeKeyAccess) {
            this.distanceStartEngine = distanceStartEngine;
            this.freeKeyAccess = freeKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isDistanceStartEngine() {
            return distanceStartEngine;
        }

        public boolean isFreeKeyAccess() {
            return freeKeyAccess;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Car(String brand, String model, String color, String productionCountry,
               double engineVolume, String productionYear, String registrationNumber,
               String transmission, String bodyType, boolean typeTires, int numberOfSeats,
               Key key, Isurance isurance, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        this.typeTires = typeTires;

        this.isurance = isurance;

        if (numberOfSeats == 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }


        if (engineVolume == 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (registrationNumber == null) {
            this.registrationNumber = "default";
        } else {
            final String regex = "\\b\\w\\w\\d\\d\\d"; //хх123
            final String string = registrationNumber;

            final Pattern pattern = Pattern.compile(regex);
            final Matcher matcher = pattern.matcher(string);

            if (matcher.matches()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "номер не указан или указан не корректно.";
            }
        }
    }

    public Car(String brand, String model, String color, String productionCountry,
               double engineVolume, String productionYear) {
        this(brand,
                model,
                color,
                productionCountry,
                engineVolume,
                productionYear,
                "x000xx",
                "МКПП",
                "седан",
                false,
                4,
                new Key(),
                new Isurance(), 90);
    }

    public Isurance getIsurance() {
        return isurance;
    }

    public void setIsurance(Isurance isurance) {
        this.isurance = isurance;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        final String regex = "\\b\\w\\w\\d\\d\\d";
        final String string = this.registrationNumber;

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        if (matcher.matches()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "номер указан не корректно.";
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public String toString() {
        return super.getBrand() + " " + super.getModel() + ", " + super.getColor() + ", " + '\n' +
                super.getProductionCountry() + ", объем двигателя " + this.engineVolume + ", " + '\n' +
                super.getProductionYear() + ", регистрационный номер " + registrationNumber;
    }
}

