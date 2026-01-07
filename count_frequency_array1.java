import java.util.*;
public class count_frequency_array1 {

    public static void aa(HashMap<Integer,Integer> map,int arr[])
    {
        
        for(int num:arr)
        {
           if(map.containsKey(num))
           {
            map.put(num,map.get(num)+1);
           }
           else{
            map.put(num,1);
           }
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,1,1,2,3,4,5,6,7,8,9,9,9,9};
        HashMap<Integer,Integer>map=new HashMap<>();
       
        aa(map,arr);
        System.out.println("Frequency of elements in the array:"+map);
    }
}
