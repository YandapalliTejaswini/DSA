public class SizeOfStack {
    int stack[]=new int[3];
    int top=-1;
    void push(int value){
        if(top==stack.length-1){
            System.out.println("overflow");
            return;
        }
        top++;
        stack[top]=value;
    }
    int size(){
        return top+1;
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SizeOfStack s=new SizeOfStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.size());
    }
}
