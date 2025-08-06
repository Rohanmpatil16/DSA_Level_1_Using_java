import java.util.*;
public class hashset_inersection {
    public static int ins(int a[],int b[]) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>intersection=new HashSet<>();
        int count=0;        
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        for(int j=0;j<b.length;j++)
        {
            if(set.contains(b[j]))//match
            {
                intersection.add(b[j]);
                count++;
                set.remove(b[j]);
            }
        }
        System.out.println("Intersection elements: " + intersection);
        return count;
    }
    public static void main(String args[])
    {
        int a[]={1,4,23,1,3,2,3,4};
        int b[]={2,3,51,23,4,2,1,3};
        int result=ins(a,b);
        System.out.println("Insertion element="+result);
       
    }
    
}
