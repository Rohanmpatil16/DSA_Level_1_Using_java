import java.util.*;
public class stack2{

    public static void push_at_bottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        push_at_bottom(s, data);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        push_at_bottom(s, 5);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}