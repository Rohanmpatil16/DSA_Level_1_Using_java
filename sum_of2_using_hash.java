import java.util.*;

class sum_of2_using_hash{

    static boolean aaa(HashSet<Integer> a,int ab[],int k)
    {
        for(int num:ab)
        {
            int required=k-num;

            if(a.contains(required))
            {
                System.out.println("Pair found: "+num+" "+required);
                return true;
            }
            a.add(num);
        }
        return false;
    }
    public static void main(String args[])
    {
        HashSet<Integer> a=new HashSet<>();
        int ab[]={2,6,4,3};
        int k=6;
        boolean result=aaa(a,ab,k);
        System.out.println("Result: "+result);
    }
}