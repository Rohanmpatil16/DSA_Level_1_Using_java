import java.util.Stack;
public class simple_stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // Output: 50
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
    
}
