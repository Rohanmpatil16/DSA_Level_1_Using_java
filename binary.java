public class binary {

    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};int k=9;
        int h=a.length-1;
        int l=0;
        boolean found=false;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==k)
            {
                System.out.println("number found at position "+mid);
                found=true;
                break;
            }
            else if(k<a[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        if(found==false)
        {
            System.out.println("number not found");
        }


    }
}
;