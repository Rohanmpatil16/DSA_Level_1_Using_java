public class recursion_prime{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }

        for(int i=2;i<=n/2;i++)
        {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
    }

    public static void printprime(int i,int n)
    {
        if(i>n)
        {
            return;
        }

        if(isprime(i))
        {
            System.out.println(i);
        }
        printprime(i+1,n);

    }
    public static void main(String args[])
    {
        int n=22;
        printprime(2,n);
    }
}