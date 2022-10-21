import java.util.*;

public abstract class Car {

    private String brand;
    private String model;
    private Double engineVolume;
    private Driver driver;
    private Set<Sponsor> sponsors = new HashSet<>();
    private Set<Driver> drivers = new HashSet<>();
    private Set<Mechaniс> mechaniсs = new HashSet<>();

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

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechaniс> getMechaniсs() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(engineVolume, car.engineVolume) && Objects.equals(driver, car.driver) && Objects.equals(sponsors, car.sponsors) && Objects.equals(drivers, car.drivers) && Objects.equals(mechaniсs, car.mechaniсs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, sponsors, drivers, mechaniсs);
    }
}
