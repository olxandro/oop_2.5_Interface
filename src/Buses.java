public class Buses extends Cars implements Competing {
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

    @Override
    public String pitStop() {
        return "Автобус заезжает на пит стоп!";
    }

    @Override
    public void bestLapTime(int time) {
        System.out.println("Время лучшего круга автобуса " + time);
        ;
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость автобуса " + speed);
    }

    @Override
    public String toString() {
        return getBrand();
    }
}
