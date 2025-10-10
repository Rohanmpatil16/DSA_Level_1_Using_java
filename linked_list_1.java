import java.util.*;
public class linked_list_1{
    public static void main(String args[])
    {
        LinkedList<String>list=new LinkedList<>();

        list.add("b");
        list.add("c");

        System.out.println(list);

        list.addFirst("a");
        list.addLast("d");

        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.remove("c");
        System.out.println(list);






    }

}