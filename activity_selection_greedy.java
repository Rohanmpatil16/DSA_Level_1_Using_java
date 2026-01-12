public class activity_selection_greedy {
    public static void main(String args[])
    {
        int start[]={1,3,0,5,8,5};
        int finsh[]={2,4,6,7,9,9};

        int i=0;
        System.out.println("Activity:"+i);
        for(int j=1;j<start.length;j++)
        {
            if(start[j]>=finsh[i])
            {
                System.out.println("Activity:"+j);
                i=j;
            }

        }
    }
    
}
