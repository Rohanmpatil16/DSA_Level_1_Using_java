public class quick{
    public static void quicksort(int a[],int l,int h)
    {
        if(l<h)
        {
            int p=partition(a,l,h);
            quicksort(a, l,p-1);
            quicksort(a, p+1, h);
        
        }
    }
    public static int partition(int a[],int l,int h)
    {
        int pivot=a[h];
        int i=l-1;
        for(int j=l;j<h;j++)
        {
            if(a[j]<=pivot)
          
            {
                  i++;
                int s=a[i];
                a[i]=a[j];
                a[j]=s;

            }

        }

        int s=a[i+1];
        a[i+1]=a[h];
        a[h]=s;

        return i+1;

    }
 public static void main(String args[])
 {
    int a[]={10, 7, 8, 9, 1, 5};
    quicksort(a,0,a.length-1);
    for (int x:a)
    {
        System.out.print(x+" ");
    }
 }
    
}
