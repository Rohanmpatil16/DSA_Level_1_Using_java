import java.util.*;
public class majorityelement{

    public static void main(String args[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]={2,1,2,2,1,3,4,4,1,};
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
            map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(int key:map.keySet())
        {
            if(map.get(key)>arr.length/4)
            {
                System.out.println("majority element is "+key);
            }
        }

    }
}