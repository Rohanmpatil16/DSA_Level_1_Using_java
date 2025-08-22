public class rcursion_prime {
    public static void aa(int n,int i)
    {
        
        if(n<=1)
        {
            System.out.println("Not prime");
            return;
        }
        else if(n==2)
        {
            System.out.println("Prime Number");
            return;
        }
        else if(i*i>n)
        {
            System.out.println("Prime Number");
            return;
        }   
        else
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                return;
                }
                
            } 
            aa(n,i+1);  
        }
        
        

    
    public static void main(String args[])
    {
        int n=10;
        int i=2;
        aa(n, i);
    }
}
