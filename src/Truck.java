public class Truck extends Car implements Competing{
    public enum CompetingCapacity{
        N1(3.5),
        N2(3.5-12),
        N3(12);
        public double  loadCapacity;

        CompetingCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public double getLoadCapacity() {
            return loadCapacity;
        }

        public void setLoadCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;
        }
    }
    public Truck(String brand, String model, Double engineVolume) {
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

    @Override
    public void makeDiagnostics() throws BusDiagnosticsException {
        System.out.println("Грузовик " + getBrand() + " проходит диагностику");
    }

    @Override
    public String pitStop() {
        return "Грузовой автомобиль заезжает на пит стоп!";
    }

    @Override
    public void bestLapTime(int time) {
        System.out.println("Время лучшего круга грузовика" + time);;
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость грузовика" + speed);
    }

    @Override
    public String toString() {
        return getBrand();
    }
}
