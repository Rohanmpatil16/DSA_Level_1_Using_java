import java.util.*;
class setintersection{
    public static void main(String args[])  
    {
        HashSet<Integer> s=new HashSet<>();
        int a1[]={1,2,};
        int a2[]={4,5,1,2,3,4,5};

        for(int i:a1)
        {
            s.add(i);
        }
        for(int i:a2)
        {
            if(s.contains(i))
            {
                System.out.println("Intersection element:"+i);
                s.remove(i); 
            }
        }
        
    }
    
}
