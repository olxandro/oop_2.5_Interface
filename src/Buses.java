public class Buses extends Cars {
    public Buses(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);

    }

    @Override
    public void startMoving() {
        System.out.println("Автобус стартовал.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус финишировал");
    }
}
