public class subarray {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int k=5;

        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum+=a[j];
                if(sum==k)
                {
                    System.out.print("[");
                    for(int p=i;p<=j;p++)
                    {
                        System.out.print(" "+a[p]);
                    }
                    System.out.print("],");
                }
            }
        }

    }
}
