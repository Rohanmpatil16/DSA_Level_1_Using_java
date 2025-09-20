
import java.util.Arrays;

public class missing_value {
    public static void main(String args[])
    {
        int a[]={0,1,2,6,5,7,8};
        Arrays.sort(a);
        boolean flag=false;
        int e=0;
        for(int i=0;i<a.length;i++)
        {
            while(a[i]!=e)
            {
                System.out.println("Missing value "+e);
                flag=true;
                e++;
            }
            e++;

        }
        if(flag==false)
        {
            System.out.println("Not Missing value");
        }

    }
    
}
