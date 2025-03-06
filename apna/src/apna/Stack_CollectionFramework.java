package apna;
import java.util.Stack;

public class Stack_CollectionFramework {
	
	public static void pushAtBottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> s = new Stack<>();
        
        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        reverse(s);

        // While the stack is not empty, print the top element and pop it
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
