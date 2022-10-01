import transport.Transport;

public class Train extends Transport {
    private double tripPrice;
    private String travelTime;
    private String departureStationName;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, String productionYear,
                 String productionCountry, String color, int maxSpeed,
                 double tripPrice, String travelTime,
                 String departureStationName, String endingStation,
                 int numberOfWagons) {
        super(brand, model, productionYear, productionCountry,
                color, maxSpeed);
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.departureStationName = departureStationName;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() +
                ", " + getProductionYear() + " год выпуска, " +
                "максимальная скорость: " + getMaxSpeed() + " км/ч " + '\n' +
                "отходит от " + departureStationName + " и следует до станции: " + '\n' + endingStation +
                ". Цена поездки - " + tripPrice + ". В поезде " + numberOfWagons + " вагонов.";
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");
    }
}
