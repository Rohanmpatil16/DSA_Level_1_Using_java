
class reverse{
    static void ff(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" "); 
        ff(n-1);
    }
    public static void main(String args[])
    {
        int n=5;
        ff(n);
        
    }
}