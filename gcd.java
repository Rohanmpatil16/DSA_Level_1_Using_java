import java.util.*;
public class gcd {
public static void main(String args[])
{
    System.out.println("Enter the two numbers to find GCD:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    while(a%b!=0)
    {
        int r=a%b;
        a=b;
        b=r;
    }
    System.out.println("GCD is:"+b);

}    
}
