import java.util.*;
public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String r="";
        for(int i=0;i<s.length();i++)
        {
           String ch=String.valueOf(s.charAt(i));
            if(r.contains(ch))
            {
                continue;
            }
             r+=ch;

        }
        System.out.println(r);
       

        
    }
    
}
