public class DriverD extends Driver<Bus>{


    public DriverD(String fio, String rights, int experience, Bus car) throws IllegalAccessException {
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
        System.out.println(fio + " заправляет автобус");

    }

    public void printDriver(Bus bus){
        System.out.println("Водитель " + fio + " управляет автомобилем " + bus + " и будет учавствовать в заезде." );
    }
}
