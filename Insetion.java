public class Insetion{
    public static void main(String[] args) {
            int arr[]={2,4,1,3,6,8};
            int i=1;
           
            for(i=1;i<arr.length;i++)
            {
                 int j=i-1;
                 int k=arr[i];
                while(j>=0 && arr[j]>k)
                {
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=k;
            }

            for(int n:arr)
            {
                System.out.print(n+" ");
            }
    }
}