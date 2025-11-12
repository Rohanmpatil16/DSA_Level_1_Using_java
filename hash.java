import java.util.*;

public class hash {
    public static void main(String[] args) {
       
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 60);
        map.put("Mango", 120);

        System.out.println("HashMap: " + map);

        System.out.println("Price of Mango: " + map.get("Mango"));

        map.remove("Banana");

        if (map.containsKey("Apple")) {
            System.out.println("Apple is available!");
        }

        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
