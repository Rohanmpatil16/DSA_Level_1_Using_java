import java.util.PriorityQueue;
public class kth_small_element_heap3 {

    static int find(PriorityQueue<Integer> heap, int k) {
        int result=-1;
        for(int i=0;i<=k;i++)
        {
            result=heap.poll();

        }
        return result;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer>heap=new PriorityQueue<>();
        heap.add(7);
        heap.add(10);
        heap.add(4);
        heap.add(3);
        heap.add(20);
        heap.add(15);

        int k=3;
        System.out.println("Kth smallest element is: "+find(heap,k-1));
    }
}