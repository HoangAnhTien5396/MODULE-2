public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.deQueue();
        queue.displayQueue();
    }
}

