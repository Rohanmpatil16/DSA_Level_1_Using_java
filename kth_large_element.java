import java.util.*;
public class kth_large_element{

    static int insert(PriorityQueue<Integer> heap, int k)
    {
        int result=0;
        for(int i=1;i<=k;i++)
        {
            result=heap.poll();
        }
        return result;
    }
    
    
    public static void main(String args[])
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        heap.add(30);
        heap.add(10);
        heap.add(20);
        heap.add(50);
        heap.add(70);

        int k=2;
        System.out.println("Kth largest element is: "+insert(heap,k));
    }
}