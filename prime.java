import java.util.*;
public class prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int a=0;
        while(a != -1)
          {
        System.out.println("Enter the Number to find prime or not:");
         a=sc.nextInt();

        
            if(a==-1)
            {
                System.out.println("program ended...");
                break;
            }
         boolean isprime=true;

         if(a<=1)
         {
            isprime=false;
         }
         else{
           
            
            for(int i=2;i<a/2;i++)
            {
                if(a%i==0)
                {
                   isprime=false;
                   break; 
                }

            }
        

         }
         if(isprime)
         {
            System.out.println("Number is prime "+a);
         }
         else{
            System.out.println("Number is not prime "+a);
         }
    }


    
}
}

