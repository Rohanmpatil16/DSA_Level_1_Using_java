import java.util.*;
public class anagram_check {

    public static void a(String l1,String l2)
    {
        HashMap<Character,Integer>map=new HashMap<>();

        if(l1.length()!=l2.length())
        {
            System.out.println(false);
            return;
        }

        for(char c:l1.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char c:l2.toCharArray())
        {
            if(!map.containsKey(c) || map.get(c)==0)
            {
                System.out.println(false);
                return;
            }
            else{
                 map.put(c, map.get(c) - 1);
            }
            


        }
System.out.println(true);
    }
    public static void main(String args[])
{
    String l1="listen";
    String l2="silent";
    a(l1,l2);
    
}
}
