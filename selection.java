public class selection{
    public static void main(String args[])
    {
        int i=0,j=0;
        int arr[]={2,4,1,3,6,8};

        for(i=0;i<arr.length-1;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}