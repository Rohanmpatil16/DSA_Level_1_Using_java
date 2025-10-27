import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    System.out.println("HOW MANY TERMS OF FIBONACCI SERIES DO YOU WANT TO PRINT?");
    int n=sc.nextInt();
    System.out.println();
    int a=0;
    int b=1;
    for(int i=0;i<n;i++)
    {
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
    }

    
    }

    
}
