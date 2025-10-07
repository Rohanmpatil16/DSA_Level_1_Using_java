import java.util.*;
public class array_list {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

       int e= list.get(0);
        System.out.println(e);

        list.add(1,4);
        System.out.println(list);

        


    }
}
