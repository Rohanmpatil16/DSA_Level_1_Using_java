public class stackclass {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {   // constructor needs a parameter
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        public static Node head;

        public static boolean isEmpty() {   // missing return type
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {  // spelling: "peek" not "peak"
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    // main method
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
