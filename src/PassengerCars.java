public class PassengerCars extends Cars{

    public PassengerCars(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль стартовал.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Легковой автомобиль финишировал");
    }
}
