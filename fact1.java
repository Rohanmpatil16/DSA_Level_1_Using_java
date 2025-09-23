import java.util.*;
public class fact1 {
  public static void main(String[] args) {
    


    Scanner sc=new Scanner(System.in);
    while(true)
    {
        int fact=1;
    int i=1;
    System.out.println("Enter the Numberer then find factorial number:");
    int n=sc.nextInt();

    if(n==-1)
    {
        System.out.println("Program ended...");
        break;

    }

    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println("Factorial number:"+fact);
  }  
}
}