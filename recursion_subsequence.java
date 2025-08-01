class recursion_subsequence{
    public static void s(String str,String newstr,int idx)
    {
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        
        char curr=str.charAt(idx);
    //To be
    s(str, newstr+curr, idx+1);
    
    //Not to be
    s(str, newstr, idx+1);        
    
    }
    public static void main(String args[])
    {
        String str="abc";
        String newstr="";
        s(str, newstr, 0);
    }
}