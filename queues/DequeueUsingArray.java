import java.util.*;

public class DequeueUsingArray {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);//dq.pollFirst(10);
        dq.addFirst(30);
        dq.addLast(20);//dq.pollLast(20);
        dq.addLast(40);
        System.out.println(dq);
        System.out.println(dq.pollLast());//dq.removeLast();
        System.out.println(dq.pollFirst());//dq.removeFirst();


    }
}
