import java.util.*;
public class longest_subarray {
    //longest subarray whos sum of length isequal to 3
    public static void main(String args[]){
    HashMap<Integer,Integer>map=new HashMap<>();
        int a[]={1,-1,5,-2,3};
        int k=3;
        int sum=0;
        int maxlen=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum==k)
            {
                if(i+1>maxlen){
                maxlen=i;}
            }

            if(map.containsKey(sum-k))
            {
                int len=i-map.get(sum-k);
                if(len>maxlen)
                {
                    maxlen=len;
                }
            }
            if (!map.containsKey(sum)) {
            map.put(sum, i);

           
}
 
}
System.out.println(maxlen);


}
}
