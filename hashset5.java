import java.util.*;
public class hashset5{
    public static void main(String args[])
    {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(2);
        s.add(4);
        s.add(5);
        System.out.println(s);

        s.remove(3);
        System.out.println(s);

        if(s.contains(2))
        {
            System.out.println("Set contains 2");
        }
        else
        {
            System.out.println("Set does not contain 2");
        }

        s.size();
        System.out.println("Size of set: " + s.size());

        //Iterator
        Iterator <Integer> it=s.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}