public class PassengerCar extends Car implements Competing {
    public enum TypeBody {SEDAN, HATCHBACK, COPE, STATION, WAGON, SUV,
        CROSSOVER, PICKUP, TRUCK, VON, MINIVAN;}

    public TypeBody determineTypeCar(TypeBody com){
        if (com == null) {
            System.out.println( "Тип авто не определен! Данных недостаточно");
        }
        return com;
    }

    public String bodyType;

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }


    public PassengerCar(String brand, String model, Double engineVolume) {
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
    public void makeDiagnostics() {
        System.out.println("Легковой автомобиль " + getBrand() + " проходит диагностику");
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
