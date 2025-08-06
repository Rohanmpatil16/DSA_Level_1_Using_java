import java.util.*;
public class hashset_union {
    public static int r(int a[],int b[])
    {
        HashSet<Integer> ab=new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            ab.add(a[i]);
        }

        for(int j=0;j<b.length;j++)
        {
            ab.add(b[j]);
        }
        System.out.print("The elements in the a array are: ");
        for(int ii:a)
        {
            System.out.print(ii + " ");
        }
        System.out.println();
        System.out.print("The elements in the b array are: ");
        for(int jj:b)
        {
            System.out.print(jj + " ");
        }
        System.out.println();
        System.out.println("The elements in the union are: " + ab);
        return ab.size();
        

    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        int b[]={2,1,23,45,64,4};
        System.out.println("The size of the union is: " + r(a, b));
    }
}
