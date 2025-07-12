public class stack_overflow {
    static final int MAX = 5; // Maximum size of stack
    int top;
    int[] stack = new int[MAX];

    // Constructor
    stack_overflow() {
        top = -1; // Stack is initially empty
    }

    // Push operation
    void push(int value) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Display stack elements
    void display() {
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stack_overflow s = new stack_overflow();
        
        // Pushing 6 elements into stack of size 5 to cause overflow
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);  // This will cause stack overflow
        
        s.display();
    }
}
