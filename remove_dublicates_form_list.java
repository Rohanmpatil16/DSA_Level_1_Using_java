public class remove_dublicates_form_list {
    public static void main(String[] args) {
         
        int l1[]={10,20,40,60};
        int l2[]={30,40,50,70};

        int mer[]=new int[l1.length+l2.length];
        int k=0;
        for(int i=0;i<l1.length;i++)
        {
            mer[k++]=l1[i];

        }

        for(int j=0;j<l2.length;j++)
        {
            mer[k++]=l2[j];
        }

        System.out.println("Display merged string:");
        for(int i=0;i<mer.length;i++)
        {
            System.out.print(" "+mer[i]);
        }

        System.out.println("\nAfter removing Dublicates:");
        for(int i=0;i<mer.length;i++)
        {
            boolean isdublicate=false;
            {
                for(int j=0;j<i;j++)
                {
                    if(mer[i]==mer[j])
                    {
                        isdublicate=true;
                        break;
                    }
                }
                if(!isdublicate)
                {
                    System.out.print(" "+mer[i]);
                }
            }
        }
        
    }
    
}
