import java.util.*;
public class count_frequency_array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Array is:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
                    int count=0;

            int x=arr[i];
            if(x==-1) // already counted
                continue;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==x)
                {
                count=count+1;
                arr[j]=-1; // to avoid counting again
                }
            }
             System.out.println("Frequency of "+ x +" is: "+count);

        }
    }
    
}
