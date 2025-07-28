public class arr_is_sorrted_or_not {
    public static boolean sor(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;
        }
        
        return sor(arr, index+1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1};
        int index=0;
        boolean result = sor(arr, index);
        System.out.println(result);
    }
}
