import java.util.Deque;
import java.util.LinkedList;
public class DequeStack {
    public static void main(String[] args) {
        Deque<Integer> stack=new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    
    }
}
