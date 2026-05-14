abstract class a
{
	int a=10,b=10,c;
	void get()
	{
		c=a+b;
		
	}
	
	abstract void dis();
	{}
	
}
class b extends a
{
	void dis()
	{
		System.out.println(c);
	}
	
}
class abst
{
	public static void main(String args[])
	{
		b o=new b();
		o.get();
		o.dis();
	}
}