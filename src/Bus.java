public class Bus extends Car implements Competing {

    public enum CompetingCapacity{
        EXTRA_SMALL("10"),
        SMALL("25"),
        MEDIUM("40-50"),
        LARGE("60-80"),
        EXTRA_LARGE("100-120");

        private String typeCapacity;

        CompetingCapacity(String typeCapacity) {
            this.typeCapacity = typeCapacity;
        }

        public String getTypeCapacity() {
            return typeCapacity;
        }

        public void setTypeCapacity(String typeCapacity) {
            this.typeCapacity = typeCapacity;
        }
    }

    public Bus(String brand, String model, Double engineVolume) {
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
