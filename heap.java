import java.util.*;

class heap{
    public static void main(String args[])
    {
        PriorityQueue<Integer>heap=new PriorityQueue<>();

        heap.add(30);
        heap.add(27);
        heap.add(10);
        heap.add(38);

        System.out.println("Heap Structure:"+heap);
        System.out.println("Remove Smallest:"+heap.poll());
        System.out.println("After remve:"+heap);
    }
}