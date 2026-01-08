import java.util.*;
public class first_non_repeate_charHashmap {
    
    public static void m(String a)
    {
        HashMap<Character,Integer>map=new HashMap<>();

        for(char c:a.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else{
            map.put(c,1);
            }
        }
        for(char c:a.toCharArray())
        {
        if(map.get(c)==1)
        {
            System.out.println("non repeated char:"+c);
            return;
        }
    }
    System.out.println("No Repeating Char Found");

    }
    
    public static void main(String args[])
    {
        String a="aabbcddce";
        m(a);
        

    }    
}
