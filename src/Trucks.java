public class Trucks extends Cars{
    public Trucks(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль стартовал.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль финишировал");
    }
}
