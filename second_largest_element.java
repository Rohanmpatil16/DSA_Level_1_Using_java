public class second_largest_element {
    public static void main(String[] args) {
        int a[]={5,3,6,3,1};
    //    Arrays.sort(a);
    //    System.out.println(a[3]);

   int l=Integer.MIN_VALUE;
   int secl=Integer.MIN_VALUE;
    for(int j=0;j<a.length;j++)
    {
       if(a[j]>l)
       {
        secl=l;
        l=a[j];

       }
       else if(a[j]>secl && a[j]!=l)
       {
        secl=a[j];
       }
    }
    System.out.println("Second largest is:"+secl);
    

       

    }
    
}
