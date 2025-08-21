public class recursion_selectionSort{
    public static void ss(int arr[],int start)
    {
        if(start>=arr.length)
        {
            return;
        }

        int minIndex=start;
       for(int j=start+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }

            int temp=arr[start];
            arr[start]=arr[minIndex];
            arr[minIndex]=temp;

        ss(arr, start+1);


    }
        public static void main(String args[])
    {
        int arr[]={4,6,2,3,1,7,5};
        int start=0;
        ss(arr, start);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }

    }
}