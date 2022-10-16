import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <S extends Car> {

    private Queue<S> queue = new LinkedList<>();

    public void addCarToQueue(S car){
        queue.offer(car);
    }
    public void doService() throws DiagnosticsException {
        S car = queue.poll();
        if (car != null) {
            car.makeDiagnostics();
        }
    }
}
