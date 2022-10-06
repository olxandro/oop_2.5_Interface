public class Main {
    public static void main(String[] args) {

        PassengerCars lada = new PassengerCars("Lada", null, 1.6);
        PassengerCars hatchback = new PassengerCars(" Ford Mondeo", null, 2.2);
        PassengerCars Convertible = new PassengerCars(" Ford Windsta", null, 1.1);
        PassengerCars Sedans = new PassengerCars("Opel Omega", null, 2.6);

        Trucks boo = new Trucks("Volvo", "Byl", 5.2);
        Trucks Carry = new Trucks("Fap", "Reg", 6.2);
        Trucks honda = new Trucks("Rjp", "Hol", 4.2);
        Trucks Mitsubishi = new Trucks("Les", "Xap", 3.2);

        Buses agh = new Buses("Red", "hfhf", 2.5);
        Buses gfh = new Buses("Lis", "hflk", 1.5);
        Buses puv = new Buses("Noy", "hop", 5.5);
        Buses asd = new Buses("Wur", "hfhhhh", 2.5);

        asd.pitStop();
        System.out.println(honda.pitStop());
        honda.bestLapTime(200);

        Driver_B<PassengerCars> vova = new Driver_B<>("Владимиров Владимир Владимирович", true, 2);
        vova.drivingStart();
        vova.printDriver(lada);
    }
}