public class DriverC<С extends Car> extends Driver {

    public DriverC(String fio, Boolean rights, int experience) {
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
        System.out.println(fio + " заправляет грузовой автомобиль");

    }
    public void printDriver(Truck truck){
        System.out.println("Водитель " + fio + " управляет автомобилем " + truck + " и будет учавствовать в заезде." );
    }

}