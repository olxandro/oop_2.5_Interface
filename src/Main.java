public class Main {
    public static void main(String[] args) {

        PassengerCar lada = new PassengerCar("Lada", null, 1.6);
        PassengerCar hatchback = new PassengerCar(" Ford Mondeo", null, 2.2);
        PassengerCar Convertible = new PassengerCar(" Ford Windsta", null, 1.1);
        PassengerCar Sedans = new PassengerCar("Opel Omega", null, 2.6);

        Truck boo = new Truck("Volvo", "Byl", 5.2);
        Truck Carry = new Truck("Fap", "Reg", 6.2);
        Truck honda = new Truck("Rjp", "Hol", 4.2);
        Truck Mitsubishi = new Truck("Les", "Xap", 3.2);

        Bus agh = new Bus("Red", "hfhf", 2.5);
        Bus gfh = new Bus("Lis", "hflk", 1.5);
        Bus puv = new Bus("Noy", "hop", 5.5);
        Bus asd = new Bus("Wur", "hfhhhh", 2.5);

        asd.pitStop();
        System.out.println(honda.pitStop());
        honda.bestLapTime(200);

        DriverB vova = new DriverB("Владимиров Владимир Владимирович", true, 2, lada);
        vova.drivingStart();
        vova.printDriver(lada);
        lada.determineTypeCar(PassengerCar.TypeBody.SEDAN);
    }
}