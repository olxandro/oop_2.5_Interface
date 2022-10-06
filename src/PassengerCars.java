public class PassengerCars extends Cars implements Competing {

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

    @Override
    public String pitStop() {
        return "Легковой автомобиль заезжает на пит стоп!";
    }

    @Override
    public void bestLapTime(int time) {
        System.out.println("Время лучшего круга " + time);;
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость " + speed);
    }

    @Override
    public String toString() {
        return getBrand();
    }
}
