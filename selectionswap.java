public class selectionswap {
    public static void main(String args[])
    {
        int a[]={10,7,8,9,1,5};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
             

                }
               

            }
            
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }

    }
    
}
