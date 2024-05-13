public class Circular_Queue_24 {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(99);

        System.out.println(queue.dequeue());

        queue.enqueue(12);
        queue.enqueue(32);

        System.out.println("peek: " + queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

//        queue.show();
    }
}