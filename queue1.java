public class queue1 {

    static class Queue {
        static int a[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            a = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            a[rear] = data;
        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = a[0];
            for (int i = 0; i < rear; i++) {
                a[i] = a[i + 1];
            }
            rear--;
            return front;
        } // 👈 Missing brace added here
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
