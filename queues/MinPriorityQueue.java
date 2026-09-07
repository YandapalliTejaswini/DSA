import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(2);
        pq.offer(30);
        pq.offer(1);
        System.out.println(pq.peek());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.isEmpty());

    }
}
