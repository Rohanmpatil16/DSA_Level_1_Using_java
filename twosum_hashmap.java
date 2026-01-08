import java.util.*;
public class twosum_hashmap {

    public static void ab(int a[],int t)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int need=t-a[i];
            if(map.containsKey(need))
            {
                System.out.println(map.get(need)+" "+i);
                return;
            }
            map.put(a[i],i);
        }
    }
    public static void main(String args[])
    {
        int a[]={10,2,3,4,2};
        int t=4;
        ab(a,t);
    }
}
