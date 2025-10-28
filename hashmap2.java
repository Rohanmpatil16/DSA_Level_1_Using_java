import java.util.*;
public class hashmap2{
    public static void main(String args[])
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Banana",5);
        System.out.println(map);

        map.remove("Orange");
        
        if(map.containsKey("Banana"))
        {
            System.out.println("Map contains key Banana");
        }

        System.out.println("Print only Keys:");
        for(String key:map.keySet()){
            System.out.println(key);
        }

        System.out.println("Print only Values:");
        for(int val:map.values())
        {
            System.out.println(val);
        }

        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey()+"->"+e.getValue());
        }

        
        System.out.println("Size of map: " + map.size());
    }
}