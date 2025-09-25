public class list_find_dublicates {
    public static void main(String[] args) {
        int list1[]={10,20,30,40,50};
        int list2[]={20,80,40,50,70};
        int list3[]={40,10,20,80,50};

        System.out.println("Dublicates in All lists is:");

        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i]==list2[j])
                {
                    for(int k=0;k<list3.length;k++)
                    {
                        if(list1[i]==list3[k])
                        {
                            System.out.println(list1[i]);
                        }
                    }

                }


            }
        }


    }
    
}
