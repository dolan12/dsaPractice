public class alikeStrings{
    public static void main(String args[]){
        System.out.println(halvesAreAlike("textbook"));
    }
    public static boolean halvesAreAlike(String s){
        int mid=s.length()/2;
        int first=0,second=0;
        for(int i=0;i<mid;i++){
            if(s.charAt(i)=='a'
            || s.charAt(i)=='e'
            || s.charAt(i)=='i'
            || s.charAt(i)=='o'
            || s.charAt(i)=='u'
            || s.charAt(i)=='A'
            || s.charAt(i)=='E'
            || s.charAt(i)=='I'
            || s.charAt(i)=='O'
            || s.charAt(i)=='U')
            first++;
        }
        if(s.length()%2!=0)
        mid++;
        for(int i=mid;i<s.length();i++){
            if(s.charAt(i)=='a'
            || s.charAt(i)=='e'
            || s.charAt(i)=='i'
            || s.charAt(i)=='o'
            || s.charAt(i)=='u'
            || s.charAt(i)=='A'
            || s.charAt(i)=='E'
            || s.charAt(i)=='I'
            || s.charAt(i)=='O'
            || s.charAt(i)=='U')
            second++;
        }
        if(first==second)
        return true;
        else
        return false;
    }
}