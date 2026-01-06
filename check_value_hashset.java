import java.util.*;
class check_value_hashset
{
    public static void ab(HashSet<String>set,String value){
        if(set.contains(value))
        {
            System.out.println("Value found in the HashSet: " + value);
        }
        else
        {
            System.out.println("Value not found in the HashSet: " + value);
        }
    }
    public static void main(String args[])
    {
        HashSet<String>set=new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        String value="banana";
        ab(set,value);
    }

}