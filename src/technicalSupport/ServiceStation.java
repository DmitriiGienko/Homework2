package technicalSupport;

import transport.Transport;

import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public Queue<Transport> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addToQueue(Transport transport) {
        queue.offer(transport);
        System.out.println(transport.getBrand() + " в очереди на техобслуживание");
    }

    public void performTechnicalInspection(Transport transport) {
        System.out.println(queue.poll() + " техосмотр прошел");
    }


}
