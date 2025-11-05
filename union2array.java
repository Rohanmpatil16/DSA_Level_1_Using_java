import java.util.*;
public class union2array {
    public static void main(String args[])
    {
        HashSet<Integer> s=new HashSet<>();
        int a1[]={1,2,3,4,5};
        int a2[]={4,5,1,2,3,4,5};
        
        for(int i:a1)
        {
            s.add(i);
        }

        for(int i:a2)
        {
            s.add(i);
        }
        System.out.println("Union of arrays:"+s);
    }
}
