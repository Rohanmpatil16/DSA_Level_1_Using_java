public class bubble {
    public static void main(String args[])
    {
        int i;
        int j;
        int swap=0;
        int arr[]={2,4,1,3,6,8};
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
            if(arr[j]>arr[j+1])
            {
                swap=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swap;
                
            }
            
        }
    }
        System.out.println("Sorted array:");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
