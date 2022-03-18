import java.util.Queue;
import java.util.Stack;

public class MyQueue {

    private int front;
    private Stack<Integer> stack;
    private Stack<Integer> stack2;
    public MyQueue() {
        stack = new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        if (stack.empty()){
            front=x;
        }
        while (!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        stack2.push(x);
        while (!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
    }

    public int pop() {

        int x = stack.pop();
        if (!stack.empty()){
            front=stack.peek();
        }
        return x;
    }

    public int peek() {
        return front;
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
