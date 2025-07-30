
public class remove_duplicates_char_string{
    public static boolean[] map=new boolean[26];

    public static void rem(String str,int ind,String newstr)
    {
        if(ind==str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar=str.charAt(ind);
        if(map[currchar-'a'])
        {
            rem(str, ind+1, newstr);
        }
        else{
            newstr+=currchar;
            map[currchar-'a']=true;
            rem(str, ind+1, newstr);
        }
    }
    public static void main(String[] args) {
                map = new boolean[26];

        String str="aabsddjfdjcjanaxc";
        int ind=0;
        String newstr="";
        rem(str, ind, newstr);
    }

}
