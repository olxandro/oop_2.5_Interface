public class DriverB<B extends Car> extends Driver{

    public DriverB(String fio, Boolean rights, int experience) {
        super(fio, rights, experience);
    }

    @Override
    public void drivingStart() {
        System.out.println(fio + " начал движение");
    }

    @Override
    public void stay() {
        System.out.println(fio + " начал движение");

    }

    @Override
    public void refuil() {
        System.out.println(fio + " заправляет легковой автомобиль");

    }

    public void printDriver(PassengerCar car){
        System.out.println("Водитель " + fio + " управляет " + car + " и будет учавствовать в заезде." );
    }

}
