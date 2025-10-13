public class  multilevel{
    int x,y,z;
    void get()
        {
            x=20;
            y=30;
        }
        void dis()
        {
            z=x+y;
            System.out.println("Addition is="+z);
        }
        public static void main(String[] args) {
            multilevel2 o=new multilevel2();
            o.get();
            o.dis();
            o.dis1();   
            o.dis2();
        }
    
}
class multilevel1 extends multilevel
{
    void dis1()
    {
        z=x-y;
        System.out.println("Subtraction is="+z);
    }
}
class multilevel2 extends multilevel1
{
    void dis2()
    {
        z=x*y;
        System.out.println("Multiplication is="+z);
    }
   
}
