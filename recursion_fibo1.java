public class recursion_fibo1 {
    public static void f(int a, int b, int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        f(b,c,n-1);
    }
     
    public static void main(String args[])
    {
        int n=5;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        f(a,b,n-2);
    }
}
