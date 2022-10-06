public class Driver_D <D extends Cars> extends Driver{


    public Driver_D(String fio, Boolean rights, int experience) {
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

    public void printDriver(Buses buses){
        System.out.println("Водитель " + fio + " управляет автомобилем " + buses + " и будет учавствовать в заезде." );
    }
}
