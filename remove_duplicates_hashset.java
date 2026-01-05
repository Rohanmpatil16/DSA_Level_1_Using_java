import java.util.*;

class remove_duplicates_hashset{

    static void ab(int a[])
    {
        HashSet<Integer> set=new HashSet<>();

        for(int num:a)
        {
            if(!set.add(num))
            {
                System.out.println(num);
            }
        }
    }
    public static void main(String args[])
    {
        int a[]={2,3,4,5,3,2,4,5,6,7,5,3};
        ab(a);

        
    }
}
