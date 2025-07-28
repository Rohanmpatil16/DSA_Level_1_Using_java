public class move_element_at_last {
    public static void x(String str,int count,int index,String s)
    {
        if(index==str.length()){
            for(int i=0;i<count;i++)
            {
                s +='x';
                }
                System.out.print("New String:"+s);
                return;
            
        }
        char c=str.charAt(index);
        if(c=='x')
        {
            count++;
            x(str, count, index+1, s);
        }
        else{
            s+=c;
            x(str, count, index+1, s);
        }
    }
    public static void main(String args[])
    {
        String str="abcxxasx";
        int count=0;
        int index=0;
        String s;
        x(str, count, index,"");
    }
    
}
