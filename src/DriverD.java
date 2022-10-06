public class DriverD<D extends Car> extends Driver{


    public DriverD(String fio, Boolean rights, int experience) {
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
        System.out.println(fio + " заправляет автобус");

    }

    public void printDriver(Bus bus){
        System.out.println("Водитель " + fio + " управляет автомобилем " + bus + " и будет учавствовать в заезде." );
    }
}
