import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transports = new ArrayDeque<>();

    public ServiceStation() {
    }

    public Queue<Transport> getTransports() {
        return transports;
    }

    public void addTransportsToStation(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Для автобуса диагностика не требуется.");
            return;
        }
        transports.add(transport);
    }

    public void service() {
        while (!transports.isEmpty()) {
            Transport t = transports.poll();
            if (t.service()) {
                t.fixCar();
            } else {
                System.out.println("Машина не требует сервисного обслуживания.");
            }
        }
    }
}
