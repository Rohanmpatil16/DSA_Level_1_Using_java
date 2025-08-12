public class recursion_BinarySearch
{
    public static int bs(int arr[],int l,int u,int key)
    {
        if(l>u)
        {
            return -1 ;
        }
        

        if(l<=u)
        {
            int mid=(l+u)/2;
            if(key==arr[mid])
            {
                return mid;

            }
            if(key<arr[mid])
            {
                return bs(arr, l, mid-1, key);
            }
            else{
                return bs(arr, mid+1, u, key);
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int arr[]={1,4,6,8,9};
        int l=0;
        int u=arr.length-1;
        int key=8;
        int result=bs(arr, l, u, key);
        if(result == -1)
            System.out.println("Number not found");
        else
        System.out.println("Number found at index:"+result);
    }
}