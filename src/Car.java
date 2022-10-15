import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private Double engineVolume;

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

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void makeDiagnostics() throws BusDiagnosticsException;
}
