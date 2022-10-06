public class Driver_C <С extends Cars> extends Driver {

    public Driver_C(String fio, Boolean rights, int experience) {
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
    public void printDriver(Trucks trucks){
        System.out.println("Водитель " + fio + " управляет автомобилем " + trucks + " и будет учавствовать в заезде." );
    }

}