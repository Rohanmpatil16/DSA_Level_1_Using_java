public class recursion_fact {
    public static void fa(int i,int n,int fact)
    {
        if(i>n)
        {
            System.out.println("Factorial Num is:"+fact);
            return;
        }
        fa(i+1,n,fact*=i);
    }
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int fact=10;
        fa(i,n,fact);
    }
    
}
