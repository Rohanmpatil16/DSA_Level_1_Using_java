public class recursion_MergeSort
{
    public static void mergesort(int arr[],int l,int u)
    {
        if(l<u)
        {
            int mid=l+(u-l)/2;//divide array
            mergesort(arr, l, mid);//left part of array
            mergesort(arr, mid+1, u);//Right part array
            merge(arr, l, u,mid);//Acces whole array
        }

    }
    public static void merge(int arr[],int l,int u,int mid)
    {
        int temp[]=new int[u-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=u)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }

        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }

         while(j<=u)
        {
            temp[k++]=arr[j++];
          
        }

        for(int idx=0;idx<temp.length;idx++)
        {
            arr[idx+l]=temp[idx];
        }


    }
    public static void main(String args[])
    {
        int arr[]={34,66,32,2,44,56,78};
        int l=0;
        int u=arr.length-1;
        mergesort(arr, l, u);
        System.out.println("Sorted array is:");

        for(int val:arr)
        {
            System.out.print(val+" ");
        }


    }
}