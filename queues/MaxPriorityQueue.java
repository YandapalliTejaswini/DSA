import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(20);
        pq.offer(2);
        pq.offer(30);
        pq.offer(5);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.isEmpty());
    }
}
