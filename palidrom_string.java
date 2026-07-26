package Day_5;

public class palidrom_string {

	public static void main(String[] args) {
		
		String p="mamn";
		
		int i=0;
		int j=p.length()-1;
		boolean s=true;
		
		while(i<j)
		{
			if(p.charAt(i)!=(p.charAt(j)))
			{
				s=false;
				break;
			}
			
			i++;
			j--;
		}
		if(s)
		{
			System.out.println("palidrom");
		}
		else {
			System.out.println("not palidrom");
		}
	}

}
