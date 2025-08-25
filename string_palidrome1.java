import java.util.*;

public class string_palidrome1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);

        } 
        if(s.equals(r))
        {
            System.out.println("String is palidrome");
        }
        else{
            System.out.println("String is not palidrome");
        }

    }
    
}
