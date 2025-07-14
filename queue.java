import java.util.*;

public class queue {public static void main(String[] args) {
     Queue <Integer> que=new ArrayDeque<>();
     que.add(10);
     que.add(20);
     System.out.println("Queue Elements:"+que);
     que.remove();
     System.out.println("After Dequeue");
     System.out.println("Queue Elements:"+que);
   }
}
    

