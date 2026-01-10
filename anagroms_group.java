import java.util.*;
public class anagroms_group{
    public static void main(String args[])
    {
        HashMap<String,List<String>>map=new HashMap<>();
        String a[]={"eat","tea","tan","ate","nat","bat"};

        for(String ch:a)
        {
            char w[]=ch.toCharArray();
            Arrays.sort(w);
            String s=new String(w);

            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(ch);



        }
        System.out.println(map.values());
    }
}