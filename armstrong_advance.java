import java.util.*;
public class armstrong_advance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find Armstrong:");
        int a=sc.nextInt();
        int rem;
        int n=String.valueOf(a).length();
        int arm=0;
        int c=a;
        while(a>0)
        {
            rem=a%10;
            arm+=Math.pow(rem, n);
            a=a/10;

        }
        if(c==arm)
        {
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("It is Not Armstrong");

        }
    }
    
}
