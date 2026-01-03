import java.util.*;
public class heap2{
    public static void main(String args[])
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        heap.add(10);
        heap.add(5);
        heap.add(20);
        System.out.println("Max-Heap elements in order:");
        while(!heap.isEmpty()){
            System.out.println(heap.poll());
        }
    }
}