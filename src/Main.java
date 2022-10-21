import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws DiagnosticsException, IllegalAccessException {

//        PassengerCar lada = new PassengerCar("Lada", null, 1.6, PassengerCar.TypeBody.SEDAN);
//        PassengerCar mond = new PassengerCar(" Ford Mondeo", null, 2.2, PassengerCar.TypeBody.COPE);
//        PassengerCar ford = new PassengerCar(" Ford Windsta", null, 1.1, PassengerCar.TypeBody.MINIVAN);
//        PassengerCar opel = new PassengerCar("Opel Omega", null, 2.6, PassengerCar.TypeBody.CROSSOVER);
//
//        Truck boo = new Truck("Volvo", "Byl", 5.2);
//        Truck Carry = new Truck("Fap", "Reg", 6.2);
//        Truck honda = new Truck("Rjp", "Hol", 4.2);
//        Truck Mitsubishi = new Truck("Les", "Xap", 3.2);
//
//        Bus agh = new Bus("Red", "hfhf", 2.5);
//        Bus gfh = new Bus("Lis", "hflk", 1.5);
//        Bus puv = new Bus("Noy", "hop", 5.5);
//        Bus asd = new Bus("Wur", "hfhhhh", 2.5);
//
//        asd.pitStop();
//        System.out.println(honda.pitStop());
//        honda.bestLapTime(200);
//
//        DriverB vova = new DriverB("Владимиров Владимир Владимирович", "B", 2, lada);
//        vova.drivingStart();
//        vova.printDriver(lada);
//        lada.determineTypeCar(PassengerCar.TypeBody.SEDAN);
//
//        agh.makeDiagnostics();
//        lada.makeDiagnostics();
//
//        Sponsor alfa = new Sponsor("ALfa", 15000);
//        Sponsor omega = new Sponsor("Omega", 15000);
//        Sponsor dublin = new Sponsor("Dublin", 15000);
//
//        DriverB petr = new DriverB("PTE", "BCE", 1, mond);
//        DriverB Vasia = new DriverB("VSA", "BC", 1, mond);
//        DriverB kolia = new DriverB("NKT", "B", 1, mond);


        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Mike" + i);
        }
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("Test" + i);
        }
        System.out.println(queue1);
        System.out.println(queue2);
        removeFromTheRandomQueue(queue1,queue2);
        addStringToQueue("Vasia", queue1, queue2);
    }

    static void addStringToQueue(String name, Queue<String> q1, Queue<String> q2) {
        if (q1.size() == q2.size() && q1.size() == 5) {
            System.out.println("Позовите Галю!");
            return;
        }
        if (q2.size() < q1.size()) {
            q2.add(name);
        }
        if (q2.size() > q1.size()) {
            q1.add(name);
        }
        System.out.println(q1.size());
        System.out.println(q2.size());
    }
    static void removeFromTheRandomQueue(Queue<String> q1, Queue<String> q2) {
        if (new Random().nextBoolean()) {
            q1.poll();
        } else {
            q2.poll();
        }
    }

}