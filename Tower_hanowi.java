


public class Tower_hanowi{
    public static void poh(int n,char src,char hel,char des)
    {
        if(n==1)
        {
            System.out.println("Move disk from 1 " +src+ " to " +des);
            return;
        }
    
    poh(n-1,src,des,hel);
    System.out.println("Move disk from " + n + " " + src + " to " + des);
    poh(n-1,hel,src,des);
    }
    public static void main(String args[])
    {
        int n=3;
        //source,helper,destination
        poh(n,'A','B','C');
    }
}
