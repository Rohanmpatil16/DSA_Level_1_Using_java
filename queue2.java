import java.util.*;

public class queue2{
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);  
        q.add(30);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}