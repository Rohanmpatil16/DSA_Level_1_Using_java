import java.util.*;
public class fibo1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci series:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.err.println("Fibonacci series:");
        System.out.print(a+" "+b+" ");
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
    
}
