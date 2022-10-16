import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private Double engineVolume;
    private Driver driver;
    private List<Sponsor> sponsors = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Mechaniс> mechaniсs = new ArrayList<>();

    public Car(String brand, String model, Double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "Lada");
        this.model = Objects.requireNonNullElse(model, "cabri");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 1.5);
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

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Driver getDriver() {
        return driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechaniс> getMechaniсs() {
        return mechaniсs;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public void takeInfo() {
        System.out.println("Водитель - " + getDriver().getFio() + ", спонсоры - " + getSponsors() +
                " механики - " + getMechaniсs());
    }

    public abstract void makeDiagnostics() throws DiagnosticsException;

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }
    public void addMechanic(Mechaniс<?> mechaniс) {
        mechaniсs.add(mechaniс);
    }
}
