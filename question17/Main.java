import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(8);

        System.out.println("Elements: " + queue);
        queue.remove();
        System.out.println("Elements: " + queue);
        System.out.println("First element in queue: " + queue.peek());

        queue.add(99);
        queue.add(11);
        queue.add(3);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Elements: " + queue);
    }
}