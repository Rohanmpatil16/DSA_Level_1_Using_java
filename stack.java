import java.util.Scanner;

public class stack {
    static final int MAX = 5; // Max size of stack
    int top = -1;
    int[] stack = new int[MAX];

    // Push operation
    public void push(int val) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow! Cannot push " + val);
        } else {
            stack[++top] = val;
            System.out.println(val + " pushed into stack");
        }
    }

    // Pop operation
    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow! Nothing to pop");
        } else {
            int val = stack[top--];
            System.out.println(val + " popped from stack");
        }
    }

    // Display operation
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    st.push(val);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}