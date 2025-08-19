public class recursion_quickSort {
    public static void qs(int arr[],int l,int u)
    {
        if(l<u)
        {

            int pivot=sort(arr,  l, u);
            qs(arr,l,pivot-1);
            qs(arr,pivot+1,u);
        }
    }

    public static int sort(int arr[],int l,int u)
    {
        int pivot=arr[u];
        int j=l;
        int idx=l-1;

        for(j=l;j<u;j++)
        {
        if(arr[j]<pivot)
        {
            idx++;
           int temp=arr[idx];
           arr[idx]=arr[j];
           arr[j]=temp;
        }
    }

    int temp=arr[idx+1];
    arr[idx+1]=arr[u];
    arr[u]=temp;

    return idx+1;
    }
    public static void main(String args[])
    {
        int arr[]={4,2,5,7,3,6};
        
        int l=0;
        int u=arr.length-1;
        qs(arr, l, u);
        for(int val:arr)
        {
            System.out.print(+val+" ");
        }
    }
    
}
