import java.util.*;
public class hashmap {
    public static void main(String args[])
    {
        HashMap<Integer,String>map=new HashMap<>();
        
        map.put(1,"rohan");
        map.put(2,"ranjit");
        map.put(3,"moin");
       

        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.get(1));
        map.replace(2,"ram");
        
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
