public class linear {
    public static void main(String args[])
    {
        int a[]={10,7,8,9,1,5};
        int k=9;
        int i=0;
        boolean found=false;
        for( i=0;i<a.length-1;i++)
        {
            
                if(a[i]==k)
                {
                    System.out.println("k is at "+i+" position");
                    found=true;
                    break;
                }
                
        }
        if(found==false){
                    System.out.println("k is not found");
                }
                
    }
}
    

