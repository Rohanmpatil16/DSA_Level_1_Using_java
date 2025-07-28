public class find1st_andlast_occurence_string {
    public static int first=-1;
    public static int last=-1;
    public static void occurance(String str,char ele,int index){
    
    
        if(index==str.length())
        {
            return;
        }
        
        if(str.charAt(index)==ele){
        if(first==-1)
        {
            first=index;
        }
        else{
            last=index;
        }
    }
        occurance(str, ele, index+1);

    }
    public static void main(String args[])
    {
        String str="abscudacuha";
        char ele='a';
        occurance(str, ele, 0);
        System.out.println("First "+first);
        System.out.println("Last "+last);
    }    
}
