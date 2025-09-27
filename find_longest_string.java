public class find_longest_string {
    public static void main(String args[])
    {
        String s="Rohan Machindra Patil";
        
        String longword="";
        String currword="";
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                currword+=c;
            }
            else
            {
                if(currword.length()>longword.length())
                {
                    longword=currword;
                }
                currword="";
            }
        }
        if(currword.length()>longword.length())
        {
            longword=currword;
        }
        System.out.println("Longest word: "+longword);
    }
    
}
