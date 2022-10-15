public class DriverB extends Driver<PassengerCar>{

    public DriverB(String fio, String rights, int experience, PassengerCar car) throws IllegalAccessException {
        super(fio, rights, experience, car);
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
