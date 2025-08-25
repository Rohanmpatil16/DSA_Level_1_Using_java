import java.util.*;
public class string_palidrome {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean isPalidrome=true;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                isPalidrome=false;
                break;
            }
        }
        if(isPalidrome)
        {
            System.out.println("String is Palidrome");
        }
        else
        {
            System.out.println("String is not Palidrome");
        }
    }
    
}
