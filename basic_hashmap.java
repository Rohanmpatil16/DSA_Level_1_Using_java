import java.util.*;
public class basic_hashmap{
    public static void main(String args[])
    {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",150);
        map.put("China",160);
        map.put("USA",20);

        System.out.println(map);

        System.out.println("Print the value:"+map.get("India"));

        if(map.containsKey("India"))
        {
            System.out.println("Key Present in the map");
        }
        else
        {
            System.out.println("Key is not Present");
        }

        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}    