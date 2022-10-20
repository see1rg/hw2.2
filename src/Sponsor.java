public class Sponsor<T extends Transport> {
    private String nameOrCompany;
    private double amountOfSupport;

    public Sponsor(String nameOrCompany, double amountOfSupport) {
        this.nameOrCompany = nameOrCompany;
        this.amountOfSupport = amountOfSupport;
    }

    public String getNameOrCompany() {
        return nameOrCompany;
    }

    public void setNameOrCompany(String nameOrCompany) {
        this.nameOrCompany = nameOrCompany;
    }

    public double getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(double amountOfSupport) {
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorTheRace(){

    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "nameOrCompany='" + nameOrCompany + '\'' +
                ", amountOfSupport=" + amountOfSupport +
                '}';
    }
}
