import java.util.*;
public class reverse1_array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        int i,j;
        System.out.println("Enter the array:");

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        
        System.out.println("\nReverse the array:");
        for(j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]+"\t");
        }

    }
    
}
