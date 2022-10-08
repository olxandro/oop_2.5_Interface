public class DriverC extends Driver <Truck>{

    public DriverC(String fio, Boolean rights, int experience, Truck car) {
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
        System.out.println(fio + " заправляет грузовой автомобиль");

    }
    public void printDriver(Truck truck){
        System.out.println("Водитель " + fio + " управляет автомобилем " + truck + " и будет учавствовать в заезде." );
    }

}