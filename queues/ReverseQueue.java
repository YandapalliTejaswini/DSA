import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static void reverse(Queue<Integer>q){
        Stack<Integer> stack=new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        reverse(q);
        System.out.println(q);
    }
}
