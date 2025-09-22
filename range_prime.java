import java.util.*;
public class range_prime {
    public static void main(String args[])
    {
        System.out.println("Give the range so we give the prime number in between numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println();

        
        

        for(int i=a;i<=b;i++)
        {
            boolean isprime=true;
           if(i<=1)
           {
            isprime=false;
           }
           else
           {
            for(int j=2;j<i;j++)
            {
            if(i%j==0)
            {
                isprime=false;
                break;
            }
        }
    }
            
        if(isprime)
        {
            System.out.println(i);
        }
    }
    
}
}

